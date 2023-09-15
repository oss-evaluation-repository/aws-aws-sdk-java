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
package com.amazonaws.services.servermigration.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicationRun JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationRunJsonUnmarshaller implements Unmarshaller<ReplicationRun, JsonUnmarshallerContext> {

    public ReplicationRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicationRun replicationRun = new ReplicationRun();

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
                if (context.testExpression("replicationRunId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setReplicationRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stageDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setStageDetails(ReplicationRunStageDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("amiId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setAmiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scheduledStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setScheduledStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("completedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setCompletedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encrypted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationRun.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return replicationRun;
    }

    private static ReplicationRunJsonUnmarshaller instance;

    public static ReplicationRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationRunJsonUnmarshaller();
        return instance;
    }
}
