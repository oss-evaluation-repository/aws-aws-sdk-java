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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Target JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetJsonUnmarshaller implements Unmarshaller<Target, JsonUnmarshallerContext> {

    public Target unmarshall(JsonUnmarshallerContext context) throws Exception {
        Target target = new Target();

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
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Input", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputPath", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setInputPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputTransformer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setInputTransformer(InputTransformerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setKinesisParameters(KinesisParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RunCommandParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setRunCommandParameters(RunCommandParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EcsParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setEcsParameters(EcsParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BatchParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setBatchParameters(BatchParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SqsParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setSqsParameters(SqsParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HttpParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setHttpParameters(HttpParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedshiftDataParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setRedshiftDataParameters(RedshiftDataParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SageMakerPipelineParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setSageMakerPipelineParameters(SageMakerPipelineParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeadLetterConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setDeadLetterConfig(DeadLetterConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RetryPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    target.setRetryPolicy(RetryPolicyJsonUnmarshaller.getInstance().unmarshall(context));
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

        return target;
    }

    private static TargetJsonUnmarshaller instance;

    public static TargetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetJsonUnmarshaller();
        return instance;
    }
}
