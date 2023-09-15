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
package com.amazonaws.services.sagemakeredgemanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakeredgemanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeploymentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentResultJsonUnmarshaller implements Unmarshaller<DeploymentResult, JsonUnmarshallerContext> {

    public DeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentResult deploymentResult = new DeploymentResult();

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
                if (context.testExpression("DeploymentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentResult.setDeploymentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentResult.setDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentResult.setDeploymentStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentResult.setDeploymentStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeploymentEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentResult.setDeploymentEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeploymentModels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentResult.setDeploymentModels(new ListUnmarshaller<DeploymentModel>(DeploymentModelJsonUnmarshaller.getInstance())

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

        return deploymentResult;
    }

    private static DeploymentResultJsonUnmarshaller instance;

    public static DeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentResultJsonUnmarshaller();
        return instance;
    }
}
