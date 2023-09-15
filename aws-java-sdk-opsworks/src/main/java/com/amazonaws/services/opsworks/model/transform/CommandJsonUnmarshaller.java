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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
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
                if (context.testExpression("InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AcknowledgedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setAcknowledgedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompletedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setCompletedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExitCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setExitCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LogUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setLogUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    command.setType(context.getUnmarshaller(String.class).unmarshall(context));
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
