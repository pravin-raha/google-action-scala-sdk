package com.raha.gaction.api.request

import com.raha.gaction.api.request.InputType.InputType
import play.api.libs.json.{Json, Reads}

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class RawInput(
                     create_time: Time,
                     query: String,
                     input_type: InputType
                   )

object RawInput {
  implicit val format = Json.format[RawInput]
}