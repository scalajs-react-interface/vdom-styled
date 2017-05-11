package sri.web.vdom

import org.scalajs.dom

import scala.scalajs.js

object Test1 extends js.JSApp{
  override def main(): Unit = {
    val v1 = js.Dynamic.literal(props = (s:String) => println(s))
    dom.window.console.dir(v1)
  }
}
