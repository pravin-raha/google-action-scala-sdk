package com.raha.gaction.api.response

import play.api.libs.json.Json

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
case class PermissionValueSpec(
                                opt_context: String,
                                permissions: List[String]
                              )

object PermissionValueSpec {
  implicit val format = Json.format[PermissionValueSpec]
}