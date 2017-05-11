package sri.web.template

import org.scalajs.dom
import sri.web.ReactDOM
import sri.web.template.components.{StyledTagsComTest}
import sri.web.template.styles.AppStyles

import scala.scalajs.js.JSApp
import scala.util.Random

object WebApp extends JSApp {

  def main(): Unit = {
    AppStyles.load()
    ReactDOM.render(StyledTagsComTest(), dom.document.getElementById("app"))
    println("[info] Client rendering completed." + Random.nextInt())
  }

}
