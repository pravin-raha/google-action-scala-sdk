package com.raha.gaction

import com.raha.gaction.api.response.RootResponse

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
trait ResponseHandler {

  def onPrepareContentType(contentType: String): Unit

  def onPrepareResponseHeaders(headers: Map[String, String]): Unit

  def onResponse[T](rootResponse: RootResponse): T

}