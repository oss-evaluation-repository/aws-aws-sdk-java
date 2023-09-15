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
 * AutomationExecutionMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationExecutionMetadataJsonUnmarshaller implements Unmarshaller<AutomationExecutionMetadata, JsonUnmarshallerContext> {

    public AutomationExecutionMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutomationExecutionMetadata automationExecutionMetadata = new AutomationExecutionMetadata();

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
                if (context.testExpression("AutomationExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setAutomationExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutomationExecutionStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setAutomationExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setExecutionStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutionEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setExecutionEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setExecutedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogFile", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setLogFile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setOutputs(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("Mode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParentAutomationExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setParentAutomationExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentStepName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setCurrentStepName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentAction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setCurrentAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetParameterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setTargetParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TargetMaps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setTargetMaps(new ListUnmarshaller<java.util.Map<String, java.util.List<String>>>(
                            new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class), new ListUnmarshaller<String>(context
                                    .getUnmarshaller(String.class))

                            ))

                    .unmarshall(context));
                }
                if (context.testExpression("ResolvedTargets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setResolvedTargets(ResolvedTargetsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Target", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutomationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setAutomationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setAlarmConfiguration(AlarmConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TriggeredAlarms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setTriggeredAlarms(new ListUnmarshaller<AlarmStateInformation>(AlarmStateInformationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AutomationSubtype", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setAutomationSubtype(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduledTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setScheduledTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Runbooks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setRunbooks(new ListUnmarshaller<Runbook>(RunbookJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OpsItemId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setOpsItemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChangeRequestName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecutionMetadata.setChangeRequestName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return automationExecutionMetadata;
    }

    private static AutomationExecutionMetadataJsonUnmarshaller instance;

    public static AutomationExecutionMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutomationExecutionMetadataJsonUnmarshaller();
        return instance;
    }
}
