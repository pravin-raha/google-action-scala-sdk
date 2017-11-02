package com.raha.gaction.api.request

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class RootRequest(
                        user: User,
                        device: Device,
                        conversation: Conversation,
                        inputs: List[Inputs]
                      )

object RootRequest {
  implicit val format = Json.format[RootRequest]
}