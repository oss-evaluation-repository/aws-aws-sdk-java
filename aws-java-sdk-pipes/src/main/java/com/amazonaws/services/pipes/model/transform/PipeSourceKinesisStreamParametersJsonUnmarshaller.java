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
package com.amazonaws.services.pipes.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PipeSourceKinesisStreamParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeSourceKinesisStreamParametersJsonUnmarshaller implements Unmarshaller<PipeSourceKinesisStreamParameters, JsonUnmarshallerContext> {

    public PipeSourceKinesisStreamParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipeSourceKinesisStreamParameters pipeSourceKinesisStreamParameters = new PipeSourceKinesisStreamParameters();

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
                if (context.testExpression("BatchSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceKinesisStreamParameters.setBatchSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DeadLetterConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceKinesisStreamParameters.setDeadLetterConfig(DeadLetterConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumBatchingWindowInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceKinesisStreamParameters.setMaximumBatchingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaximumRecordAgeInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceKinesisStreamParameters.setMaximumRecordAgeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaximumRetryAttempts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceKinesisStreamParameters.setMaximumRetryAttempts(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OnPartialBatchItemFailure", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceKinesisStreamParameters.setOnPartialBatchItemFailure(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParallelizationFactor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceKinesisStreamParameters.setParallelizationFactor(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StartingPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceKinesisStreamParameters.setStartingPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPositionTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceKinesisStreamParameters
                            .setStartingPositionTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return pipeSourceKinesisStreamParameters;
    }

    private static PipeSourceKinesisStreamParametersJsonUnmarshaller instance;

    public static PipeSourceKinesisStreamParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipeSourceKinesisStreamParametersJsonUnmarshaller();
        return instance;
    }
}
