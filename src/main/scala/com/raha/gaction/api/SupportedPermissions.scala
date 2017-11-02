package com.raha.gaction.api

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
object SupportedPermissions extends Enumeration {
  type SupportedPermissions = Value
  val

  /**
    * The user's name as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#UserProfile|UserProfile object}
    */
  NAME,

  /**
    * The location of the user's current device, as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#Location|Location object}.
    */
  DEVICE_PRECISE_LOCATION,

  /**
    * City and zipcode corresponding to the location of the user's current device, as defined in the
    * {@link https://developers.google.com/actions/reference/conversation#Location|Location object}.
    */
  DEVICE_COARSE_LOCATION = Value
}