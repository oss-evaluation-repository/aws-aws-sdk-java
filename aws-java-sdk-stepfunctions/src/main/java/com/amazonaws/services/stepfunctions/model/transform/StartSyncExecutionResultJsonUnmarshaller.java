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
 * StartSyncExecutionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSyncExecutionResultJsonUnmarshaller implements Unmarshaller<StartSyncExecutionResult, JsonUnmarshallerContext> {

    public StartSyncExecutionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartSyncExecutionResult startSyncExecutionResult = new StartSyncExecutionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startSyncExecutionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("executionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setExecutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateMachineArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setStateMachineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("stopDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setStopDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cause", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setCause(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("input", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setInputDetails(CloudWatchEventsExecutionDataDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("output", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setOutput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setOutputDetails(CloudWatchEventsExecutionDataDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("traceHeader", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setTraceHeader(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("billingDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSyncExecutionResult.setBillingDetails(BillingDetailsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return startSyncExecutionResult;
    }

    private static StartSyncExecutionResultJsonUnmarshaller instance;

    public static StartSyncExecutionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartSyncExecutionResultJsonUnmarshaller();
        return instance;
    }
}
