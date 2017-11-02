package com.raha.gaction.api.request

import com.raha.gaction.api.request.ConversationType.ConversationType
import play.api.libs.json.{Json, Reads}

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class Conversation(
                         conversation_id: String,
                         `type`: ConversationType,
                         conversation_token: String
                       )

object Conversation {
  implicit val format = Json.format[Conversation]
}