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
 * ClusterConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterConfigurationJsonUnmarshaller implements Unmarshaller<ClusterConfiguration, JsonUnmarshallerContext> {

    public ClusterConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ClusterConfiguration clusterConfiguration = new ClusterConfiguration();

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
                    clusterConfiguration.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaintenanceWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TopicArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setTopicArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParameterGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setParameterGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setSubnetGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotRetentionLimit", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setSnapshotRetentionLimit(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setSnapshotWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumShards", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setNumShards(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Shards", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    clusterConfiguration.setShards(new ListUnmarshaller<ShardDetail>(ShardDetailJsonUnmarshaller.getInstance())

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

        return clusterConfiguration;
    }

    private static ClusterConfigurationJsonUnmarshaller instance;

    public static ClusterConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterConfigurationJsonUnmarshaller();
        return instance;
    }
}
