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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribePredictorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePredictorResultJsonUnmarshaller implements Unmarshaller<DescribePredictorResult, JsonUnmarshallerContext> {

    public DescribePredictorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePredictorResult describePredictorResult = new DescribePredictorResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePredictorResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PredictorArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setPredictorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PredictorName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setPredictorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlgorithmArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setAlgorithmArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLAlgorithmArns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setAutoMLAlgorithmArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ForecastHorizon", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setForecastHorizon(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ForecastTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setForecastTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("PerformAutoML", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setPerformAutoML(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AutoMLOverrideStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setAutoMLOverrideStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PerformHPO", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setPerformHPO(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TrainingParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setTrainingParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("EvaluationParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setEvaluationParameters(EvaluationParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HPOConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setHPOConfig(HyperParameterTuningJobConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setInputDataConfig(InputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FeaturizationConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setFeaturizationConfig(FeaturizationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setEncryptionConfig(EncryptionConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PredictorExecutionDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setPredictorExecutionDetails(PredictorExecutionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EstimatedTimeRemainingInMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setEstimatedTimeRemainingInMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("IsAutoPredictor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setIsAutoPredictor(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DatasetImportJobArns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setDatasetImportJobArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OptimizationMetric", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePredictorResult.setOptimizationMetric(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describePredictorResult;
    }

    private static DescribePredictorResultJsonUnmarshaller instance;

    public static DescribePredictorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePredictorResultJsonUnmarshaller();
        return instance;
    }
}
