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
package com.amazonaws.services.eventbridge.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eventbridge.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeReplayResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplayResultJsonUnmarshaller implements Unmarshaller<DescribeReplayResult, JsonUnmarshallerContext> {

    public DescribeReplayResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeReplayResult describeReplayResult = new DescribeReplayResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeReplayResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ReplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setReplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplayArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setReplayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventSourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setEventSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Destination", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setDestination(ReplayDestinationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setEventStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EventEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setEventEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EventLastReplayedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setEventLastReplayedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplayStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setReplayStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplayEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeReplayResult.setReplayEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return describeReplayResult;
    }

    private static DescribeReplayResultJsonUnmarshaller instance;

    public static DescribeReplayResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeReplayResultJsonUnmarshaller();
        return instance;
    }
}
