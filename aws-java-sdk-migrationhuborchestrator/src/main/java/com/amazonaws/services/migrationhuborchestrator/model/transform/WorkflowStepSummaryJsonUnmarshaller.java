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
package com.amazonaws.services.migrationhuborchestrator.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhuborchestrator.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkflowStepSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkflowStepSummaryJsonUnmarshaller implements Unmarshaller<WorkflowStepSummary, JsonUnmarshallerContext> {

    public WorkflowStepSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkflowStepSummary workflowStepSummary = new WorkflowStepSummary();

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
                if (context.testExpression("stepId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setStepId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stepActionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setStepActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("previous", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setPrevious(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("next", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setNext(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("noOfSrvCompleted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setNoOfSrvCompleted(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("noOfSrvFailed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setNoOfSrvFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalNoOfSrv", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setTotalNoOfSrv(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scriptLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workflowStepSummary.setScriptLocation(context.getUnmarshaller(String.class).unmarshall(context));
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

        return workflowStepSummary;
    }

    private static WorkflowStepSummaryJsonUnmarshaller instance;

    public static WorkflowStepSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkflowStepSummaryJsonUnmarshaller();
        return instance;
    }
}
