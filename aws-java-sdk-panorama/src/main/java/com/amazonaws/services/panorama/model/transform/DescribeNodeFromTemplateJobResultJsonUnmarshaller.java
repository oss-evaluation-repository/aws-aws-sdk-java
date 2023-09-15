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
package com.amazonaws.services.panorama.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeNodeFromTemplateJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeNodeFromTemplateJobResultJsonUnmarshaller implements Unmarshaller<DescribeNodeFromTemplateJobResult, JsonUnmarshallerContext> {

    public DescribeNodeFromTemplateJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeNodeFromTemplateJobResult describeNodeFromTemplateJobResult = new DescribeNodeFromTemplateJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeNodeFromTemplateJobResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("JobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setJobTags(new ListUnmarshaller<JobResourceTags>(JobResourceTagsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NodeDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setNodeDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setNodeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputPackageName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setOutputPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputPackageVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setOutputPackageVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setTemplateParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TemplateType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeNodeFromTemplateJobResult.setTemplateType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeNodeFromTemplateJobResult;
    }

    private static DescribeNodeFromTemplateJobResultJsonUnmarshaller instance;

    public static DescribeNodeFromTemplateJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeNodeFromTemplateJobResultJsonUnmarshaller();
        return instance;
    }
}
