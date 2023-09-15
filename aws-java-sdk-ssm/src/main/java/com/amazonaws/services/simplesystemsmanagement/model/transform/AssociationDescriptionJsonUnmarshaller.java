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
 * AssociationDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationDescriptionJsonUnmarshaller implements Unmarshaller<AssociationDescription, JsonUnmarshallerContext> {

    public AssociationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssociationDescription associationDescription = new AssociationDescription();

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
                    associationDescription.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setAssociationVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Date", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdateAssociationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setLastUpdateAssociationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setStatus(AssociationStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Overview", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setOverview(AssociationOverviewJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutomationTargetParameterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setAutomationTargetParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setParameters(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("AssociationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ScheduleExpression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setScheduleExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setOutputLocation(InstanceAssociationOutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastExecutionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setLastExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulExecutionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setLastSuccessfulExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AssociationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setAssociationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComplianceSeverity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setComplianceSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SyncCompliance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setSyncCompliance(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplyOnlyAtCronInterval", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setApplyOnlyAtCronInterval(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CalendarNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setCalendarNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("TargetLocations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setTargetLocations(new ListUnmarshaller<TargetLocation>(TargetLocationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ScheduleOffset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setScheduleOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TargetMaps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setTargetMaps(new ListUnmarshaller<java.util.Map<String, java.util.List<String>>>(
                            new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class), new ListUnmarshaller<String>(context
                                    .getUnmarshaller(String.class))

                            ))

                    .unmarshall(context));
                }
                if (context.testExpression("AlarmConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setAlarmConfiguration(AlarmConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TriggeredAlarms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associationDescription.setTriggeredAlarms(new ListUnmarshaller<AlarmStateInformation>(AlarmStateInformationJsonUnmarshaller.getInstance())

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

        return associationDescription;
    }

    private static AssociationDescriptionJsonUnmarshaller instance;

    public static AssociationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociationDescriptionJsonUnmarshaller();
        return instance;
    }
}
