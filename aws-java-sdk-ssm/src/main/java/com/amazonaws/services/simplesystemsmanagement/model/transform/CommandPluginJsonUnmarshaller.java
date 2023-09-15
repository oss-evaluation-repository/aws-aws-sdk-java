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
 * CommandPlugin JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommandPluginJsonUnmarshaller implements Unmarshaller<CommandPlugin, JsonUnmarshallerContext> {

    public CommandPlugin unmarshall(JsonUnmarshallerContext context) throws Exception {
        CommandPlugin commandPlugin = new CommandPlugin();

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
                    commandPlugin.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResponseCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setResponseCode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ResponseStartDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setResponseStartDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResponseFinishDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setResponseFinishDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Output", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setOutput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardOutputUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setStandardOutputUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StandardErrorUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setStandardErrorUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3Region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setOutputS3Region(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3BucketName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setOutputS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputS3KeyPrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    commandPlugin.setOutputS3KeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
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

        return commandPlugin;
    }

    private static CommandPluginJsonUnmarshaller instance;

    public static CommandPluginJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommandPluginJsonUnmarshaller();
        return instance;
    }
}
