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
package com.amazonaws.services.stepfunctions.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.stepfunctions.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeMapRunResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMapRunResultJsonUnmarshaller implements Unmarshaller<DescribeMapRunResult, JsonUnmarshallerContext> {

    public DescribeMapRunResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeMapRunResult describeMapRunResult = new DescribeMapRunResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeMapRunResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("mapRunArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setMapRunArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setExecutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("stopDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setStopDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("maxConcurrency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setMaxConcurrency(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("toleratedFailurePercentage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setToleratedFailurePercentage(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("toleratedFailureCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setToleratedFailureCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("itemCounts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setItemCounts(MapRunItemCountsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionCounts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeMapRunResult.setExecutionCounts(MapRunExecutionCountsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeMapRunResult;
    }

    private static DescribeMapRunResultJsonUnmarshaller instance;

    public static DescribeMapRunResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMapRunResultJsonUnmarshaller();
        return instance;
    }
}
