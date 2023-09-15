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
package com.amazonaws.services.proton.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.proton.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeploymentState JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentStateJsonUnmarshaller implements Unmarshaller<DeploymentState, JsonUnmarshallerContext> {

    public DeploymentState unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeploymentState deploymentState = new DeploymentState();

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
                if (context.testExpression("component", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentState.setComponent(ComponentStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentState.setEnvironment(EnvironmentStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serviceInstance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentState.setServiceInstance(ServiceInstanceStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("servicePipeline", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deploymentState.setServicePipeline(ServicePipelineStateJsonUnmarshaller.getInstance().unmarshall(context));
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

        return deploymentState;
    }

    private static DeploymentStateJsonUnmarshaller instance;

    public static DeploymentStateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeploymentStateJsonUnmarshaller();
        return instance;
    }
}
