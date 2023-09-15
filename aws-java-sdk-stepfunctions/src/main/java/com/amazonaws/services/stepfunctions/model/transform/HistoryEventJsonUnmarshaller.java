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
 * HistoryEvent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistoryEventJsonUnmarshaller implements Unmarshaller<HistoryEvent, JsonUnmarshallerContext> {

    public HistoryEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        HistoryEvent historyEvent = new HistoryEvent();

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
                if (context.testExpression("timestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("previousEventId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setPreviousEventId(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("activityFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setActivityFailedEventDetails(ActivityFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityScheduleFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setActivityScheduleFailedEventDetails(ActivityScheduleFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityScheduledEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setActivityScheduledEventDetails(ActivityScheduledEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityStartedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setActivityStartedEventDetails(ActivityStartedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activitySucceededEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setActivitySucceededEventDetails(ActivitySucceededEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityTimedOutEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setActivityTimedOutEventDetails(ActivityTimedOutEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setTaskFailedEventDetails(TaskFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskScheduledEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setTaskScheduledEventDetails(TaskScheduledEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskStartFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setTaskStartFailedEventDetails(TaskStartFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskStartedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setTaskStartedEventDetails(TaskStartedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskSubmitFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setTaskSubmitFailedEventDetails(TaskSubmitFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskSubmittedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setTaskSubmittedEventDetails(TaskSubmittedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskSucceededEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setTaskSucceededEventDetails(TaskSucceededEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskTimedOutEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setTaskTimedOutEventDetails(TaskTimedOutEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setExecutionFailedEventDetails(ExecutionFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionStartedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setExecutionStartedEventDetails(ExecutionStartedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionSucceededEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setExecutionSucceededEventDetails(ExecutionSucceededEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionAbortedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setExecutionAbortedEventDetails(ExecutionAbortedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionTimedOutEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setExecutionTimedOutEventDetails(ExecutionTimedOutEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapStateStartedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setMapStateStartedEventDetails(MapStateStartedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapIterationStartedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setMapIterationStartedEventDetails(MapIterationEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapIterationSucceededEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setMapIterationSucceededEventDetails(MapIterationEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapIterationFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setMapIterationFailedEventDetails(MapIterationEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapIterationAbortedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setMapIterationAbortedEventDetails(MapIterationEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setLambdaFunctionFailedEventDetails(LambdaFunctionFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionScheduleFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setLambdaFunctionScheduleFailedEventDetails(LambdaFunctionScheduleFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("lambdaFunctionScheduledEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setLambdaFunctionScheduledEventDetails(LambdaFunctionScheduledEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionStartFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setLambdaFunctionStartFailedEventDetails(LambdaFunctionStartFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("lambdaFunctionSucceededEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setLambdaFunctionSucceededEventDetails(LambdaFunctionSucceededEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionTimedOutEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setLambdaFunctionTimedOutEventDetails(LambdaFunctionTimedOutEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("stateEnteredEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setStateEnteredEventDetails(StateEnteredEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("stateExitedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setStateExitedEventDetails(StateExitedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapRunStartedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setMapRunStartedEventDetails(MapRunStartedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapRunFailedEventDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    historyEvent.setMapRunFailedEventDetails(MapRunFailedEventDetailsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return historyEvent;
    }

    private static HistoryEventJsonUnmarshaller instance;

    public static HistoryEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HistoryEventJsonUnmarshaller();
        return instance;
    }
}
