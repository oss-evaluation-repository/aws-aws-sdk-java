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
package com.amazonaws.services.memorydb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.memorydb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Cluster JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterJsonUnmarshaller implements Unmarshaller<Cluster, JsonUnmarshallerContext> {

    public Cluster unmarshall(JsonUnmarshallerContext context) throws Exception {
        Cluster cluster = new Cluster();

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
                    cluster.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PendingUpdates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setPendingUpdates(ClusterPendingUpdatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NumberOfShards", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setNumberOfShards(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Shards", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setShards(new ListUnmarshaller<Shard>(ShardJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AvailabilityMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setAvailabilityMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterEndpoint(EndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnginePatchVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setEnginePatchVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setParameterGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterGroupStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setParameterGroupStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSecurityGroups(new ListUnmarshaller<SecurityGroupMembership>(SecurityGroupMembershipJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SubnetGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSubnetGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TLSEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setTLSEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSnsTopicArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSnsTopicStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotRetentionLimit", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSnapshotRetentionLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaintenanceWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSnapshotWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ACLName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setACLName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMinorVersionUpgrade", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setAutoMinorVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DataTiering", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setDataTiering(context.getUnmarshaller(String.class).unmarshall(context));
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

        return cluster;
    }

    private static ClusterJsonUnmarshaller instance;

    public static ClusterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonUnmarshaller();
        return instance;
    }
}
