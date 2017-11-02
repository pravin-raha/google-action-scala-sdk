package com.raha.gaction.api.response

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class InputPrompt(
                        initial_prompts: List[SpeechResponse],
                        no_input_prompts: List[SpeechResponse]
                      )

object InputPrompt {
  implicit val format = Json.format[InputPrompt]
}