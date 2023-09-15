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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeArchiveResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeArchiveResultJsonUnmarshaller implements Unmarshaller<DescribeArchiveResult, JsonUnmarshallerContext> {

    public DescribeArchiveResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeArchiveResult describeArchiveResult = new DescribeArchiveResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeArchiveResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ArchiveArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setArchiveArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ArchiveName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setArchiveName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventSourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setEventSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventPattern", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setEventPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetentionDays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setRetentionDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SizeBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EventCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setEventCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeArchiveResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return describeArchiveResult;
    }

    private static DescribeArchiveResultJsonUnmarshaller instance;

    public static DescribeArchiveResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeArchiveResultJsonUnmarshaller();
        return instance;
    }
}
