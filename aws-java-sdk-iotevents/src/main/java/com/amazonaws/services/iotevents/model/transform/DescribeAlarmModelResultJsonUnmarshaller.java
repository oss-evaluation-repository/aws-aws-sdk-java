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
 * DescribeAlarmModelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmModelResultJsonUnmarshaller implements Unmarshaller<DescribeAlarmModelResult, JsonUnmarshallerContext> {

    public DescribeAlarmModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAlarmModelResult describeAlarmModelResult = new DescribeAlarmModelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAlarmModelResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("alarmModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setAlarmModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alarmModelVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setAlarmModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alarmModelName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setAlarmModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alarmModelDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setAlarmModelDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("key", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setSeverity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("alarmRule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setAlarmRule(AlarmRuleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("alarmNotification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setAlarmNotification(AlarmNotificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("alarmEventActions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setAlarmEventActions(AlarmEventActionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("alarmCapabilities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAlarmModelResult.setAlarmCapabilities(AlarmCapabilitiesJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeAlarmModelResult;
    }

    private static DescribeAlarmModelResultJsonUnmarshaller instance;

    public static DescribeAlarmModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAlarmModelResultJsonUnmarshaller();
        return instance;
    }
}
