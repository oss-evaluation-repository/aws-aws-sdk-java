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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MaintenanceWindowExecutionTaskInvocationIdentity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowExecutionTaskInvocationIdentityJsonUnmarshaller implements
        Unmarshaller<MaintenanceWindowExecutionTaskInvocationIdentity, JsonUnmarshallerContext> {

    public MaintenanceWindowExecutionTaskInvocationIdentity unmarshall(JsonUnmarshallerContext context) throws Exception {
        MaintenanceWindowExecutionTaskInvocationIdentity maintenanceWindowExecutionTaskInvocationIdentity = new MaintenanceWindowExecutionTaskInvocationIdentity();

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
                if (context.testExpression("WindowExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setWindowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setTaskExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvocationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setInvocationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setTaskType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setParameters(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OwnerInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setOwnerInformation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WindowTargetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskInvocationIdentity.setWindowTargetId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return maintenanceWindowExecutionTaskInvocationIdentity;
    }

    private static MaintenanceWindowExecutionTaskInvocationIdentityJsonUnmarshaller instance;

    public static MaintenanceWindowExecutionTaskInvocationIdentityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowExecutionTaskInvocationIdentityJsonUnmarshaller();
        return instance;
    }
}
