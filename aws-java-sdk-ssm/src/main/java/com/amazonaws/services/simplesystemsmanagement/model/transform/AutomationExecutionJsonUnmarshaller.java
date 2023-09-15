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
 * AutomationExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationExecutionJsonUnmarshaller implements Unmarshaller<AutomationExecution, JsonUnmarshallerContext> {

    public AutomationExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutomationExecution automationExecution = new AutomationExecution();

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
                    automationExecution.setAutomationExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setExecutionStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutionEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setExecutionEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AutomationExecutionStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setAutomationExecutionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StepExecutions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setStepExecutions(new ListUnmarshaller<StepExecution>(StepExecutionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StepExecutionsTruncated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setStepExecutionsTruncated(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setParameters(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setOutputs(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("FailureMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Mode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParentAutomationExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setParentAutomationExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setExecutedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentStepName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setCurrentStepName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentAction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setCurrentAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetParameterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setTargetParameterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TargetMaps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setTargetMaps(new ListUnmarshaller<java.util.Map<String, java.util.List<String>>>(
                            new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class), new ListUnmarshaller<String>(context
                                    .getUnmarshaller(String.class))

                            ))

                    .unmarshall(context));
                }
                if (context.testExpression("ResolvedTargets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setResolvedTargets(ResolvedTargetsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Target", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetLocations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setTargetLocations(new ListUnmarshaller<TargetLocation>(TargetLocationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProgressCounters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setProgressCounters(ProgressCountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AlarmConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setAlarmConfiguration(AlarmConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TriggeredAlarms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setTriggeredAlarms(new ListUnmarshaller<AlarmStateInformation>(AlarmStateInformationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AutomationSubtype", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setAutomationSubtype(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduledTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setScheduledTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Runbooks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setRunbooks(new ListUnmarshaller<Runbook>(RunbookJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OpsItemId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setOpsItemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChangeRequestName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationExecution.setChangeRequestName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return automationExecution;
    }

    private static AutomationExecutionJsonUnmarshaller instance;

    public static AutomationExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutomationExecutionJsonUnmarshaller();
        return instance;
    }
}
