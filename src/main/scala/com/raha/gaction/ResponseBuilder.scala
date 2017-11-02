package com.raha.gaction

import com.raha.gaction.api.StandardIntents
import com.raha.gaction.api.response._

/**
  * Created by Pravin Rahangdale on 2/11/17.
  */
object ResponseBuilder {

  def tellResponse(message: String): RootResponse = {
    val speechResponse = SpeechResponse(message, null)
    val finalResponse = FinalResponse(speech_response = speechResponse)
    RootResponse(
      conversation_token = "",
      expect_user_response = false,
      final_response = Option(finalResponse),
      expected_inputs = List.empty[ExpectedInputs]
    )
  }

  def askResponse(message: String, conversationToken: String = "", noInputPrompts: Array[String] = Array.empty[String]): RootResponse = {

    val input_prompt: InputPrompt = if (noInputPrompts != null && noInputPrompts.length > 0) {
      InputPrompt(
        initial_prompts = List(SpeechResponse(message, null)),
        no_input_prompts = noInputPrompts.map(noInputPrompt => SpeechResponse(noInputPrompt, null)).toList
      )
    } else {
      InputPrompt(
        initial_prompts = List(SpeechResponse(message, null)),
        no_input_prompts = List.empty[SpeechResponse]
      )
    }

    val expectedInput: ExpectedInputs = ExpectedInputs(
      input_prompt = input_prompt,
      possible_intents = List(ExpectedIntent(StandardIntents.TEXT))
    )

    RootResponse(
      expect_user_response = true,
      conversation_token = conversationToken,
      expected_inputs = List(expectedInput),
      final_response = None
    )
  }
}