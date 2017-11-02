package com.raha.gaction.api.request

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class Coordinates(
                        latitude: Double,
                        longitude: Double
                      )

object Coordinates {
  implicit val format = Json.format[Coordinates]
}