package com.raha.gaction.api.response

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class ExpectedIntent(
                           intent: String,
                           input_value_spec: Option[InputValueSpec] = None
                         )

object ExpectedIntent {
  implicit val format = Json.format[ExpectedIntent]
}