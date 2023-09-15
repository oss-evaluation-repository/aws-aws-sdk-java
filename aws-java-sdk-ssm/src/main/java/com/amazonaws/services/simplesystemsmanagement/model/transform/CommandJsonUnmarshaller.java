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
 * Command JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommandJsonUnmarshaller implements Unmarshaller<Command, JsonUnmarshallerContext> {

    public Command unmarshall(JsonUnmarshallerContext context) throws Exception {
        Command command = new Command();

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
                if (context.testExpression("CommandId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setCommandId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Comment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpiresAfter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setExpiresAfter(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setParameters(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("InstanceIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setInstanceIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Targets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setTargets(new ListUnmarshaller<Target>(TargetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RequestedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setRequestedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3Region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setOutputS3Region(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3BucketName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setOutputS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3KeyPrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setOutputS3KeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setMaxConcurrency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setMaxErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setTargetCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompletedCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setCompletedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ErrorCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setErrorCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DeliveryTimedOutCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setDeliveryTimedOutCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setNotificationConfig(NotificationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchOutputConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setCloudWatchOutputConfig(CloudWatchOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimeoutSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AlarmConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setAlarmConfiguration(AlarmConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TriggeredAlarms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setTriggeredAlarms(new ListUnmarshaller<AlarmStateInformation>(AlarmStateInformationJsonUnmarshaller.getInstance())

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

        return command;
    }

    private static CommandJsonUnmarshaller instance;

    public static CommandJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommandJsonUnmarshaller();
        return instance;
    }
}
