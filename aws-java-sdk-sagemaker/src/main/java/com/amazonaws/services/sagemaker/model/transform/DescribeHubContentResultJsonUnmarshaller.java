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
 * DescribeHubContentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHubContentResultJsonUnmarshaller implements Unmarshaller<DescribeHubContentResult, JsonUnmarshallerContext> {

    public DescribeHubContentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeHubContentResult describeHubContentResult = new DescribeHubContentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeHubContentResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("HubContentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentSchemaVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setDocumentSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentDisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentMarkdown", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentMarkdown(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentDocument", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentDocument(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubContentSearchKeywords", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentSearchKeywords(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("HubContentDependencies", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentDependencies(new ListUnmarshaller<HubContentDependency>(HubContentDependencyJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("HubContentStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setHubContentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHubContentResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return describeHubContentResult;
    }

    private static DescribeHubContentResultJsonUnmarshaller instance;

    public static DescribeHubContentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHubContentResultJsonUnmarshaller();
        return instance;
    }
}
