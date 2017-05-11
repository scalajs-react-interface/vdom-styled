package sri.macros

import sri.web.vdom.SyntheticEvent

/**
  * Created by cuz on 17-4-26.
  */
package object web {
  type SyntheticEventCallback = (_ <: SyntheticEvent[_]) => _
}
