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
package com.amazonaws.services.appconfig.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeploymentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentSummaryJsonUnmarshaller implements Unmarshaller<DeploymentSummary, JsonUnmarshallerContext> {

    public DeploymentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentSummary deploymentSummary = new DeploymentSummary();

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
                if (context.testExpression("DeploymentNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setDeploymentNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setConfigurationVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentDurationInMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setDeploymentDurationInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("GrowthType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setGrowthType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GrowthFactor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setGrowthFactor(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("FinalBakeTimeInMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setFinalBakeTimeInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PercentageComplete", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setPercentageComplete(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("CompletedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentSummary.setCompletedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
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

        return deploymentSummary;
    }

    private static DeploymentSummaryJsonUnmarshaller instance;

    public static DeploymentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentSummaryJsonUnmarshaller();
        return instance;
    }
}
