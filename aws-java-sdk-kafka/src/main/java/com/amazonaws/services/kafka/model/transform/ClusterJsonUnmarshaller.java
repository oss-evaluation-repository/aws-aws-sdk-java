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
package com.amazonaws.services.kafka.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kafka.model.*;
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
                if (context.testExpression("activeOperationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setActiveOperationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("currentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setCurrentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setStateInfo(StateInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("provisioned", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setProvisioned(ProvisionedJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serverless", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setServerless(ServerlessJsonUnmarshaller.getInstance().unmarshall(context));
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
