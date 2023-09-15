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
package com.amazonaws.services.codedeploy.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeploymentGroupInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentGroupInfoJsonUnmarshaller implements Unmarshaller<DeploymentGroupInfo, JsonUnmarshallerContext> {

    public DeploymentGroupInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentGroupInfo deploymentGroupInfo = new DeploymentGroupInfo();

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
                if (context.testExpression("applicationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setApplicationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setDeploymentGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setDeploymentGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentConfigName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setDeploymentConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ec2TagFilters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setEc2TagFilters(new ListUnmarshaller<EC2TagFilter>(EC2TagFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("onPremisesInstanceTagFilters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setOnPremisesInstanceTagFilters(new ListUnmarshaller<TagFilter>(TagFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("autoScalingGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setAutoScalingGroups(new ListUnmarshaller<AutoScalingGroup>(AutoScalingGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("serviceRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetRevision", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setTargetRevision(RevisionLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("triggerConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setTriggerConfigurations(new ListUnmarshaller<TriggerConfig>(TriggerConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("alarmConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setAlarmConfiguration(AlarmConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("autoRollbackConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setAutoRollbackConfiguration(AutoRollbackConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deploymentStyle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setDeploymentStyle(DeploymentStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("outdatedInstancesStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setOutdatedInstancesStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("blueGreenDeploymentConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loadBalancerInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setLoadBalancerInfo(LoadBalancerInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastSuccessfulDeployment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setLastSuccessfulDeployment(LastDeploymentInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastAttemptedDeployment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setLastAttemptedDeployment(LastDeploymentInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2TagSet", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setEc2TagSet(EC2TagSetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("onPremisesTagSet", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setOnPremisesTagSet(OnPremisesTagSetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("computePlatform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setComputePlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ecsServices", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentGroupInfo.setEcsServices(new ListUnmarshaller<ECSService>(ECSServiceJsonUnmarshaller.getInstance())

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

        return deploymentGroupInfo;
    }

    private static DeploymentGroupInfoJsonUnmarshaller instance;

    public static DeploymentGroupInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentGroupInfoJsonUnmarshaller();
        return instance;
    }
}
