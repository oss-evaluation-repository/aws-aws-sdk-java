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
package com.amazonaws.services.autoscalingplans.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.autoscalingplans.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScalingInstruction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScalingInstructionJsonUnmarshaller implements Unmarshaller<ScalingInstruction, JsonUnmarshallerContext> {

    public ScalingInstruction unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScalingInstruction scalingInstruction = new ScalingInstruction();

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
                if (context.testExpression("ServiceNamespace", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setServiceNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScalableDimension", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setScalableDimension(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setMinCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setMaxCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TargetTrackingConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setTargetTrackingConfigurations(new ListUnmarshaller<TargetTrackingConfiguration>(
                            TargetTrackingConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PredefinedLoadMetricSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction
                            .setPredefinedLoadMetricSpecification(PredefinedLoadMetricSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomizedLoadMetricSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction
                            .setCustomizedLoadMetricSpecification(CustomizedLoadMetricSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ScheduledActionBufferTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setScheduledActionBufferTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PredictiveScalingMaxCapacityBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setPredictiveScalingMaxCapacityBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PredictiveScalingMaxCapacityBuffer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setPredictiveScalingMaxCapacityBuffer(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PredictiveScalingMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setPredictiveScalingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScalingPolicyUpdateBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setScalingPolicyUpdateBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisableDynamicScaling", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scalingInstruction.setDisableDynamicScaling(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return scalingInstruction;
    }

    private static ScalingInstructionJsonUnmarshaller instance;

    public static ScalingInstructionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScalingInstructionJsonUnmarshaller();
        return instance;
    }
}
