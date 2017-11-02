package com.raha.gaction.api.request

import play.api.libs.json.Reads

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
object InputType extends Enumeration {
  implicit val inputTypeReads = Reads.enumNameReads(InputType)
  type InputType = Value
  val UNSPECIFIC_INPUT_TYPE, TOUCH, VOICE = Value
}