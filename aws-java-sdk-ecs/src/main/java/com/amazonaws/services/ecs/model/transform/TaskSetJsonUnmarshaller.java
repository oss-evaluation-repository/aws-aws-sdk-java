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
 * TaskSet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskSetJsonUnmarshaller implements Unmarshaller<TaskSet, JsonUnmarshallerContext> {

    public TaskSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        TaskSet taskSet = new TaskSet();

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
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskSetArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setTaskSetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setExternalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setTaskDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("computedDesiredCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setComputedDesiredCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pendingCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setPendingCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("runningCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setRunningCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("launchType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capacityProviderStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setCapacityProviderStrategy(new ListUnmarshaller<CapacityProviderStrategyItem>(CapacityProviderStrategyItemJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("platformVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platformFamily", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setPlatformFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loadBalancers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setLoadBalancers(new ListUnmarshaller<LoadBalancer>(LoadBalancerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("serviceRegistries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setServiceRegistries(new ListUnmarshaller<ServiceRegistry>(ServiceRegistryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scale", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setScale(ScaleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("stabilityStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setStabilityStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stabilityStatusAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setStabilityStatusAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    taskSet.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return taskSet;
    }

    private static TaskSetJsonUnmarshaller instance;

    public static TaskSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskSetJsonUnmarshaller();
        return instance;
    }
}
