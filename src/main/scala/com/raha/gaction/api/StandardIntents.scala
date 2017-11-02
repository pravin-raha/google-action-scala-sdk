package com.raha.gaction.api

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
object StandardIntents {
  /**
    * Assistant fires MAIN intent for queries like [talk to $action].
    */
  val MAIN = "assistant.intent.action.MAIN"
  /**
    * Assistant fires TEXT intent when action issues ask intent.
    */
  val TEXT = "assistant.intent.action.TEXT"
  /**
    * Assistant fires PERMISSION intent when action invokes askForPermission.
    */
  val PERMISSION = "assistant.intent.action.PERMISSION"
}