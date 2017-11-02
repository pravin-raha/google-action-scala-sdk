package com.raha.gaction.api

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
object ActionsConfig {
  val ERROR_MESSAGE = "Sorry, I am unable to process your request."
  val CONVERSATION_API_VERSION_HEADER = "Google-Assistant-API-Version"
  val CONVERSATION_API_VERSION = "v1"
  val HTTP_CONTENT_TYPE_JSON = "application/json"
  val RESPONSE_HEADERS = Map[String, String](CONVERSATION_API_VERSION_HEADER -> CONVERSATION_API_VERSION)
}