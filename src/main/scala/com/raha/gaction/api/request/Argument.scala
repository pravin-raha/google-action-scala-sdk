package com.raha.gaction.api.request

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class Argument(
                     name: String,
                     raw_text: String,
                     int_value: String,
                     bool_value: String,
                     text_value: String,
                     date_value: String,
                     time_value: String,
                     location_value: Location,
                     formatted_address: String
                   )

object Argument {
  implicit val format = Json.format[Argument]
}