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
 * TrainingJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingJobJsonUnmarshaller implements Unmarshaller<TrainingJob, JsonUnmarshallerContext> {

    public TrainingJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        TrainingJob trainingJob = new TrainingJob();

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
                if (context.testExpression("TrainingJobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setTrainingJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setTrainingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TuningJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setTuningJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LabelingJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setLabelingJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setAutoMLJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArtifacts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setModelArtifacts(ModelArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingJobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setTrainingJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecondaryStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setSecondaryStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HyperParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setHyperParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AlgorithmSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setAlgorithmSpecification(AlgorithmSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setInputDataConfig(new ListUnmarshaller<Channel>(ChannelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setResourceConfig(ResourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setStoppingCondition(StoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setTrainingStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setTrainingEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SecondaryStatusTransitions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setSecondaryStatusTransitions(new ListUnmarshaller<SecondaryStatusTransition>(SecondaryStatusTransitionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FinalMetricDataList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setFinalMetricDataList(new ListUnmarshaller<MetricData>(MetricDataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EnableNetworkIsolation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setEnableNetworkIsolation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableInterContainerTrafficEncryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setEnableInterContainerTrafficEncryption(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableManagedSpotTraining", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setEnableManagedSpotTraining(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CheckpointConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setCheckpointConfig(CheckpointConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingTimeInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setTrainingTimeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BillableTimeInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setBillableTimeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DebugHookConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setDebugHookConfig(DebugHookConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExperimentConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setExperimentConfig(ExperimentConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DebugRuleConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setDebugRuleConfigurations(new ListUnmarshaller<DebugRuleConfiguration>(DebugRuleConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TensorBoardOutputConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setTensorBoardOutputConfig(TensorBoardOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DebugRuleEvaluationStatuses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setDebugRuleEvaluationStatuses(new ListUnmarshaller<DebugRuleEvaluationStatus>(DebugRuleEvaluationStatusJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProfilerConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setProfilerConfig(ProfilerConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob
                            .setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("RetryStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setRetryStrategy(RetryStrategyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    trainingJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return trainingJob;
    }

    private static TrainingJobJsonUnmarshaller instance;

    public static TrainingJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrainingJobJsonUnmarshaller();
        return instance;
    }
}
