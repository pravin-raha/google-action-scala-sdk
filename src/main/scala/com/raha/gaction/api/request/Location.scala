package com.raha.gaction.api.request

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class Location(
                     coordinates: Coordinates,
                     formatted_address: String,
                     city: String,
                     zip_code: String
                   )

object Location {
  implicit val format = Json.format[Location]
}