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
 * MaintenanceWindowExecutionTaskIdentity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowExecutionTaskIdentityJsonUnmarshaller implements Unmarshaller<MaintenanceWindowExecutionTaskIdentity, JsonUnmarshallerContext> {

    public MaintenanceWindowExecutionTaskIdentity unmarshall(JsonUnmarshallerContext context) throws Exception {
        MaintenanceWindowExecutionTaskIdentity maintenanceWindowExecutionTaskIdentity = new MaintenanceWindowExecutionTaskIdentity();

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
                    maintenanceWindowExecutionTaskIdentity.setWindowExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskIdentity.setTaskExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskIdentity.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskIdentity.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskIdentity.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskIdentity.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TaskArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskIdentity.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskIdentity.setTaskType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskIdentity.setAlarmConfiguration(AlarmConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TriggeredAlarms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowExecutionTaskIdentity.setTriggeredAlarms(new ListUnmarshaller<AlarmStateInformation>(AlarmStateInformationJsonUnmarshaller
                            .getInstance())

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

        return maintenanceWindowExecutionTaskIdentity;
    }

    private static MaintenanceWindowExecutionTaskIdentityJsonUnmarshaller instance;

    public static MaintenanceWindowExecutionTaskIdentityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowExecutionTaskIdentityJsonUnmarshaller();
        return instance;
    }
}
