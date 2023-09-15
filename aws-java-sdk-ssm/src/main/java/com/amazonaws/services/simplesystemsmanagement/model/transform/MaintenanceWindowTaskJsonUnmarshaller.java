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
 * MaintenanceWindowTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceWindowTaskJsonUnmarshaller implements Unmarshaller<MaintenanceWindowTask, JsonUnmarshallerContext> {

    public MaintenanceWindowTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        MaintenanceWindowTask maintenanceWindowTask = new MaintenanceWindowTask();

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
                if (context.testExpression("WindowId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setWindowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WindowTaskId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setWindowTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TaskParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setTaskParameters(new MapUnmarshaller<String, MaintenanceWindowTaskParameterValueExpression>(context
                            .getUnmarshaller(String.class), MaintenanceWindowTaskParameterValueExpressionJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LoggingInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setLoggingInfo(LoggingInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CutoffBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setCutoffBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    maintenanceWindowTask.setAlarmConfiguration(AlarmConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return maintenanceWindowTask;
    }

    private static MaintenanceWindowTaskJsonUnmarshaller instance;

    public static MaintenanceWindowTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MaintenanceWindowTaskJsonUnmarshaller();
        return instance;
    }
}
