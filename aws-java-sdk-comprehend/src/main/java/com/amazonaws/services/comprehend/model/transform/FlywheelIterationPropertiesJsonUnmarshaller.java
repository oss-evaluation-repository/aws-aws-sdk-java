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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FlywheelIterationProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlywheelIterationPropertiesJsonUnmarshaller implements Unmarshaller<FlywheelIterationProperties, JsonUnmarshallerContext> {

    public FlywheelIterationProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        FlywheelIterationProperties flywheelIterationProperties = new FlywheelIterationProperties();

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
                if (context.testExpression("FlywheelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setFlywheelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FlywheelIterationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setFlywheelIterationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluatedModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setEvaluatedModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluatedModelMetrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setEvaluatedModelMetrics(FlywheelModelEvaluationMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainedModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setTrainedModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainedModelMetrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setTrainedModelMetrics(FlywheelModelEvaluationMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluationManifestS3Prefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flywheelIterationProperties.setEvaluationManifestS3Prefix(context.getUnmarshaller(String.class).unmarshall(context));
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

        return flywheelIterationProperties;
    }

    private static FlywheelIterationPropertiesJsonUnmarshaller instance;

    public static FlywheelIterationPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlywheelIterationPropertiesJsonUnmarshaller();
        return instance;
    }
}
