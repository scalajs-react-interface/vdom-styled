package sri.macros.web

import sri.web.vdom.{DOMProps, SyntheticEvent}

import scala.language.experimental.macros
import scala.reflect.macros.whitebox
import scala.scalajs.js.annotation.ScalaJSDefined


trait TypedProp[+A]
private case object DummyProp extends TypedProp[Nothing]

@ScalaJSDefined
class ConcreteDOMProps extends DOMProps

private object MacroImpl {

  trait VarOrVal
  case object Var extends VarOrVal
  case object Val extends VarOrVal

  def domChooseImpl(c: whitebox.Context)(props: c.Tree*)(children: c.Tree*): c.Tree = {
    import c.universe._
    val domName = c.macroApplication.symbol.asTerm.name
    if (props.nonEmpty) {
      val allProps = parseProps(c)(props)
      val varProps = allProps.filter(_._2 == Var).map(_._1)
      val valProps = allProps.filter(_._2 == Val).map(_._1)
      q"""
       {
         val domProps = new sri.macros.web.ConcreteDOMProps {
           ..$valProps
         }
         ..$varProps
         sri.web.vdom.tags.$domName(domProps)(..$children)
       }
       """
    }
    else {
      q"""
       {
         sri.web.vdom.tags.$domName()(..$children)
       }
       """
    }
  }

  def domChooseNoChildrenImpl(c: whitebox.Context)(props: c.Tree*): c.Tree = {
    import c.universe._
    val domName = c.macroApplication.symbol.asTerm.name
    val t = if (props.nonEmpty) {
      val allProps = parseProps(c)(props)
      val varProps = allProps.filter(_._2 == Var).map(_._1)
      val valProps = allProps.filter(_._2 == Val).map(_._1)
      q"""
       {
         val domProps = new sri.macros.web.ConcreteDOMProps {
           ..$valProps
         }
         ..$varProps
         sri.web.vdom.tags.$domName(domProps)
       }
       """
    }
    else {
      q"""
       {
         sri.web.vdom.tags.$domName()
       }
       """
    }
    println("macro-"+showCode(t))
    t
  }

  private def parseProps(c: whitebox.Context)(props: Seq[c.Tree]): Seq[(c.Tree, VarOrVal)] = {
    import c.universe._
    val allProps = props.map {
      case q"$propName := $propValue" =>
        val propTermName = propName.symbol.asTerm.name
        isVar(c)(propTermName.decodedName.toString) match {
          case Var => (q"""domProps.$propTermName = $propValue""", Var)
          case Val => (q"""override val $propTermName = $propValue""", Val)
        }
    }
    //allProps.foreach(t=>println("macro-"+showCode(t._1)))
    allProps
  }

  private def isVar(c: whitebox.Context)(propName: String): VarOrVal = {
    //println(s"[macro]PropName is $propName.")
    val tpe = c.typeOf[DOMProps]
    tpe.members.filter(_.isMethod).find(_.asMethod.name.toString == propName) match {
      case Some(v) if v.asMethod.isVal => Val
      case Some(v) if v.asMethod.isVar => Var
      case None => c.abort(c.enclosingPosition, s"Cannot find field[$propName] in DOMProprs")
    }
  }
}