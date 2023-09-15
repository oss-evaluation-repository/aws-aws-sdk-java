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
 * PipelineExecutionStepMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineExecutionStepMetadataJsonUnmarshaller implements Unmarshaller<PipelineExecutionStepMetadata, JsonUnmarshallerContext> {

    public PipelineExecutionStepMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipelineExecutionStepMetadata pipelineExecutionStepMetadata = new PipelineExecutionStepMetadata();

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
                if (context.testExpression("TrainingJob", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setTrainingJob(TrainingJobStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingJob", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setProcessingJob(ProcessingJobStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TransformJob", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setTransformJob(TransformJobStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TuningJob", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setTuningJob(TuningJobStepMetaDataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Model", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setModel(ModelStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RegisterModel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setRegisterModel(RegisterModelStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Condition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setCondition(ConditionStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Callback", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setCallback(CallbackStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Lambda", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setLambda(LambdaStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("QualityCheck", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setQualityCheck(QualityCheckStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ClarifyCheck", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setClarifyCheck(ClarifyCheckStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EMR", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setEMR(EMRStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Fail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setFail(FailStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AutoMLJob", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipelineExecutionStepMetadata.setAutoMLJob(AutoMLJobStepMetadataJsonUnmarshaller.getInstance().unmarshall(context));
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

        return pipelineExecutionStepMetadata;
    }

    private static PipelineExecutionStepMetadataJsonUnmarshaller instance;

    public static PipelineExecutionStepMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineExecutionStepMetadataJsonUnmarshaller();
        return instance;
    }
}
