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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
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
                if (context.testExpression("configuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setConfiguration(ClusterConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("registeredContainerInstancesCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setRegisteredContainerInstancesCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("runningTasksCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setRunningTasksCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pendingTasksCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setPendingTasksCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("activeServicesCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setActiveServicesCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("statistics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setStatistics(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("settings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSettings(new ListUnmarshaller<ClusterSetting>(ClusterSettingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("capacityProviders", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setCapacityProviders(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("defaultCapacityProviderStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setDefaultCapacityProviderStrategy(new ListUnmarshaller<CapacityProviderStrategyItem>(CapacityProviderStrategyItemJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("attachments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setAttachments(new ListUnmarshaller<Attachment>(AttachmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("attachmentsStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setAttachmentsStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceConnectDefaults", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setServiceConnectDefaults(ClusterServiceConnectDefaultsJsonUnmarshaller.getInstance().unmarshall(context));
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
