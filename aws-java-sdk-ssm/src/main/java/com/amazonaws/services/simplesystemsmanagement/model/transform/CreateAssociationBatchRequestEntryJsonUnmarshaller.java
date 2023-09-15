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

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateAssociationBatchRequestEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssociationBatchRequestEntryJsonUnmarshaller implements Unmarshaller<CreateAssociationBatchRequestEntry, JsonUnmarshallerContext> {

    public CreateAssociationBatchRequestEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateAssociationBatchRequestEntry createAssociationBatchRequestEntry = new CreateAssociationBatchRequestEntry();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setParameters(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("AutomationTargetParameterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setAutomationTargetParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ScheduleExpression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setScheduleExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setOutputLocation(InstanceAssociationOutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AssociationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setAssociationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComplianceSeverity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setComplianceSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SyncCompliance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setSyncCompliance(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplyOnlyAtCronInterval", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setApplyOnlyAtCronInterval(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CalendarNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setCalendarNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("TargetLocations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setTargetLocations(new ListUnmarshaller<TargetLocation>(TargetLocationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ScheduleOffset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setScheduleOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TargetMaps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setTargetMaps(new ListUnmarshaller<java.util.Map<String, java.util.List<String>>>(
                            new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class), new ListUnmarshaller<String>(context
                                    .getUnmarshaller(String.class))

                            ))

                    .unmarshall(context));
                }
                if (context.testExpression("AlarmConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createAssociationBatchRequestEntry.setAlarmConfiguration(AlarmConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return createAssociationBatchRequestEntry;
    }

    private static CreateAssociationBatchRequestEntryJsonUnmarshaller instance;

    public static CreateAssociationBatchRequestEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateAssociationBatchRequestEntryJsonUnmarshaller();
        return instance;
    }
}
