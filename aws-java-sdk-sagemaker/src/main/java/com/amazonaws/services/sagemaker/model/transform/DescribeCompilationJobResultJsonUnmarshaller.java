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
 * DescribeCompilationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCompilationJobResultJsonUnmarshaller implements Unmarshaller<DescribeCompilationJobResult, JsonUnmarshallerContext> {

    public DescribeCompilationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeCompilationJobResult describeCompilationJobResult = new DescribeCompilationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeCompilationJobResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CompilationJobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setCompilationJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompilationJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setCompilationJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompilationJobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setCompilationJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompilationStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setCompilationStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompilationEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setCompilationEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setStoppingCondition(StoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InferenceImage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setInferenceImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setModelPackageVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArtifacts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setModelArtifacts(ModelArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelDigests", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setModelDigests(ModelDigestsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setInputConfig(InputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setOutputConfig(OutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setVpcConfig(NeoVpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DerivedInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeCompilationJobResult.setDerivedInformation(DerivedInformationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeCompilationJobResult;
    }

    private static DescribeCompilationJobResultJsonUnmarshaller instance;

    public static DescribeCompilationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCompilationJobResultJsonUnmarshaller();
        return instance;
    }
}
