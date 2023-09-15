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
package com.amazonaws.services.docdbelastic.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.docdbelastic.model.*;
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
                if (context.testExpression("adminUserName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setAdminUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setAuthType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("preferredMaintenanceWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shardCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setShardCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shardCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setShardCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subnetIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("vpcSecurityGroupIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setVpcSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return cluster;
    }

    private static ClusterJsonUnmarshaller instance;

    public static ClusterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonUnmarshaller();
        return instance;
    }
}
