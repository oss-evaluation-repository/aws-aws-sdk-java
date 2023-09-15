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
 * DeploymentConfigInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentConfigInfoJsonUnmarshaller implements Unmarshaller<DeploymentConfigInfo, JsonUnmarshallerContext> {

    public DeploymentConfigInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentConfigInfo deploymentConfigInfo = new DeploymentConfigInfo();

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
                if (context.testExpression("deploymentConfigId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentConfigInfo.setDeploymentConfigId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentConfigName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentConfigInfo.setDeploymentConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minimumHealthyHosts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentConfigInfo.setMinimumHealthyHosts(MinimumHealthyHostsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentConfigInfo.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("computePlatform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentConfigInfo.setComputePlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("trafficRoutingConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentConfigInfo.setTrafficRoutingConfig(TrafficRoutingConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return deploymentConfigInfo;
    }

    private static DeploymentConfigInfoJsonUnmarshaller instance;

    public static DeploymentConfigInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentConfigInfoJsonUnmarshaller();
        return instance;
    }
}
