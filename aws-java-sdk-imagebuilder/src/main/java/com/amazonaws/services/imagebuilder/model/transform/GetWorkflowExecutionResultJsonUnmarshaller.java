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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetWorkflowExecutionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowExecutionResultJsonUnmarshaller implements Unmarshaller<GetWorkflowExecutionResult, JsonUnmarshallerContext> {

    public GetWorkflowExecutionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWorkflowExecutionResult getWorkflowExecutionResult = new GetWorkflowExecutionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getWorkflowExecutionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("requestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowBuildVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setWorkflowBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setWorkflowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageBuildVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setImageBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalStepCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setTotalStepCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalStepsSucceeded", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setTotalStepsSucceeded(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalStepsFailed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setTotalStepsFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalStepsSkipped", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setTotalStepsSkipped(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowExecutionResult.setEndTime(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getWorkflowExecutionResult;
    }

    private static GetWorkflowExecutionResultJsonUnmarshaller instance;

    public static GetWorkflowExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetWorkflowExecutionResultJsonUnmarshaller();
        return instance;
    }
}
