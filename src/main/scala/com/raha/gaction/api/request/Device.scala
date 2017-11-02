package com.raha.gaction.api.request

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class Device(
                   location: Location
                 )

object Device {
  implicit val format = Json.format[Device]
}