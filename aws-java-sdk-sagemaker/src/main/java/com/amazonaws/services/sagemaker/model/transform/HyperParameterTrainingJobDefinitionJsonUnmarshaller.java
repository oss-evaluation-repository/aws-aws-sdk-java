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
 * HyperParameterTrainingJobDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTrainingJobDefinitionJsonUnmarshaller implements Unmarshaller<HyperParameterTrainingJobDefinition, JsonUnmarshallerContext> {

    public HyperParameterTrainingJobDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        HyperParameterTrainingJobDefinition hyperParameterTrainingJobDefinition = new HyperParameterTrainingJobDefinition();

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
                if (context.testExpression("DefinitionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setDefinitionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TuningObjective", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setTuningObjective(HyperParameterTuningJobObjectiveJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HyperParameterRanges", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setHyperParameterRanges(ParameterRangesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StaticHyperParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setStaticHyperParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class),
                            context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AlgorithmSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setAlgorithmSpecification(HyperParameterAlgorithmSpecificationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setInputDataConfig(new ListUnmarshaller<Channel>(ChannelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setResourceConfig(ResourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setStoppingCondition(StoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EnableNetworkIsolation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setEnableNetworkIsolation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableInterContainerTrafficEncryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setEnableInterContainerTrafficEncryption(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableManagedSpotTraining", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setEnableManagedSpotTraining(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CheckpointConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setCheckpointConfig(CheckpointConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RetryStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setRetryStrategy(RetryStrategyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningResourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setHyperParameterTuningResourceConfig(HyperParameterTuningResourceConfigJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTrainingJobDefinition.setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

        return hyperParameterTrainingJobDefinition;
    }

    private static HyperParameterTrainingJobDefinitionJsonUnmarshaller instance;

    public static HyperParameterTrainingJobDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTrainingJobDefinitionJsonUnmarshaller();
        return instance;
    }
}
