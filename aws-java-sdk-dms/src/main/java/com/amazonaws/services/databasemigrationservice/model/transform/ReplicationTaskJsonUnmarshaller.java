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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReplicationTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTaskJsonUnmarshaller implements Unmarshaller<ReplicationTask, JsonUnmarshallerContext> {

    public ReplicationTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReplicationTask replicationTask = new ReplicationTask();

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
                if (context.testExpression("ReplicationTaskIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setReplicationTaskIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceEndpointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setSourceEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetEndpointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setTargetEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setReplicationInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MigrationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setMigrationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setTableMappings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setReplicationTaskSettings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastFailureMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setLastFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StopReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setStopReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskCreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setReplicationTaskCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskStartDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setReplicationTaskStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CdcStartPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setCdcStartPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CdcStopPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setCdcStopPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecoveryCheckpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setRecoveryCheckpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setReplicationTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationTaskStats", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setReplicationTaskStats(ReplicationTaskStatsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TaskData", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setTaskData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetReplicationInstanceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    replicationTask.setTargetReplicationInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return replicationTask;
    }

    private static ReplicationTaskJsonUnmarshaller instance;

    public static ReplicationTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationTaskJsonUnmarshaller();
        return instance;
    }
}
