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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeModelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelResultJsonUnmarshaller implements Unmarshaller<DescribeModelResult, JsonUnmarshallerContext> {

    public DescribeModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeModelResult describeModelResult = new DescribeModelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeModelResult;
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
                    describeModelResult.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setDatasetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setDatasetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setSchema(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE)
                            .unmarshall(context));
                }
                if (context.testExpression("LabelsInputConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setLabelsInputConfiguration(LabelsInputConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TrainingDataStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setTrainingDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingDataEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setTrainingDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EvaluationDataStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setEvaluationDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EvaluationDataEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setEvaluationDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataPreProcessingConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setDataPreProcessingConfiguration(DataPreProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrainingExecutionStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setTrainingExecutionStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingExecutionEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setTrainingExecutionEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailedReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setFailedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelMetrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setModelMetrics(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE).unmarshall(
                            context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ServerSideKmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setServerSideKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OffCondition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setOffCondition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceModelVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setSourceModelVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportJobStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setImportJobStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ImportJobEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setImportJobEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ActiveModelVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setActiveModelVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ActiveModelVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setActiveModelVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelVersionActivatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setModelVersionActivatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PreviousActiveModelVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setPreviousActiveModelVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("PreviousActiveModelVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setPreviousActiveModelVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreviousModelVersionActivatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setPreviousModelVersionActivatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("PriorModelMetrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setPriorModelMetrics(context.getUnmarshaller(String.class, JsonUnmarshallerContext.UnmarshallerType.JSON_VALUE)
                            .unmarshall(context));
                }
                if (context.testExpression("LatestScheduledRetrainingFailedReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setLatestScheduledRetrainingFailedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestScheduledRetrainingStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setLatestScheduledRetrainingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestScheduledRetrainingModelVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setLatestScheduledRetrainingModelVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LatestScheduledRetrainingStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setLatestScheduledRetrainingStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LatestScheduledRetrainingAvailableDataInDays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setLatestScheduledRetrainingAvailableDataInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NextScheduledRetrainingStartDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setNextScheduledRetrainingStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AccumulatedInferenceDataStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setAccumulatedInferenceDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AccumulatedInferenceDataEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setAccumulatedInferenceDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RetrainingSchedulerStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeModelResult.setRetrainingSchedulerStatus(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeModelResult;
    }

    private static DescribeModelResultJsonUnmarshaller instance;

    public static DescribeModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeModelResultJsonUnmarshaller();
        return instance;
    }
}
