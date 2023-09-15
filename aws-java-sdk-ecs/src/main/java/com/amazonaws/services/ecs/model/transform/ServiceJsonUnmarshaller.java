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
 * Service JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceJsonUnmarshaller implements Unmarshaller<Service, JsonUnmarshallerContext> {

    public Service unmarshall(JsonUnmarshallerContext context) throws Exception {
        Service service = new Service();

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
                if (context.testExpression("serviceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loadBalancers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setLoadBalancers(new ListUnmarshaller<LoadBalancer>(LoadBalancerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("serviceRegistries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setServiceRegistries(new ListUnmarshaller<ServiceRegistry>(ServiceRegistryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setDesiredCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("runningCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setRunningCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pendingCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setPendingCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("launchType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capacityProviderStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setCapacityProviderStrategy(new ListUnmarshaller<CapacityProviderStrategyItem>(CapacityProviderStrategyItemJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("platformVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platformFamily", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setPlatformFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setTaskDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setDeploymentConfiguration(DeploymentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskSets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setTaskSets(new ListUnmarshaller<TaskSet>(TaskSetJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("deployments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setDeployments(new ListUnmarshaller<Deployment>(DeploymentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("events", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setEvents(new ListUnmarshaller<ServiceEvent>(ServiceEventJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("placementConstraints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setPlacementConstraints(new ListUnmarshaller<PlacementConstraint>(PlacementConstraintJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("placementStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setPlacementStrategy(new ListUnmarshaller<PlacementStrategy>(PlacementStrategyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("networkConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("healthCheckGracePeriodSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setHealthCheckGracePeriodSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("schedulingStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setSchedulingStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentController", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setDeploymentController(DeploymentControllerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableECSManagedTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setEnableECSManagedTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("propagateTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setPropagateTags(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableExecuteCommand", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    service.setEnableExecuteCommand(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return service;
    }

    private static ServiceJsonUnmarshaller instance;

    public static ServiceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ServiceJsonUnmarshaller();
        return instance;
    }
}
