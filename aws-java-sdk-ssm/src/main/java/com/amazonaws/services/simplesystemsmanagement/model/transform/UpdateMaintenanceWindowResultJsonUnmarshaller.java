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
 * UpdateMaintenanceWindowResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateMaintenanceWindowResultJsonUnmarshaller implements Unmarshaller<UpdateMaintenanceWindowResult, JsonUnmarshallerContext> {

    public UpdateMaintenanceWindowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateMaintenanceWindowResult updateMaintenanceWindowResult = new UpdateMaintenanceWindowResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateMaintenanceWindowResult;
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
                    updateMaintenanceWindowResult.setWindowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setStartDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setEndDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleTimezone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setScheduleTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleOffset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setScheduleOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Cutoff", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setCutoff(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AllowUnassociatedTargets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setAllowUnassociatedTargets(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateMaintenanceWindowResult.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return updateMaintenanceWindowResult;
    }

    private static UpdateMaintenanceWindowResultJsonUnmarshaller instance;

    public static UpdateMaintenanceWindowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateMaintenanceWindowResultJsonUnmarshaller();
        return instance;
    }
}
