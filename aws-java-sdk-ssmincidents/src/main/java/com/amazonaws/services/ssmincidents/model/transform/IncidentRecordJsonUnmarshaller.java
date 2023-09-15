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
package com.amazonaws.services.ssmincidents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssmincidents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * IncidentRecord JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncidentRecordJsonUnmarshaller implements Unmarshaller<IncidentRecord, JsonUnmarshallerContext> {

    public IncidentRecord unmarshall(JsonUnmarshallerContext context) throws Exception {
        IncidentRecord incidentRecord = new IncidentRecord();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("automationExecutions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setAutomationExecutions(new ListUnmarshaller<AutomationExecution>(AutomationExecutionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("chatChannel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setChatChannel(ChatChannelJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("dedupeString", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setDedupeString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("impact", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setImpact(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("incidentRecordSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setIncidentRecordSource(IncidentRecordSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastModifiedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("notificationTargets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setNotificationTargets(new ListUnmarshaller<NotificationTargetItem>(NotificationTargetItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resolvedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setResolvedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("summary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setSummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    incidentRecord.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
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

        return incidentRecord;
    }

    private static IncidentRecordJsonUnmarshaller instance;

    public static IncidentRecordJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IncidentRecordJsonUnmarshaller();
        return instance;
    }
}
