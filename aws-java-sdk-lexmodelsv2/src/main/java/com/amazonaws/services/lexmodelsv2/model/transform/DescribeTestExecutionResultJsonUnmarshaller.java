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
 * DescribeTestExecutionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTestExecutionResultJsonUnmarshaller implements Unmarshaller<DescribeTestExecutionResult, JsonUnmarshallerContext> {

    public DescribeTestExecutionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTestExecutionResult describeTestExecutionResult = new DescribeTestExecutionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTestExecutionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("testExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setTestExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("testExecutionStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setTestExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setTestSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSetName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setTestSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setTarget(TestExecutionTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("apiMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setApiMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testExecutionModality", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setTestExecutionModality(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReasons", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTestExecutionResult.setFailureReasons(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return describeTestExecutionResult;
    }

    private static DescribeTestExecutionResultJsonUnmarshaller instance;

    public static DescribeTestExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTestExecutionResultJsonUnmarshaller();
        return instance;
    }
}
