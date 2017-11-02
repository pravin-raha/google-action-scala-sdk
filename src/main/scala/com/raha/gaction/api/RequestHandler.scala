package com.raha.gaction.api

import com.raha.gaction.api.request.RootRequest
import com.raha.gaction.api.response.RootResponse

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
object RequestHandler {

  trait Factory {
    def create: RequestHandler
  }

}

trait RequestHandler {
  def onRequest(rootRequest: RootRequest): RootResponse
}