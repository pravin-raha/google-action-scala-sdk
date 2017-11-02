package com.raha.gaction.api.request

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class UserProfile(
                        given_name: String,
                        family_name: String,
                        display_name: String
                      )

object UserProfile {
  implicit val format = Json.format[UserProfile]
}