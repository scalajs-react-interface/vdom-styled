package sri.macros.web

import sri.web.vdom.{ReactEventAliases, SyntheticEvent}

import scala.language.implicitConversions
import scala.scalajs.js

/**
  * Created by cuz on 17-4-26.
  */
object styledtags extends StyledTags with StyledAttributes with ReactEventAliases with IntellijHelper{
  type SyntheticEventCallback = sri.macros.web.SyntheticEventCallback
}

object styledtagsPrefix_<^ extends ReactEventAliases with IntellijHelper{
  type SyntheticEventCallback = sri.macros.web.SyntheticEventCallback
  object < extends StyledTags
  object ^ extends StyledAttributes
}


trait IntellijHelper {
  implicit def eventConversion[T <: SyntheticEvent[_]](in: T => _): js.UndefOr[SyntheticEventCallback] =
    in.asInstanceOf[js.UndefOr[SyntheticEventCallback]]
}