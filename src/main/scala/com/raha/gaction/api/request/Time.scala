package com.raha.gaction.api.request

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class Time(
                 seconds: Int,
                 nanos: Int
               )

object Time {
  implicit val format = Json.format[Time]
}