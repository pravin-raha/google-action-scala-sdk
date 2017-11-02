package com.raha.gaction.api.request

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class Inputs(
                   intent: String,
                   raw_inputs: List[RawInput],
                   arguments: List[Argument]
                 )

object Inputs {
  implicit val format = Json.format[Inputs]
}