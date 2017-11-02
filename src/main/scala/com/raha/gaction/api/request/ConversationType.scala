package com.raha.gaction.api.request

import play.api.libs.json.Reads

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */

object ConversationType extends Enumeration {
  implicit val conversationTypeReads = Reads.enumNameReads(ConversationType)
  type ConversationType = Value
  val TYPE_UNSPECIFIED, NEW, ACTIVE, EXPIRED, ARCHIVED = Value
}