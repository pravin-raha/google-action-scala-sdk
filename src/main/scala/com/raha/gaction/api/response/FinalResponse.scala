package com.raha.gaction.api.response

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class FinalResponse(
                          speech_response: SpeechResponse
                        )

object FinalResponse {
  implicit val format = Json.format[FinalResponse]
}