package com.raha.gaction.api.response

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class InputValueSpec(
                           permission_value_spec: PermissionValueSpec
                         )

object InputValueSpec {
  implicit val format = Json.format[InputValueSpec]
}