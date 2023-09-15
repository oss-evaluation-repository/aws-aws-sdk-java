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
 * Pipeline JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineJsonUnmarshaller implements Unmarshaller<Pipeline, JsonUnmarshallerContext> {

    public Pipeline unmarshall(JsonUnmarshallerContext context) throws Exception {
        Pipeline pipeline = new Pipeline();

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
                if (context.testExpression("PipelineArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setPipelineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineDisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setPipelineDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setPipelineDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PipelineStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setPipelineStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastRunTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setLastRunTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ParallelismConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setParallelismConfiguration(ParallelismConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeline.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return pipeline;
    }

    private static PipelineJsonUnmarshaller instance;

    public static PipelineJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineJsonUnmarshaller();
        return instance;
    }
}
