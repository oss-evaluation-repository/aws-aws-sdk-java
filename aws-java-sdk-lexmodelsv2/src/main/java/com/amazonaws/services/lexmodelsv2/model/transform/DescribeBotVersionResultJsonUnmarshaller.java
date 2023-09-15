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
 * DescribeBotVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBotVersionResultJsonUnmarshaller implements Unmarshaller<DescribeBotVersionResult, JsonUnmarshallerContext> {

    public DescribeBotVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBotVersionResult describeBotVersionResult = new DescribeBotVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeBotVersionResult;
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
                    describeBotVersionResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setBotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataPrivacy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setDataPrivacy(DataPrivacyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("idleSessionTTLInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setIdleSessionTTLInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("botStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setBotStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("parentBotNetworks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setParentBotNetworks(new ListUnmarshaller<ParentBotNetwork>(ParentBotNetworkJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("botType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setBotType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botMembers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBotVersionResult.setBotMembers(new ListUnmarshaller<BotMember>(BotMemberJsonUnmarshaller.getInstance())

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

        return describeBotVersionResult;
    }

    private static DescribeBotVersionResultJsonUnmarshaller instance;

    public static DescribeBotVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBotVersionResultJsonUnmarshaller();
        return instance;
    }
}
