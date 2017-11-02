package com.raha.gaction.api.response

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class RootResponse(
                         conversation_token: String,
                         expect_user_response: Boolean,
                         expected_inputs: List[ExpectedInputs],
                         final_response: Option[FinalResponse]
                       )

object RootResponse {
  implicit val format = Json.format[RootResponse]
}