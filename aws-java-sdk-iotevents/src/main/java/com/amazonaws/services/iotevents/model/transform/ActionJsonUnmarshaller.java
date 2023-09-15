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
package com.amazonaws.services.iotevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Action JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionJsonUnmarshaller implements Unmarshaller<Action, JsonUnmarshallerContext> {

    public Action unmarshall(JsonUnmarshallerContext context) throws Exception {
        Action action = new Action();

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
                if (context.testExpression("setVariable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setSetVariable(SetVariableActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setSns(SNSTopicPublishActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iotTopicPublish", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setIotTopicPublish(IotTopicPublishActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("setTimer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setSetTimer(SetTimerActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("clearTimer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setClearTimer(ClearTimerActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resetTimer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setResetTimer(ResetTimerActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambda", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setLambda(LambdaActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iotEvents", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setIotEvents(IotEventsActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sqs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setSqs(SqsActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("firehose", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setFirehose(FirehoseActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dynamoDB", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setDynamoDB(DynamoDBActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dynamoDBv2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setDynamoDBv2(DynamoDBv2ActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iotSiteWise", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    action.setIotSiteWise(IotSiteWiseActionJsonUnmarshaller.getInstance().unmarshall(context));
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

        return action;
    }

    private static ActionJsonUnmarshaller instance;

    public static ActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionJsonUnmarshaller();
        return instance;
    }
}
