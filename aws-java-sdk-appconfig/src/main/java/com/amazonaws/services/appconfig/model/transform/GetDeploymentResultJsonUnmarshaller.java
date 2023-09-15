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
 * GetDeploymentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentResultJsonUnmarshaller implements Unmarshaller<GetDeploymentResult, JsonUnmarshallerContext> {

    public GetDeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDeploymentResult getDeploymentResult = new GetDeploymentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDeploymentResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnvironmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentStrategyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setDeploymentStrategyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationProfileId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setConfigurationProfileId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setDeploymentNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationLocationUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setConfigurationLocationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setConfigurationVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentDurationInMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setDeploymentDurationInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("GrowthType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setGrowthType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GrowthFactor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setGrowthFactor(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("FinalBakeTimeInMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setFinalBakeTimeInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventLog", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setEventLog(new ListUnmarshaller<DeploymentEvent>(DeploymentEventJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PercentageComplete", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setPercentageComplete(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("StartedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setStartedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("CompletedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setCompletedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("AppliedExtensions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setAppliedExtensions(new ListUnmarshaller<AppliedExtension>(AppliedExtensionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("KmsKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setKmsKeyIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getDeploymentResult;
    }

    private static GetDeploymentResultJsonUnmarshaller instance;

    public static GetDeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDeploymentResultJsonUnmarshaller();
        return instance;
    }
}
