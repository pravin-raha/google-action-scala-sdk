package com.raha.gaction

import com.raha.gaction.api.request.{Inputs, RootRequest}
import com.raha.gaction.api.response.RootResponse
import com.raha.gaction.api.{ActionsConfig, RequestHandler}

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */

class AssistantActions {
  private var responseHandler: ResponseHandler = _
  private var requestHandlersFactories: Map[String, RequestHandler.Factory] = _

  def handleRequest(rootRequest: RootRequest): ResponseHandler = {
    responseHandler.onPrepareContentType(ActionsConfig.HTTP_CONTENT_TYPE_JSON)
    responseHandler.onPrepareResponseHeaders(ActionsConfig.RESPONSE_HEADERS)
    val actionIntent: String = getActionIntent(rootRequest)
    if (actionIntent != null && requestHandlersFactories.contains(actionIntent)) {
      val requestHandler: RequestHandler = requestHandlersFactories(actionIntent).create
      val rootResponse: RootResponse = requestHandler.onRequest(rootRequest)
      responseHandler.onResponse(rootResponse)
    }
    else {
      responseHandler.onResponse(ResponseBuilder.tellResponse(ActionsConfig.ERROR_MESSAGE))
    }
  }

  private def getActionIntent(rootRequest: RootRequest): String = {
    if (rootRequest.inputs != null && rootRequest.inputs.nonEmpty) {
      val inputs: Inputs = rootRequest.inputs.head
      inputs.intent
    } else null
  }
}

object AssistantActions {

  class Builder(responseHandler: ResponseHandler) {

    private final val requestHandlersFactories: Map[String, RequestHandler.Factory] = Map.empty[String, RequestHandler.Factory]

    def addRequestHandlerFactory(actionIntent: String, factory: RequestHandler.Factory): AssistantActions.Builder = {
      this.requestHandlersFactories + (actionIntent -> factory)
      this
    }

    def build: AssistantActions = {
      val assistantActions = new AssistantActions
      assistantActions.responseHandler = responseHandler
      assistantActions.requestHandlersFactories = requestHandlersFactories
      assistantActions
    }
  }

}