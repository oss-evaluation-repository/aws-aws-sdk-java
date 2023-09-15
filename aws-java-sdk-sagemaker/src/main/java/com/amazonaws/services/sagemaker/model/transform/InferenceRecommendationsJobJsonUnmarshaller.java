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
 * InferenceRecommendationsJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceRecommendationsJobJsonUnmarshaller implements Unmarshaller<InferenceRecommendationsJob, JsonUnmarshallerContext> {

    public InferenceRecommendationsJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        InferenceRecommendationsJob inferenceRecommendationsJob = new InferenceRecommendationsJob();

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
                if (context.testExpression("JobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setJobDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SamplePayloadUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setSamplePayloadUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inferenceRecommendationsJob.setModelPackageVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return inferenceRecommendationsJob;
    }

    private static InferenceRecommendationsJobJsonUnmarshaller instance;

    public static InferenceRecommendationsJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InferenceRecommendationsJobJsonUnmarshaller();
        return instance;
    }
}
