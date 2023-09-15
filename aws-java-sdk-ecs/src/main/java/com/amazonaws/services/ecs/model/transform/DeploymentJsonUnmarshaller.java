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
 * Deployment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentJsonUnmarshaller implements Unmarshaller<Deployment, JsonUnmarshallerContext> {

    public Deployment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Deployment deployment = new Deployment();

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
                    deployment.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setTaskDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setDesiredCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pendingCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setPendingCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("runningCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setRunningCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("failedTasks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setFailedTasks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("capacityProviderStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setCapacityProviderStrategy(new ListUnmarshaller<CapacityProviderStrategyItem>(CapacityProviderStrategyItemJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("launchType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platformVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platformFamily", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setPlatformFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rolloutState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setRolloutState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("rolloutStateReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setRolloutStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceConnectConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setServiceConnectConfiguration(ServiceConnectConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serviceConnectResources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deployment.setServiceConnectResources(new ListUnmarshaller<ServiceConnectServiceResource>(ServiceConnectServiceResourceJsonUnmarshaller
                            .getInstance())

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

        return deployment;
    }

    private static DeploymentJsonUnmarshaller instance;

    public static DeploymentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentJsonUnmarshaller();
        return instance;
    }
}
