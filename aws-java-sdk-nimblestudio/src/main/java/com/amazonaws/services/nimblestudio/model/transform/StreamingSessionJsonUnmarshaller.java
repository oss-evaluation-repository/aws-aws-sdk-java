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
 * StreamingSession JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamingSessionJsonUnmarshaller implements Unmarshaller<StreamingSession, JsonUnmarshallerContext> {

    public StreamingSession unmarshall(JsonUnmarshallerContext context) throws Exception {
        StreamingSession streamingSession = new StreamingSession();

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
                    streamingSession.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("automaticTerminationMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setAutomaticTerminationMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backupMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setBackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ec2InstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setEc2InstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchProfileId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setLaunchProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxBackupsToRetain", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setMaxBackupsToRetain(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ownedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setOwnedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sessionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sessionPersistenceMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setSessionPersistenceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("startedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startedFromBackupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setStartedFromBackupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stopAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setStopAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("stoppedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setStoppedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("stoppedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setStoppedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("streamingImageId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setStreamingImageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("terminateAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setTerminateAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setVolumeConfiguration(VolumeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("volumeRetentionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    streamingSession.setVolumeRetentionMode(context.getUnmarshaller(String.class).unmarshall(context));
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

        return streamingSession;
    }

    private static StreamingSessionJsonUnmarshaller instance;

    public static StreamingSessionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StreamingSessionJsonUnmarshaller();
        return instance;
    }
}
