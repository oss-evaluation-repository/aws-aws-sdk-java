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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsEcsServiceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsServiceDetailsJsonUnmarshaller implements Unmarshaller<AwsEcsServiceDetails, JsonUnmarshallerContext> {

    public AwsEcsServiceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEcsServiceDetails awsEcsServiceDetails = new AwsEcsServiceDetails();

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
                if (context.testExpression("CapacityProviderStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setCapacityProviderStrategy(new ListUnmarshaller<AwsEcsServiceCapacityProviderStrategyDetails>(
                            AwsEcsServiceCapacityProviderStrategyDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Cluster", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setCluster(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setDeploymentConfiguration(AwsEcsServiceDeploymentConfigurationDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("DeploymentController", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setDeploymentController(AwsEcsServiceDeploymentControllerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DesiredCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setDesiredCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EnableEcsManagedTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setEnableEcsManagedTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableExecuteCommand", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setEnableExecuteCommand(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HealthCheckGracePeriodSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setHealthCheckGracePeriodSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("LaunchType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoadBalancers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setLoadBalancers(new ListUnmarshaller<AwsEcsServiceLoadBalancersDetails>(
                            AwsEcsServiceLoadBalancersDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setNetworkConfiguration(AwsEcsServiceNetworkConfigurationDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PlacementConstraints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setPlacementConstraints(new ListUnmarshaller<AwsEcsServicePlacementConstraintsDetails>(
                            AwsEcsServicePlacementConstraintsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PlacementStrategies", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setPlacementStrategies(new ListUnmarshaller<AwsEcsServicePlacementStrategiesDetails>(
                            AwsEcsServicePlacementStrategiesDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PlatformVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PropagateTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setPropagateTags(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchedulingStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setSchedulingStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRegistries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setServiceRegistries(new ListUnmarshaller<AwsEcsServiceServiceRegistriesDetails>(
                            AwsEcsServiceServiceRegistriesDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TaskDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsServiceDetails.setTaskDefinition(context.getUnmarshaller(String.class).unmarshall(context));
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

        return awsEcsServiceDetails;
    }

    private static AwsEcsServiceDetailsJsonUnmarshaller instance;

    public static AwsEcsServiceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEcsServiceDetailsJsonUnmarshaller();
        return instance;
    }
}
