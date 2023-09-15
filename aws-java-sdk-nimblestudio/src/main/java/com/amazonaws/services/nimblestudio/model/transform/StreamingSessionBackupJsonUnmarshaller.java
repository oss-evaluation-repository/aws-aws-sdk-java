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
package com.amazonaws.services.nimblestudio.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StreamingSessionBackup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingSessionBackupJsonUnmarshaller implements Unmarshaller<StreamingSessionBackup, JsonUnmarshallerContext> {

    public StreamingSessionBackup unmarshall(JsonUnmarshallerContext context) throws Exception {
        StreamingSessionBackup streamingSessionBackup = new StreamingSessionBackup();

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
                    streamingSessionBackup.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSessionBackup.setBackupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSessionBackup.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("launchProfileId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSessionBackup.setLaunchProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSessionBackup.setOwnedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sessionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSessionBackup.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSessionBackup.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSessionBackup.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSessionBackup.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSessionBackup.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

        return streamingSessionBackup;
    }

    private static StreamingSessionBackupJsonUnmarshaller instance;

    public static StreamingSessionBackupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamingSessionBackupJsonUnmarshaller();
        return instance;
    }
}
