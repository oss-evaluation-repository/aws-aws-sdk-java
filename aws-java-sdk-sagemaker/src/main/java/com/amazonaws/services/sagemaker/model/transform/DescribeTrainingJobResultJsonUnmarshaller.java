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
 * DescribeTrainingJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeTrainingJobResultJsonUnmarshaller implements Unmarshaller<DescribeTrainingJobResult, JsonUnmarshallerContext> {

    public DescribeTrainingJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeTrainingJobResult describeTrainingJobResult = new DescribeTrainingJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeTrainingJobResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TrainingJobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setTrainingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setTrainingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TuningJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setTuningJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelingJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setLabelingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setAutoMLJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArtifacts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setModelArtifacts(ModelArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingJobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setTrainingJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecondaryStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setSecondaryStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HyperParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setHyperParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AlgorithmSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setAlgorithmSpecification(AlgorithmSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setInputDataConfig(new ListUnmarshaller<Channel>(ChannelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setResourceConfig(ResourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setStoppingCondition(StoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setTrainingStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setTrainingEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SecondaryStatusTransitions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setSecondaryStatusTransitions(new ListUnmarshaller<SecondaryStatusTransition>(
                            SecondaryStatusTransitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FinalMetricDataList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setFinalMetricDataList(new ListUnmarshaller<MetricData>(MetricDataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EnableNetworkIsolation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setEnableNetworkIsolation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableInterContainerTrafficEncryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setEnableInterContainerTrafficEncryption(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableManagedSpotTraining", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setEnableManagedSpotTraining(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CheckpointConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setCheckpointConfig(CheckpointConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingTimeInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setTrainingTimeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BillableTimeInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setBillableTimeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DebugHookConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setDebugHookConfig(DebugHookConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExperimentConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setExperimentConfig(ExperimentConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DebugRuleConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setDebugRuleConfigurations(new ListUnmarshaller<DebugRuleConfiguration>(DebugRuleConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TensorBoardOutputConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setTensorBoardOutputConfig(TensorBoardOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DebugRuleEvaluationStatuses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setDebugRuleEvaluationStatuses(new ListUnmarshaller<DebugRuleEvaluationStatus>(
                            DebugRuleEvaluationStatusJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProfilerConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setProfilerConfig(ProfilerConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProfilerRuleConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setProfilerRuleConfigurations(new ListUnmarshaller<ProfilerRuleConfiguration>(
                            ProfilerRuleConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProfilerRuleEvaluationStatuses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setProfilerRuleEvaluationStatuses(new ListUnmarshaller<ProfilerRuleEvaluationStatus>(
                            ProfilerRuleEvaluationStatusJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProfilingStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setProfilingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetryStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setRetryStrategy(RetryStrategyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("WarmPoolStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeTrainingJobResult.setWarmPoolStatus(WarmPoolStatusJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeTrainingJobResult;
    }

    private static DescribeTrainingJobResultJsonUnmarshaller instance;

    public static DescribeTrainingJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeTrainingJobResultJsonUnmarshaller();
        return instance;
    }
}
