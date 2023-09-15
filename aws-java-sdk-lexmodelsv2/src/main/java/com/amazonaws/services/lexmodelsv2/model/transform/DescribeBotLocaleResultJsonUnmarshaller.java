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
 * DescribeBotLocaleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotLocaleResultJsonUnmarshaller implements Unmarshaller<DescribeBotLocaleResult, JsonUnmarshallerContext> {

    public DescribeBotLocaleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBotLocaleResult describeBotLocaleResult = new DescribeBotLocaleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeBotLocaleResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("botId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setLocaleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nluIntentConfidenceThreshold", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setNluIntentConfidenceThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("voiceSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setVoiceSettings(VoiceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("intentsCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setIntentsCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("slotTypesCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setSlotTypesCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("botLocaleStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setBotLocaleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastBuildSubmittedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setLastBuildSubmittedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("botLocaleHistoryEvents", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setBotLocaleHistoryEvents(new ListUnmarshaller<BotLocaleHistoryEvent>(BotLocaleHistoryEventJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("recommendedActions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotLocaleResult.setRecommendedActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return describeBotLocaleResult;
    }

    private static DescribeBotLocaleResultJsonUnmarshaller instance;

    public static DescribeBotLocaleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBotLocaleResultJsonUnmarshaller();
        return instance;
    }
}
