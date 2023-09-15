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
 * DescribePipelineResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePipelineResultJsonUnmarshaller implements Unmarshaller<DescribePipelineResult, JsonUnmarshallerContext> {

    public DescribePipelineResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePipelineResult describePipelineResult = new DescribePipelineResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePipelineResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PipelineArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setPipelineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineDisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setPipelineDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setPipelineDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setPipelineDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setPipelineStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastRunTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setLastRunTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ParallelismConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipelineResult.setParallelismConfiguration(ParallelismConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describePipelineResult;
    }

    private static DescribePipelineResultJsonUnmarshaller instance;

    public static DescribePipelineResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePipelineResultJsonUnmarshaller();
        return instance;
    }
}
