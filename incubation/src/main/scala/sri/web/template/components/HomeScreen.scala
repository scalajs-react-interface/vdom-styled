//package sri.web.template.components
//
//import org.scalajs.dom
//import sri.core._
//import sri.web.template.styles.GlobalStyle
//import sri.web.vdom.tags._
//import sri.scalacss.Defaults._
//import sri.web.vdom.{CreateDOMElement, DOMProps, SyntheticEvent}
//
//import scala.scalajs.js.annotation.ScalaJSDefined
//import scala.scalajs.js
//
//@ScalaJSDefined
//trait A extends js.Object
//
//@ScalaJSDefined
//class HomeScreen extends ComponentS[HomeScreen.State] {
//
//  import HomeScreen._
//
//  initialState(State("sri"))
//
//  def render() = {
//    div(className = GlobalStyle.flexOneAndCenter)(
//      span(className = GlobalStyle.bigText)("Home Screen"),
//      input(value = state.text, onChange = onTextChange _),
//      input2
//      //StyledTagsComTest(StyledTagsComTest.Props(() => state, _setState))
//    )
//  }
//
//  def _setState(s: State): Unit = setState(_ => s)
//
//
//  val input2 = CreateDOMElement("input", attr)
//  def attr = {
//    val domProps = new A {
//      val className = "some class name4"
//      val value = state.text
//      val onChange: js.UndefOr[js.Function1[_ <: SyntheticEvent[_], _]] =
//        js.UndefOr.any2undefOrA((e: ReactEventI) => ())
//    }
//    dom.window.console.dir(domProps)
//    domProps
//  }
//
//
//  def onTextChange(e: ReactEventI) = {
//    val value = e.target.value
//    dom.window.console.log(value)
//    setState((state: State) => state.copy(text = value))
//  }
//}
//
//object HomeScreen {
//
//  case class State(text: String)
//
//  def apply() = CreateElementNoProps[HomeScreen]()
//
//}
