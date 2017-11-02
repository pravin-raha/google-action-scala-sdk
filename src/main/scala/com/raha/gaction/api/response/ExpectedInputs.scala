package com.raha.gaction.api.response

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class ExpectedInputs(
                           input_prompt: InputPrompt,
                           possible_intents: List[ExpectedIntent]
                         )

object ExpectedInputs {
  implicit val format = Json.format[ExpectedInputs]
}