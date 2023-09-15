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
package com.amazonaws.services.lexmodelbuilding.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelbuilding.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetBotResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBotResultJsonUnmarshaller implements Unmarshaller<GetBotResult, JsonUnmarshallerContext> {

    public GetBotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetBotResult getBotResult = new GetBotResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getBotResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intents", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setIntents(new ListUnmarshaller<Intent>(IntentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("enableModelImprovements", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setEnableModelImprovements(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("nluIntentConfidenceThreshold", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setNluIntentConfidenceThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("clarificationPrompt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setClarificationPrompt(PromptJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("abortStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setAbortStatement(StatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("idleSessionTTLInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setIdleSessionTTLInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("voiceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setVoiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("checksum", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setChecksum(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("locale", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setLocale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("childDirected", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setChildDirected(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("detectSentiment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getBotResult.setDetectSentiment(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return getBotResult;
    }

    private static GetBotResultJsonUnmarshaller instance;

    public static GetBotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetBotResultJsonUnmarshaller();
        return instance;
    }
}
