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
 * HyperParameterTuningJobSearchEntity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HyperParameterTuningJobSearchEntityJsonUnmarshaller implements Unmarshaller<HyperParameterTuningJobSearchEntity, JsonUnmarshallerContext> {

    public HyperParameterTuningJobSearchEntity unmarshall(JsonUnmarshallerContext context) throws Exception {
        HyperParameterTuningJobSearchEntity hyperParameterTuningJobSearchEntity = new HyperParameterTuningJobSearchEntity();

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
                if (context.testExpression("HyperParameterTuningJobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setHyperParameterTuningJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setHyperParameterTuningJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningJobConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setHyperParameterTuningJobConfig(HyperParameterTuningJobConfigJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("TrainingJobDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setTrainingJobDefinition(HyperParameterTrainingJobDefinitionJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("TrainingJobDefinitions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setTrainingJobDefinitions(new ListUnmarshaller<HyperParameterTrainingJobDefinition>(
                            HyperParameterTrainingJobDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningJobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setHyperParameterTuningJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("HyperParameterTuningEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setHyperParameterTuningEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(
                            context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingJobStatusCounters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setTrainingJobStatusCounters(TrainingJobStatusCountersJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ObjectiveStatusCounters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setObjectiveStatusCounters(ObjectiveStatusCountersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BestTrainingJob", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setBestTrainingJob(HyperParameterTrainingJobSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OverallBestTrainingJob", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setOverallBestTrainingJob(HyperParameterTrainingJobSummaryJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("WarmStartConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setWarmStartConfig(HyperParameterTuningJobWarmStartConfigJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TuningJobCompletionDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setTuningJobCompletionDetails(HyperParameterTuningJobCompletionDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ConsumedResources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hyperParameterTuningJobSearchEntity.setConsumedResources(HyperParameterTuningJobConsumedResourcesJsonUnmarshaller.getInstance().unmarshall(
                            context));
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

        return hyperParameterTuningJobSearchEntity;
    }

    private static HyperParameterTuningJobSearchEntityJsonUnmarshaller instance;

    public static HyperParameterTuningJobSearchEntityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTuningJobSearchEntityJsonUnmarshaller();
        return instance;
    }
}
