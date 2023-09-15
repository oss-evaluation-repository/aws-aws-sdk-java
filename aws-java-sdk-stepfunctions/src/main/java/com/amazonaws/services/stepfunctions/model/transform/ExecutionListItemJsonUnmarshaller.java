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
 * ExecutionListItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionListItemJsonUnmarshaller implements Unmarshaller<ExecutionListItem, JsonUnmarshallerContext> {

    public ExecutionListItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        ExecutionListItem executionListItem = new ExecutionListItem();

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
                if (context.testExpression("executionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setExecutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateMachineArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setStateMachineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("stopDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setStopDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("mapRunArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setMapRunArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("itemCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setItemCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("stateMachineVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setStateMachineVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateMachineAliasArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    executionListItem.setStateMachineAliasArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return executionListItem;
    }

    private static ExecutionListItemJsonUnmarshaller instance;

    public static ExecutionListItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExecutionListItemJsonUnmarshaller();
        return instance;
    }
}
