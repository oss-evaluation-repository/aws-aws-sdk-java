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
 * GetWorkflowStepExecutionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWorkflowStepExecutionResultJsonUnmarshaller implements Unmarshaller<GetWorkflowStepExecutionResult, JsonUnmarshallerContext> {

    public GetWorkflowStepExecutionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetWorkflowStepExecutionResult getWorkflowStepExecutionResult = new GetWorkflowStepExecutionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getWorkflowStepExecutionResult;
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
                    getWorkflowStepExecutionResult.setRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stepExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setStepExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowBuildVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setWorkflowBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setWorkflowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageBuildVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setImageBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("action", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rollbackStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setRollbackStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setInputs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setOutputs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setEndTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("onFailure", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setOnFailure(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeoutSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getWorkflowStepExecutionResult.setTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return getWorkflowStepExecutionResult;
    }

    private static GetWorkflowStepExecutionResultJsonUnmarshaller instance;

    public static GetWorkflowStepExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetWorkflowStepExecutionResultJsonUnmarshaller();
        return instance;
    }
}
