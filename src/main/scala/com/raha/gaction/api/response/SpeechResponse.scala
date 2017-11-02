package com.raha.gaction.api.response

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class SpeechResponse(
                           text_to_speech: String,
                           ssml: String
                         )

object SpeechResponse {
  implicit val format = Json.format[SpeechResponse]
}