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
 * DeploymentInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentInfoJsonUnmarshaller implements Unmarshaller<DeploymentInfo, JsonUnmarshallerContext> {

    public DeploymentInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentInfo deploymentInfo = new DeploymentInfo();

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
                    deploymentInfo.setApplicationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setDeploymentGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentConfigName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setDeploymentConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("previousRevision", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setPreviousRevision(RevisionLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("revision", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setRevision(RevisionLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setErrorInformation(ErrorInformationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("completeTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setCompleteTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deploymentOverview", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setDeploymentOverview(DeploymentOverviewJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setCreator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ignoreApplicationStopFailures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setIgnoreApplicationStopFailures(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("autoRollbackConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setAutoRollbackConfiguration(AutoRollbackConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("updateOutdatedInstancesOnly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setUpdateOutdatedInstancesOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("rollbackInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setRollbackInfo(RollbackInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deploymentStyle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setDeploymentStyle(DeploymentStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("targetInstances", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setTargetInstances(TargetInstancesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instanceTerminationWaitTimeStarted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setInstanceTerminationWaitTimeStarted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("blueGreenDeploymentConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loadBalancerInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setLoadBalancerInfo(LoadBalancerInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("additionalDeploymentStatusInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setAdditionalDeploymentStatusInfo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileExistsBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setFileExistsBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentStatusMessages", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setDeploymentStatusMessages(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("computePlatform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setComputePlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setExternalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("relatedDeployments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setRelatedDeployments(RelatedDeploymentsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("overrideAlarmConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentInfo.setOverrideAlarmConfiguration(AlarmConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return deploymentInfo;
    }

    private static DeploymentInfoJsonUnmarshaller instance;

    public static DeploymentInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentInfoJsonUnmarshaller();
        return instance;
    }
}
