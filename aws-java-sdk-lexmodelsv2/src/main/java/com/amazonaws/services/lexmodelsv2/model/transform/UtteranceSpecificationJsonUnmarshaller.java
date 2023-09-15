/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UtteranceSpecification JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtteranceSpecificationJsonUnmarshaller implements Unmarshaller<UtteranceSpecification, JsonUnmarshallerContext> {

    public UtteranceSpecification unmarshall(JsonUnmarshallerContext context) throws Exception {
        UtteranceSpecification utteranceSpecification = new UtteranceSpecification();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botAliasId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setBotAliasId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sessionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("channel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setChannel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("conversationStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setConversationStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("conversationEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setConversationEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("utterance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setUtterance(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("utteranceTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setUtteranceTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("audioVoiceDurationMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setAudioVoiceDurationMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("utteranceUnderstood", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setUtteranceUnderstood(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("inputType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setInputType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setOutputType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatedIntentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setAssociatedIntentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatedSlotName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setAssociatedSlotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setIntentState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dialogActionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setDialogActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botResponseAudioVoiceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setBotResponseAudioVoiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotsFilledInSession", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setSlotsFilledInSession(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("utteranceRequestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setUtteranceRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botResponses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    utteranceSpecification.setBotResponses(new ListUnmarshaller<UtteranceBotResponse>(UtteranceBotResponseJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (token == FIELD_NAME && !knownMember) {
                    context.nextToken();
                    com.amazonaws.transform.UnknownMemberJsonUnmarshaller.getInstance().unmarshall(context);
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return utteranceSpecification;
    }

    private static UtteranceSpecificationJsonUnmarshaller instance;

    public static UtteranceSpecificationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UtteranceSpecificationJsonUnmarshaller();
        return instance;
    }
}
