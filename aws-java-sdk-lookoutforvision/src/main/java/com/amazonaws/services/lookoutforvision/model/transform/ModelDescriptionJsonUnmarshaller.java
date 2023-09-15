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
package com.amazonaws.services.lookoutforvision.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutforvision.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ModelDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDescriptionJsonUnmarshaller implements Unmarshaller<ModelDescription, JsonUnmarshallerContext> {

    public ModelDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModelDescription modelDescription = new ModelDescription();

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
                if (context.testExpression("ModelVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Performance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setPerformance(ModelPerformanceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setOutputConfig(OutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluationManifest", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setEvaluationManifest(OutputS3ObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluationResult", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setEvaluationResult(OutputS3ObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluationEndTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setEvaluationEndTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MinInferenceUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setMinInferenceUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxInferenceUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelDescription.setMaxInferenceUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return modelDescription;
    }

    private static ModelDescriptionJsonUnmarshaller instance;

    public static ModelDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelDescriptionJsonUnmarshaller();
        return instance;
    }
}
