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
package com.amazonaws.services.dax.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dax.model.*;
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
                if (context.testExpression("ClusterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalNodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setTotalNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ActiveNodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setActiveNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterDiscoveryEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterDiscoveryEndpoint(EndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NodeIdsToRemove", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setNodeIdsToRemove(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Nodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setNodes(new ListUnmarshaller<Node>(NodeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setNotificationConfiguration(NotificationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SubnetGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSubnetGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSecurityGroups(new ListUnmarshaller<SecurityGroupMembership>(SecurityGroupMembershipJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParameterGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setParameterGroup(ParameterGroupStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SSEDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSSEDescription(SSEDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ClusterEndpointEncryptionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterEndpointEncryptionType(context.getUnmarshaller(String.class).unmarshall(context));
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
