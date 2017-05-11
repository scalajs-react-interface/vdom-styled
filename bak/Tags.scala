package sri.web.vdom

import org.scalajs.dom
import sri.core._
import sri.macros.{
  FunctionObjectMacro,
  exclude,
  OptDefault => NoValue,
  OptionalParam => U
}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.Dynamic.{literal => json}
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.`|`

trait Tags extends ReactEventAliases {

  @inline
  def solidcolor[T <: dom.Node](style: U[js.Any] = NoValue,
                                id: U[String] = NoValue,
                                className: U[String] = NoValue,
                                @exclude key: String | Int = null,
                                @exclude ref: js.Function1[T, Unit] = null,
                                @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("solidcolor", props, children = children.toJSArray)
  }

  @inline
  def solidcolor(children: ReactNode*): ReactElement =
    CreateDOMElement("solidcolor", json(), children = children.toJSArray)

  @inline
  def big[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("big", props, children = children.toJSArray)
  }

  @inline
  def big(children: ReactNode*): ReactElement =
    CreateDOMElement("big", json(), children = children.toJSArray)

  @inline
  def tr[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("tr", props, children = children.toJSArray)
  }

  @inline
  def tr(children: ReactNode*): ReactElement =
    CreateDOMElement("tr", json(), children = children.toJSArray)

  @inline
  def cite[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("cite", props, children = children.toJSArray)
  }

  @inline
  def cite(children: ReactNode*): ReactElement =
    CreateDOMElement("cite", json(), children = children.toJSArray)

  @inline
  def html[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("html", props, children = children.toJSArray)
  }

  @inline
  def html(children: ReactNode*): ReactElement =
    CreateDOMElement("html", json(), children = children.toJSArray)

  @inline
  def footer[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("footer", props, children = children.toJSArray)
  }

  @inline
  def footer(children: ReactNode*): ReactElement =
    CreateDOMElement("footer", json(), children = children.toJSArray)

  @inline
  def h4[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h4", props, children = children.toJSArray)
  }

  @inline
  def h4(children: ReactNode*): ReactElement =
    CreateDOMElement("h4", json(), children = children.toJSArray)

  @inline
  def caption[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("caption", props, children = children.toJSArray)
  }

  @inline
  def caption(children: ReactNode*): ReactElement =
    CreateDOMElement("caption", json(), children = children.toJSArray)

  @inline
  def datalist[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("datalist", props, children = children.toJSArray)
  }

  @inline
  def datalist(children: ReactNode*): ReactElement =
    CreateDOMElement("datalist", json(), children = children.toJSArray)

  @inline
  def header[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("header", props, children = children.toJSArray)
  }

  @inline
  def header(children: ReactNode*): ReactElement =
    CreateDOMElement("header", json(), children = children.toJSArray)

  @inline
  def wbr[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("wbr", props)
  }

  @inline
  def canvas[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("canvas", props, children = children.toJSArray)
  }

  @inline
  def canvas(children: ReactNode*): ReactElement =
    CreateDOMElement("canvas", json(), children = children.toJSArray)

  @inline
  def base[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("base", props)
  }

  @inline
  def source[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("source", props)
  }

  @inline
  def feFuncB[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFuncB", props, children = children.toJSArray)
  }

  @inline
  def feFuncB(children: ReactNode*): ReactElement =
    CreateDOMElement("feFuncB", json(), children = children.toJSArray)

  @inline
  def b[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("b", props, children = children.toJSArray)
  }

  @inline
  def b(children: ReactNode*): ReactElement =
    CreateDOMElement("b", json(), children = children.toJSArray)

  @inline
  def mesh[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("mesh", props, children = children.toJSArray)
  }

  @inline
  def mesh(children: ReactNode*): ReactElement =
    CreateDOMElement("mesh", json(), children = children.toJSArray)

  @inline
  def table[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("table", props, children = children.toJSArray)
  }

  @inline
  def table(children: ReactNode*): ReactElement =
    CreateDOMElement("table", json(), children = children.toJSArray)

  @inline
  def style[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("style", props, children = children.toJSArray)
  }

  @inline
  def style(children: ReactNode*): ReactElement =
    CreateDOMElement("style", json(), children = children.toJSArray)

  @inline
  def title[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("title", props, children = children.toJSArray)
  }

  @inline
  def title(children: ReactNode*): ReactElement =
    CreateDOMElement("title", json(), children = children.toJSArray)

  @inline
  def keygen[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("keygen", props)
  }

  @inline
  def tfoot[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("tfoot", props, children = children.toJSArray)
  }

  @inline
  def tfoot(children: ReactNode*): ReactElement =
    CreateDOMElement("tfoot", json(), children = children.toJSArray)

  @inline
  def view[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("view", props, children = children.toJSArray)
  }

  @inline
  def view(children: ReactNode*): ReactElement =
    CreateDOMElement("view", json(), children = children.toJSArray)

  @inline
  def area[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("area", props)
  }

  @inline
  def details[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("details", props, children = children.toJSArray)
  }

  @inline
  def details(children: ReactNode*): ReactElement =
    CreateDOMElement("details", json(), children = children.toJSArray)

  @inline
  def feDistantLight[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feDistantLight", props, children = children.toJSArray)
  }

  @inline
  def feDistantLight(children: ReactNode*): ReactElement =
    CreateDOMElement("feDistantLight", json(), children = children.toJSArray)

  @inline
  def hgroup[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("hgroup", props, children = children.toJSArray)
  }

  @inline
  def hgroup(children: ReactNode*): ReactElement =
    CreateDOMElement("hgroup", json(), children = children.toJSArray)

  @inline
  def hr[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("hr", props)
  }

  @inline
  def q[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("q", props, children = children.toJSArray)
  }

  @inline
  def q(children: ReactNode*): ReactElement =
    CreateDOMElement("q", json(), children = children.toJSArray)

  @inline
  def meshpatch[T <: dom.Node](style: U[js.Any] = NoValue,
                               id: U[String] = NoValue,
                               className: U[String] = NoValue,
                               @exclude key: String | Int = null,
                               @exclude ref: js.Function1[T, Unit] = null,
                               @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meshpatch", props, children = children.toJSArray)
  }

  @inline
  def meshpatch(children: ReactNode*): ReactElement =
    CreateDOMElement("meshpatch", json(), children = children.toJSArray)

  @inline
  def legend[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("legend", props, children = children.toJSArray)
  }

  @inline
  def legend(children: ReactNode*): ReactElement =
    CreateDOMElement("legend", json(), children = children.toJSArray)

  @inline
  def feTurbulence[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feTurbulence", props, children = children.toJSArray)
  }

  @inline
  def feTurbulence(children: ReactNode*): ReactElement =
    CreateDOMElement("feTurbulence", json(), children = children.toJSArray)

  @inline
  def set[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("set", props, children = children.toJSArray)
  }

  @inline
  def set(children: ReactNode*): ReactElement =
    CreateDOMElement("set", json(), children = children.toJSArray)

  @inline
  def link[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("link", props)
  }

  @inline
  def meshgradient[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meshgradient", props, children = children.toJSArray)
  }

  @inline
  def meshgradient(children: ReactNode*): ReactElement =
    CreateDOMElement("meshgradient", json(), children = children.toJSArray)

  @inline
  def del[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("del", props, children = children.toJSArray)
  }

  @inline
  def del(children: ReactNode*): ReactElement =
    CreateDOMElement("del", json(), children = children.toJSArray)

  @inline
  def line[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("line", props, children = children.toJSArray)
  }

  @inline
  def line(children: ReactNode*): ReactElement =
    CreateDOMElement("line", json(), children = children.toJSArray)

  @inline
  def rt[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("rt", props, children = children.toJSArray)
  }

  @inline
  def rt(children: ReactNode*): ReactElement =
    CreateDOMElement("rt", json(), children = children.toJSArray)

  @inline
  def map[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("map", props, children = children.toJSArray)
  }

  @inline
  def map(children: ReactNode*): ReactElement =
    CreateDOMElement("map", json(), children = children.toJSArray)

  @inline
  def fieldset[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("fieldset", props, children = children.toJSArray)
  }

  @inline
  def fieldset(children: ReactNode*): ReactElement =
    CreateDOMElement("fieldset", json(), children = children.toJSArray)

  @inline
  def menu[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("menu", props, children = children.toJSArray)
  }

  @inline
  def menu(children: ReactNode*): ReactElement =
    CreateDOMElement("menu", json(), children = children.toJSArray)

  @inline
  def polygon[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("polygon", props, children = children.toJSArray)
  }

  @inline
  def polygon(children: ReactNode*): ReactElement =
    CreateDOMElement("polygon", json(), children = children.toJSArray)

  @inline
  def ol[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ol", props, children = children.toJSArray)
  }

  @inline
  def ol(children: ReactNode*): ReactElement =
    CreateDOMElement("ol", json(), children = children.toJSArray)

  @inline
  def unknown[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("unknown", props, children = children.toJSArray)
  }

  @inline
  def unknown(children: ReactNode*): ReactElement =
    CreateDOMElement("unknown", json(), children = children.toJSArray)

  @inline
  def tbody[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("tbody", props, children = children.toJSArray)
  }

  @inline
  def tbody(children: ReactNode*): ReactElement =
    CreateDOMElement("tbody", json(), children = children.toJSArray)

  @inline
  def feDiffuseLighting[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feDiffuseLighting", props, children = children.toJSArray)
  }

  @inline
  def feDiffuseLighting(children: ReactNode*): ReactElement =
    CreateDOMElement("feDiffuseLighting",
                     json(),
                     children = children.toJSArray)

  @inline
  def feImage[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feImage", props, children = children.toJSArray)
  }

  @inline
  def feImage(children: ReactNode*): ReactElement =
    CreateDOMElement("feImage", json(), children = children.toJSArray)

  @inline
  def pre[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("pre", props, children = children.toJSArray)
  }

  @inline
  def pre(children: ReactNode*): ReactElement =
    CreateDOMElement("pre", json(), children = children.toJSArray)

  @inline
  def filter[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("filter", props, children = children.toJSArray)
  }

  @inline
  def filter(children: ReactNode*): ReactElement =
    CreateDOMElement("filter", json(), children = children.toJSArray)

  @inline
  def optgroup[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("optgroup", props, children = children.toJSArray)
  }

  @inline
  def optgroup(children: ReactNode*): ReactElement =
    CreateDOMElement("optgroup", json(), children = children.toJSArray)

  @inline
  def mask[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("mask", props, children = children.toJSArray)
  }

  @inline
  def mask(children: ReactNode*): ReactElement =
    CreateDOMElement("mask", json(), children = children.toJSArray)

  @inline
  def embed[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("embed", props)
  }

  @inline
  def u[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("u", props, children = children.toJSArray)
  }

  @inline
  def u(children: ReactNode*): ReactElement =
    CreateDOMElement("u", json(), children = children.toJSArray)

  @inline
  def image[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("image", props, children = children.toJSArray)
  }

  @inline
  def image(children: ReactNode*): ReactElement =
    CreateDOMElement("image", json(), children = children.toJSArray)

  @inline
  def select[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("select", props, children = children.toJSArray)
  }

  @inline
  def select(children: ReactNode*): ReactElement =
    CreateDOMElement("select", json(), children = children.toJSArray)

  @inline
  def s[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("s", props, children = children.toJSArray)
  }

  @inline
  def s(children: ReactNode*): ReactElement =
    CreateDOMElement("s", json(), children = children.toJSArray)

  @inline
  def use[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("use", props, children = children.toJSArray)
  }

  @inline
  def use(children: ReactNode*): ReactElement =
    CreateDOMElement("use", json(), children = children.toJSArray)

  @inline
  def input[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      onChange: U[ReactEventI => _] = NoValue,
      value: U[String | Int | Double] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    import sri.universal.DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("input", props)
  }

  @inline
  def thead[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("thead", props, children = children.toJSArray)
  }

  @inline
  def thead(children: ReactNode*): ReactElement =
    CreateDOMElement("thead", json(), children = children.toJSArray)

  @inline
  def feMergeNode[T <: dom.Node](style: U[js.Any] = NoValue,
                                 id: U[String] = NoValue,
                                 className: U[String] = NoValue,
                                 @exclude key: String | Int = null,
                                 @exclude ref: js.Function1[T, Unit] = null,
                                 @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feMergeNode", props, children = children.toJSArray)
  }

  @inline
  def feMergeNode(children: ReactNode*): ReactElement =
    CreateDOMElement("feMergeNode", json(), children = children.toJSArray)

  @inline
  def h6[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h6", props, children = children.toJSArray)
  }

  @inline
  def h6(children: ReactNode*): ReactElement =
    CreateDOMElement("h6", json(), children = children.toJSArray)

  @inline
  def abbr[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("abbr", props, children = children.toJSArray)
  }

  @inline
  def abbr(children: ReactNode*): ReactElement =
    CreateDOMElement("abbr", json(), children = children.toJSArray)

  @inline
  def meshrow[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meshrow", props, children = children.toJSArray)
  }

  @inline
  def meshrow(children: ReactNode*): ReactElement =
    CreateDOMElement("meshrow", json(), children = children.toJSArray)

  @inline
  def td[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("td", props, children = children.toJSArray)
  }

  @inline
  def td(children: ReactNode*): ReactElement =
    CreateDOMElement("td", json(), children = children.toJSArray)

  @inline
  def em[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("em", props, children = children.toJSArray)
  }

  @inline
  def em(children: ReactNode*): ReactElement =
    CreateDOMElement("em", json(), children = children.toJSArray)

  @inline
  def feFlood[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFlood", props, children = children.toJSArray)
  }

  @inline
  def feFlood(children: ReactNode*): ReactElement =
    CreateDOMElement("feFlood", json(), children = children.toJSArray)

  @inline
  def svg[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("svg", props, children = children.toJSArray)
  }

  @inline
  def svg(children: ReactNode*): ReactElement =
    CreateDOMElement("svg", json(), children = children.toJSArray)

  @inline
  def colgroup[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("colgroup", props, children = children.toJSArray)
  }

  @inline
  def colgroup(children: ReactNode*): ReactElement =
    CreateDOMElement("colgroup", json(), children = children.toJSArray)

  @inline
  def track[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("track", props)
  }

  @inline
  def bdo[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("bdo", props, children = children.toJSArray)
  }

  @inline
  def bdo(children: ReactNode*): ReactElement =
    CreateDOMElement("bdo", json(), children = children.toJSArray)

  @inline
  def circle[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("circle", props, children = children.toJSArray)
  }

  @inline
  def circle(children: ReactNode*): ReactElement =
    CreateDOMElement("circle", json(), children = children.toJSArray)

  @inline
  def time[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("time", props, children = children.toJSArray)
  }

  @inline
  def time(children: ReactNode*): ReactElement =
    CreateDOMElement("time", json(), children = children.toJSArray)

  @inline
  def feBlend[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feBlend", props, children = children.toJSArray)
  }

  @inline
  def feBlend(children: ReactNode*): ReactElement =
    CreateDOMElement("feBlend", json(), children = children.toJSArray)

  @inline
  def ul[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ul", props, children = children.toJSArray)
  }

  @inline
  def ul(children: ReactNode*): ReactElement =
    CreateDOMElement("ul", json(), children = children.toJSArray)

  @inline
  def body[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("body", props, children = children.toJSArray)
  }

  @inline
  def body(children: ReactNode*): ReactElement =
    CreateDOMElement("body", json(), children = children.toJSArray)

  @inline
  def output[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("output", props, children = children.toJSArray)
  }

  @inline
  def output(children: ReactNode*): ReactElement =
    CreateDOMElement("output", json(), children = children.toJSArray)

  @inline
  def feOffset[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feOffset", props, children = children.toJSArray)
  }

  @inline
  def feOffset(children: ReactNode*): ReactElement =
    CreateDOMElement("feOffset", json(), children = children.toJSArray)

  @inline
  def `var`[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("var", props, children = children.toJSArray)
  }

  @inline
  def `var`(children: ReactNode*): ReactElement =
    CreateDOMElement("var", json(), children = children.toJSArray)

  @inline
  def progress[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("progress", props, children = children.toJSArray)
  }

  @inline
  def progress(children: ReactNode*): ReactElement =
    CreateDOMElement("progress", json(), children = children.toJSArray)

  @inline
  def h1[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h1", props, children = children.toJSArray)
  }

  @inline
  def h1(children: ReactNode*): ReactElement =
    CreateDOMElement("h1", json(), children = children.toJSArray)

  @inline
  def figcaption[T <: dom.Node](style: U[js.Any] = NoValue,
                                id: U[String] = NoValue,
                                className: U[String] = NoValue,
                                @exclude key: String | Int = null,
                                @exclude ref: js.Function1[T, Unit] = null,
                                @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("figcaption", props, children = children.toJSArray)
  }

  @inline
  def figcaption(children: ReactNode*): ReactElement =
    CreateDOMElement("figcaption", json(), children = children.toJSArray)

  @inline
  def stop[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("stop", props, children = children.toJSArray)
  }

  @inline
  def stop(children: ReactNode*): ReactElement =
    CreateDOMElement("stop", json(), children = children.toJSArray)

  @inline
  def defs[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("defs", props, children = children.toJSArray)
  }

  @inline
  def defs(children: ReactNode*): ReactElement =
    CreateDOMElement("defs", json(), children = children.toJSArray)

  @inline
  def iframe[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("iframe", props, children = children.toJSArray)
  }

  @inline
  def iframe(children: ReactNode*): ReactElement =
    CreateDOMElement("iframe", json(), children = children.toJSArray)

  @inline
  def small[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("small", props, children = children.toJSArray)
  }

  @inline
  def small(children: ReactNode*): ReactElement =
    CreateDOMElement("small", json(), children = children.toJSArray)

  @inline
  def textPath[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("textPath", props, children = children.toJSArray)
  }

  @inline
  def textPath(children: ReactNode*): ReactElement =
    CreateDOMElement("textPath", json(), children = children.toJSArray)

  @inline
  def picture[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("picture", props, children = children.toJSArray)
  }

  @inline
  def picture(children: ReactNode*): ReactElement =
    CreateDOMElement("picture", json(), children = children.toJSArray)

  @inline
  def a[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("a", props, children = children.toJSArray)
  }

  @inline
  def a(children: ReactNode*): ReactElement =
    CreateDOMElement("a", json(), children = children.toJSArray)

  @inline
  def meta[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meta", props)
  }

  @inline
  def article[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("article", props, children = children.toJSArray)
  }

  @inline
  def article(children: ReactNode*): ReactElement =
    CreateDOMElement("article", json(), children = children.toJSArray)

  @inline
  def blockquote[T <: dom.Node](style: U[js.Any] = NoValue,
                                id: U[String] = NoValue,
                                className: U[String] = NoValue,
                                @exclude key: String | Int = null,
                                @exclude ref: js.Function1[T, Unit] = null,
                                @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("blockquote", props, children = children.toJSArray)
  }

  @inline
  def blockquote(children: ReactNode*): ReactElement =
    CreateDOMElement("blockquote", json(), children = children.toJSArray)

  @inline
  def fePointLight[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("fePointLight", props, children = children.toJSArray)
  }

  @inline
  def fePointLight(children: ReactNode*): ReactElement =
    CreateDOMElement("fePointLight", json(), children = children.toJSArray)

  @inline
  def feFuncA[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFuncA", props, children = children.toJSArray)
  }

  @inline
  def feFuncA(children: ReactNode*): ReactElement =
    CreateDOMElement("feFuncA", json(), children = children.toJSArray)

  @inline
  def bdi[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("bdi", props, children = children.toJSArray)
  }

  @inline
  def bdi(children: ReactNode*): ReactElement =
    CreateDOMElement("bdi", json(), children = children.toJSArray)

  @inline
  def li[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("li", props, children = children.toJSArray)
  }

  @inline
  def li(children: ReactNode*): ReactElement =
    CreateDOMElement("li", json(), children = children.toJSArray)

  @inline
  def cursor[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("cursor", props, children = children.toJSArray)
  }

  @inline
  def cursor(children: ReactNode*): ReactElement =
    CreateDOMElement("cursor", json(), children = children.toJSArray)

  @inline
  def h5[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h5", props, children = children.toJSArray)
  }

  @inline
  def h5(children: ReactNode*): ReactElement =
    CreateDOMElement("h5", json(), children = children.toJSArray)

  @inline
  def col[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("col", props)
  }

  @inline
  def dialog[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dialog", props, children = children.toJSArray)
  }

  @inline
  def dialog(children: ReactNode*): ReactElement =
    CreateDOMElement("dialog", json(), children = children.toJSArray)

  @inline
  def kbd[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("kbd", props, children = children.toJSArray)
  }

  @inline
  def kbd(children: ReactNode*): ReactElement =
    CreateDOMElement("kbd", json(), children = children.toJSArray)

  @inline
  def nav[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("nav", props, children = children.toJSArray)
  }

  @inline
  def nav(children: ReactNode*): ReactElement =
    CreateDOMElement("nav", json(), children = children.toJSArray)

  @inline
  def aside[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("aside", props, children = children.toJSArray)
  }

  @inline
  def aside(children: ReactNode*): ReactElement =
    CreateDOMElement("aside", json(), children = children.toJSArray)

  @inline
  def animateTransform[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("animateTransform", props, children = children.toJSArray)
  }

  @inline
  def animateTransform(children: ReactNode*): ReactElement =
    CreateDOMElement("animateTransform", json(), children = children.toJSArray)

  @inline
  def g[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("g", props, children = children.toJSArray)
  }

  @inline
  def g(children: ReactNode*): ReactElement =
    CreateDOMElement("g", json(), children = children.toJSArray)

  @inline
  def span[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("span", props, children = children.toJSArray)
  }

  @inline
  def span(children: ReactNode*): ReactElement =
    CreateDOMElement("span", json(), children = children.toJSArray)

  @inline
  def ellipse[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ellipse", props, children = children.toJSArray)
  }

  @inline
  def ellipse(children: ReactNode*): ReactElement =
    CreateDOMElement("ellipse", json(), children = children.toJSArray)

  @inline
  def feSpotLight[T <: dom.Node](style: U[js.Any] = NoValue,
                                 id: U[String] = NoValue,
                                 className: U[String] = NoValue,
                                 @exclude key: String | Int = null,
                                 @exclude ref: js.Function1[T, Unit] = null,
                                 @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feSpotLight", props, children = children.toJSArray)
  }

  @inline
  def feSpotLight(children: ReactNode*): ReactElement =
    CreateDOMElement("feSpotLight", json(), children = children.toJSArray)

  @inline
  def feFuncG[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFuncG", props, children = children.toJSArray)
  }

  @inline
  def feFuncG(children: ReactNode*): ReactElement =
    CreateDOMElement("feFuncG", json(), children = children.toJSArray)

  @inline
  def th[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("th", props, children = children.toJSArray)
  }

  @inline
  def th(children: ReactNode*): ReactElement =
    CreateDOMElement("th", json(), children = children.toJSArray)

  @inline
  def pattern[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("pattern", props, children = children.toJSArray)
  }

  @inline
  def pattern(children: ReactNode*): ReactElement =
    CreateDOMElement("pattern", json(), children = children.toJSArray)

  @inline
  def ins[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ins", props, children = children.toJSArray)
  }

  @inline
  def ins(children: ReactNode*): ReactElement =
    CreateDOMElement("ins", json(), children = children.toJSArray)

  @inline
  def p[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("p", props, children = children.toJSArray)
  }

  @inline
  def p(children: ReactNode*): ReactElement =
    CreateDOMElement("p", json(), children = children.toJSArray)

  @inline
  def `object`[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("object", props, children = children.toJSArray)
  }

  @inline
  def `object`(children: ReactNode*): ReactElement =
    CreateDOMElement("object", json(), children = children.toJSArray)

  @inline
  def hatchpath[T <: dom.Node](style: U[js.Any] = NoValue,
                               id: U[String] = NoValue,
                               className: U[String] = NoValue,
                               @exclude key: String | Int = null,
                               @exclude ref: js.Function1[T, Unit] = null,
                               @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("hatchpath", props, children = children.toJSArray)
  }

  @inline
  def hatchpath(children: ReactNode*): ReactElement =
    CreateDOMElement("hatchpath", json(), children = children.toJSArray)

  @inline
  def feMerge[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feMerge", props, children = children.toJSArray)
  }

  @inline
  def feMerge(children: ReactNode*): ReactElement =
    CreateDOMElement("feMerge", json(), children = children.toJSArray)

  @inline
  def feColorMatrix[T <: dom.Node](style: U[js.Any] = NoValue,
                                   id: U[String] = NoValue,
                                   className: U[String] = NoValue,
                                   @exclude key: String | Int = null,
                                   @exclude ref: js.Function1[T, Unit] = null,
                                   @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feColorMatrix", props, children = children.toJSArray)
  }

  @inline
  def feColorMatrix(children: ReactNode*): ReactElement =
    CreateDOMElement("feColorMatrix", json(), children = children.toJSArray)

  @inline
  def script[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("script", props, children = children.toJSArray)
  }

  @inline
  def script(children: ReactNode*): ReactElement =
    CreateDOMElement("script", json(), children = children.toJSArray)

  @inline
  def feMorphology[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feMorphology", props, children = children.toJSArray)
  }

  @inline
  def feMorphology(children: ReactNode*): ReactElement =
    CreateDOMElement("feMorphology", json(), children = children.toJSArray)

  @inline
  def summary[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("summary", props, children = children.toJSArray)
  }

  @inline
  def summary(children: ReactNode*): ReactElement =
    CreateDOMElement("summary", json(), children = children.toJSArray)

  @inline
  def feFuncR[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feFuncR", props, children = children.toJSArray)
  }

  @inline
  def feFuncR(children: ReactNode*): ReactElement =
    CreateDOMElement("feFuncR", json(), children = children.toJSArray)

  @inline
  def br[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("br", props)
  }

  @inline
  def sup[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("sup", props, children = children.toJSArray)
  }

  @inline
  def sup(children: ReactNode*): ReactElement =
    CreateDOMElement("sup", json(), children = children.toJSArray)

  @inline
  def clipPath[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("clipPath", props, children = children.toJSArray)
  }

  @inline
  def clipPath(children: ReactNode*): ReactElement =
    CreateDOMElement("clipPath", json(), children = children.toJSArray)

  @inline
  def dt[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dt", props, children = children.toJSArray)
  }

  @inline
  def dt(children: ReactNode*): ReactElement =
    CreateDOMElement("dt", json(), children = children.toJSArray)

  @inline
  def hatch[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("hatch", props, children = children.toJSArray)
  }

  @inline
  def hatch(children: ReactNode*): ReactElement =
    CreateDOMElement("hatch", json(), children = children.toJSArray)

  @inline
  def code[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("code", props, children = children.toJSArray)
  }

  @inline
  def code(children: ReactNode*): ReactElement =
    CreateDOMElement("code", json(), children = children.toJSArray)

  @inline
  def polyline[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("polyline", props, children = children.toJSArray)
  }

  @inline
  def polyline(children: ReactNode*): ReactElement =
    CreateDOMElement("polyline", json(), children = children.toJSArray)

  @inline
  def h2[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h2", props, children = children.toJSArray)
  }

  @inline
  def h2(children: ReactNode*): ReactElement =
    CreateDOMElement("h2", json(), children = children.toJSArray)

  @inline
  def menuitem[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("menuitem", props)
  }

  @inline
  def address[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("address", props, children = children.toJSArray)
  }

  @inline
  def address(children: ReactNode*): ReactElement =
    CreateDOMElement("address", json(), children = children.toJSArray)

  @inline
  def feComponentTransfer[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feComponentTransfer",
                     props,
                     children = children.toJSArray)
  }

  @inline
  def feComponentTransfer(children: ReactNode*): ReactElement =
    CreateDOMElement("feComponentTransfer",
                     json(),
                     children = children.toJSArray)

  @inline
  def feDropShadow[T <: dom.Node](style: U[js.Any] = NoValue,
                                  id: U[String] = NoValue,
                                  className: U[String] = NoValue,
                                  @exclude key: String | Int = null,
                                  @exclude ref: js.Function1[T, Unit] = null,
                                  @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feDropShadow", props, children = children.toJSArray)
  }

  @inline
  def feDropShadow(children: ReactNode*): ReactElement =
    CreateDOMElement("feDropShadow", json(), children = children.toJSArray)

  @inline
  def ruby[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("ruby", props, children = children.toJSArray)
  }

  @inline
  def ruby(children: ReactNode*): ReactElement =
    CreateDOMElement("ruby", json(), children = children.toJSArray)

  @inline
  def feSpecularLighting[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feSpecularLighting",
                     props,
                     children = children.toJSArray)
  }

  @inline
  def feSpecularLighting(children: ReactNode*): ReactElement =
    CreateDOMElement("feSpecularLighting",
                     json(),
                     children = children.toJSArray)

  @inline
  def path[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("path", props, children = children.toJSArray)
  }

  @inline
  def path(children: ReactNode*): ReactElement =
    CreateDOMElement("path", json(), children = children.toJSArray)

  @inline
  def feTile[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feTile", props, children = children.toJSArray)
  }

  @inline
  def feTile(children: ReactNode*): ReactElement =
    CreateDOMElement("feTile", json(), children = children.toJSArray)

  @inline
  def metadata[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("metadata", props, children = children.toJSArray)
  }

  @inline
  def metadata(children: ReactNode*): ReactElement =
    CreateDOMElement("metadata", json(), children = children.toJSArray)

  @inline
  def feGaussianBlur[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feGaussianBlur", props, children = children.toJSArray)
  }

  @inline
  def feGaussianBlur(children: ReactNode*): ReactElement =
    CreateDOMElement("feGaussianBlur", json(), children = children.toJSArray)

  @inline
  def symbol[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("symbol", props, children = children.toJSArray)
  }

  @inline
  def symbol(children: ReactNode*): ReactElement =
    CreateDOMElement("symbol", json(), children = children.toJSArray)

  @inline
  def desc[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("desc", props, children = children.toJSArray)
  }

  @inline
  def desc(children: ReactNode*): ReactElement =
    CreateDOMElement("desc", json(), children = children.toJSArray)

  @inline
  def dl[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dl", props, children = children.toJSArray)
  }

  @inline
  def dl(children: ReactNode*): ReactElement =
    CreateDOMElement("dl", json(), children = children.toJSArray)

  @inline
  def meter[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("meter", props, children = children.toJSArray)
  }

  @inline
  def meter(children: ReactNode*): ReactElement =
    CreateDOMElement("meter", json(), children = children.toJSArray)

  @inline
  def figure[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("figure", props, children = children.toJSArray)
  }

  @inline
  def figure(children: ReactNode*): ReactElement =
    CreateDOMElement("figure", json(), children = children.toJSArray)

  @inline
  def samp[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("samp", props, children = children.toJSArray)
  }

  @inline
  def samp(children: ReactNode*): ReactElement =
    CreateDOMElement("samp", json(), children = children.toJSArray)

  @inline
  def rp[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("rp", props, children = children.toJSArray)
  }

  @inline
  def rp(children: ReactNode*): ReactElement =
    CreateDOMElement("rp", json(), children = children.toJSArray)

  @inline
  def foreignObject[T <: dom.Node](style: U[js.Any] = NoValue,
                                   id: U[String] = NoValue,
                                   className: U[String] = NoValue,
                                   @exclude key: String | Int = null,
                                   @exclude ref: js.Function1[T, Unit] = null,
                                   @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("foreignObject", props, children = children.toJSArray)
  }

  @inline
  def foreignObject(children: ReactNode*): ReactElement =
    CreateDOMElement("foreignObject", json(), children = children.toJSArray)

  @inline
  def dfn[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dfn", props, children = children.toJSArray)
  }

  @inline
  def dfn(children: ReactNode*): ReactElement =
    CreateDOMElement("dfn", json(), children = children.toJSArray)

  @inline
  def feConvolveMatrix[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feConvolveMatrix", props, children = children.toJSArray)
  }

  @inline
  def feConvolveMatrix(children: ReactNode*): ReactElement =
    CreateDOMElement("feConvolveMatrix", json(), children = children.toJSArray)

  @inline
  def option[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("option", props, children = children.toJSArray)
  }

  @inline
  def option(children: ReactNode*): ReactElement =
    CreateDOMElement("option", json(), children = children.toJSArray)

  @inline
  def head[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("head", props, children = children.toJSArray)
  }

  @inline
  def head(children: ReactNode*): ReactElement =
    CreateDOMElement("head", json(), children = children.toJSArray)

  @inline
  def video[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("video", props, children = children.toJSArray)
  }

  @inline
  def video(children: ReactNode*): ReactElement =
    CreateDOMElement("video", json(), children = children.toJSArray)

  @inline
  def main[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("main", props, children = children.toJSArray)
  }

  @inline
  def main(children: ReactNode*): ReactElement =
    CreateDOMElement("main", json(), children = children.toJSArray)

  @inline
  def i[T <: dom.Node](style: U[js.Any] = NoValue,
                       id: U[String] = NoValue,
                       className: U[String] = NoValue,
                       @exclude key: String | Int = null,
                       @exclude ref: js.Function1[T, Unit] = null,
                       @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("i", props, children = children.toJSArray)
  }

  @inline
  def i(children: ReactNode*): ReactElement =
    CreateDOMElement("i", json(), children = children.toJSArray)

  @inline
  def sub[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("sub", props, children = children.toJSArray)
  }

  @inline
  def sub(children: ReactNode*): ReactElement =
    CreateDOMElement("sub", json(), children = children.toJSArray)

  @inline
  def label[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("label", props, children = children.toJSArray)
  }

  @inline
  def label(children: ReactNode*): ReactElement =
    CreateDOMElement("label", json(), children = children.toJSArray)

  @inline
  def button[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("button", props, children = children.toJSArray)
  }

  @inline
  def button(children: ReactNode*): ReactElement =
    CreateDOMElement("button", json(), children = children.toJSArray)

  @inline
  def feComposite[T <: dom.Node](style: U[js.Any] = NoValue,
                                 id: U[String] = NoValue,
                                 className: U[String] = NoValue,
                                 @exclude key: String | Int = null,
                                 @exclude ref: js.Function1[T, Unit] = null,
                                 @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feComposite", props, children = children.toJSArray)
  }

  @inline
  def feComposite(children: ReactNode*): ReactElement =
    CreateDOMElement("feComposite", json(), children = children.toJSArray)

  @inline
  def mpath[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("mpath", props, children = children.toJSArray)
  }

  @inline
  def mpath(children: ReactNode*): ReactElement =
    CreateDOMElement("mpath", json(), children = children.toJSArray)

  @inline
  def h3[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("h3", props, children = children.toJSArray)
  }

  @inline
  def h3(children: ReactNode*): ReactElement =
    CreateDOMElement("h3", json(), children = children.toJSArray)

  @inline
  def animate[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("animate", props, children = children.toJSArray)
  }

  @inline
  def animate(children: ReactNode*): ReactElement =
    CreateDOMElement("animate", json(), children = children.toJSArray)

  @inline
  def discard[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("discard", props, children = children.toJSArray)
  }

  @inline
  def discard(children: ReactNode*): ReactElement =
    CreateDOMElement("discard", json(), children = children.toJSArray)

  @inline
  def section[T <: dom.Node](style: U[js.Any] = NoValue,
                             id: U[String] = NoValue,
                             className: U[String] = NoValue,
                             @exclude key: String | Int = null,
                             @exclude ref: js.Function1[T, Unit] = null,
                             @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("section", props, children = children.toJSArray)
  }

  @inline
  def section(children: ReactNode*): ReactElement =
    CreateDOMElement("section", json(), children = children.toJSArray)

  @inline
  def linearGradient[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("linearGradient", props, children = children.toJSArray)
  }

  @inline
  def linearGradient(children: ReactNode*): ReactElement =
    CreateDOMElement("linearGradient", json(), children = children.toJSArray)

  @inline
  def text[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("text", props, children = children.toJSArray)
  }

  @inline
  def text(children: ReactNode*): ReactElement =
    CreateDOMElement("text", json(), children = children.toJSArray)

  @inline
  def div[T <: dom.Node](style: U[js.Any] = NoValue,
                         id: U[String] = NoValue,
                         className: U[String] = NoValue,
                         @exclude key: String | Int = null,
                         @exclude ref: js.Function1[T, Unit] = null,
                         @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("div", props, children = children.toJSArray)
  }

  @inline
  def div(children: ReactNode*): ReactElement =
    CreateDOMElement("div", json(), children = children.toJSArray)

  @inline
  def audio[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("audio", props, children = children.toJSArray)
  }

  @inline
  def audio(children: ReactNode*): ReactElement =
    CreateDOMElement("audio", json(), children = children.toJSArray)

  @inline
  def tspan[T <: dom.Node](style: U[js.Any] = NoValue,
                           id: U[String] = NoValue,
                           className: U[String] = NoValue,
                           @exclude key: String | Int = null,
                           @exclude ref: js.Function1[T, Unit] = null,
                           @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("tspan", props, children = children.toJSArray)
  }

  @inline
  def tspan(children: ReactNode*): ReactElement =
    CreateDOMElement("tspan", json(), children = children.toJSArray)

  @inline
  def mark[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("mark", props, children = children.toJSArray)
  }

  @inline
  def mark(children: ReactNode*): ReactElement =
    CreateDOMElement("mark", json(), children = children.toJSArray)

  @inline
  def animateMotion[T <: dom.Node](style: U[js.Any] = NoValue,
                                   id: U[String] = NoValue,
                                   className: U[String] = NoValue,
                                   @exclude key: String | Int = null,
                                   @exclude ref: js.Function1[T, Unit] = null,
                                   @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("animateMotion", props, children = children.toJSArray)
  }

  @inline
  def animateMotion(children: ReactNode*): ReactElement =
    CreateDOMElement("animateMotion", json(), children = children.toJSArray)

  @inline
  def form[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("form", props, children = children.toJSArray)
  }

  @inline
  def form(children: ReactNode*): ReactElement =
    CreateDOMElement("form", json(), children = children.toJSArray)

  @inline
  def textarea[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("textarea", props, children = children.toJSArray)
  }

  @inline
  def textarea(children: ReactNode*): ReactElement =
    CreateDOMElement("textarea", json(), children = children.toJSArray)

  @inline
  def param[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("param", props)
  }

  @inline
  def marker[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("marker", props, children = children.toJSArray)
  }

  @inline
  def marker(children: ReactNode*): ReactElement =
    CreateDOMElement("marker", json(), children = children.toJSArray)

  @inline
  def noscript[T <: dom.Node](style: U[js.Any] = NoValue,
                              id: U[String] = NoValue,
                              className: U[String] = NoValue,
                              @exclude key: String | Int = null,
                              @exclude ref: js.Function1[T, Unit] = null,
                              @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("noscript", props, children = children.toJSArray)
  }

  @inline
  def noscript(children: ReactNode*): ReactElement =
    CreateDOMElement("noscript", json(), children = children.toJSArray)

  @inline
  def dd[T <: dom.Node](style: U[js.Any] = NoValue,
                        id: U[String] = NoValue,
                        className: U[String] = NoValue,
                        @exclude key: String | Int = null,
                        @exclude ref: js.Function1[T, Unit] = null,
                        @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("dd", props, children = children.toJSArray)
  }

  @inline
  def dd(children: ReactNode*): ReactElement =
    CreateDOMElement("dd", json(), children = children.toJSArray)

  @inline
  def radialGradient[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("radialGradient", props, children = children.toJSArray)
  }

  @inline
  def radialGradient(children: ReactNode*): ReactElement =
    CreateDOMElement("radialGradient", json(), children = children.toJSArray)

  @inline
  def rect[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("rect", props, children = children.toJSArray)
  }

  @inline
  def rect(children: ReactNode*): ReactElement =
    CreateDOMElement("rect", json(), children = children.toJSArray)

  @inline
  def feDisplacementMap[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("feDisplacementMap", props, children = children.toJSArray)
  }

  @inline
  def feDisplacementMap(children: ReactNode*): ReactElement =
    CreateDOMElement("feDisplacementMap",
                     json(),
                     children = children.toJSArray)

  @inline
  def switch[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("switch", props, children = children.toJSArray)
  }

  @inline
  def switch(children: ReactNode*): ReactElement =
    CreateDOMElement("switch", json(), children = children.toJSArray)

  @inline
  def data[T <: dom.Node](style: U[js.Any] = NoValue,
                          id: U[String] = NoValue,
                          className: U[String] = NoValue,
                          @exclude key: String | Int = null,
                          @exclude ref: js.Function1[T, Unit] = null,
                          @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("data", props, children = children.toJSArray)
  }

  @inline
  def data(children: ReactNode*): ReactElement =
    CreateDOMElement("data", json(), children = children.toJSArray)

  @inline
  def img[T <: dom.Node](
      style: U[js.Any] = NoValue,
      id: U[String] = NoValue,
      className: U[String] = NoValue,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[T, Unit] = null,
      @exclude extraProps: U[DOMProps] = NoValue): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("img", props)
  }

  @inline
  def strong[T <: dom.Node](style: U[js.Any] = NoValue,
                            id: U[String] = NoValue,
                            className: U[String] = NoValue,
                            @exclude key: String | Int = null,
                            @exclude ref: js.Function1[T, Unit] = null,
                            @exclude extraProps: U[DOMProps] = NoValue)(
      children: ReactNode*): ReactElement = {
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateDOMElement("strong", props, children = children.toJSArray)
  }

  @inline
  def strong(children: ReactNode*): ReactElement =
    CreateDOMElement("strong", json(), children = children.toJSArray)

}
