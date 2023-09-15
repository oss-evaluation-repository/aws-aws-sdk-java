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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Model JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelJsonUnmarshaller implements Unmarshaller<Model, JsonUnmarshallerContext> {

    public Model unmarshall(JsonUnmarshallerContext context) throws Exception {
        Model model = new Model();

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
                if (context.testExpression("ModelName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrimaryContainer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setPrimaryContainer(ContainerDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Containers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setContainers(new ListUnmarshaller<ContainerDefinition>(ContainerDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InferenceExecutionConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setInferenceExecutionConfig(InferenceExecutionConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnableNetworkIsolation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setEnableNetworkIsolation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DeploymentRecommendation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    model.setDeploymentRecommendation(DeploymentRecommendationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return model;
    }

    private static ModelJsonUnmarshaller instance;

    public static ModelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelJsonUnmarshaller();
        return instance;
    }
}
