package com.raha.gaction.api.request

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class User(
                 user_id: String,
                 profile: UserProfile,
                 access_token: String
               )

object User {
  implicit val format = Json.format[User]
}