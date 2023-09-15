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
 * UpdateBotAliasResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBotAliasResultJsonUnmarshaller implements Unmarshaller<UpdateBotAliasResult, JsonUnmarshallerContext> {

    public UpdateBotAliasResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateBotAliasResult updateBotAliasResult = new UpdateBotAliasResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateBotAliasResult;
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
                    updateBotAliasResult.setBotAliasId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botAliasName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setBotAliasName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botAliasLocaleSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setBotAliasLocaleSettings(new MapUnmarshaller<String, BotAliasLocaleSettings>(context.getUnmarshaller(String.class),
                            BotAliasLocaleSettingsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("conversationLogSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setConversationLogSettings(ConversationLogSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sentimentAnalysisSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setSentimentAnalysisSettings(SentimentAnalysisSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botAliasStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setBotAliasStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateBotAliasResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return updateBotAliasResult;
    }

    private static UpdateBotAliasResultJsonUnmarshaller instance;

    public static UpdateBotAliasResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateBotAliasResultJsonUnmarshaller();
        return instance;
    }
}
