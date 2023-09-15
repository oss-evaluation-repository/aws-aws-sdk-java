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
package com.amazonaws.services.cleanrooms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CollaborationAnalysisTemplateSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollaborationAnalysisTemplateSummaryJsonUnmarshaller implements Unmarshaller<CollaborationAnalysisTemplateSummary, JsonUnmarshallerContext> {

    public CollaborationAnalysisTemplateSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        CollaborationAnalysisTemplateSummary collaborationAnalysisTemplateSummary = new CollaborationAnalysisTemplateSummary();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collaborationAnalysisTemplateSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collaborationAnalysisTemplateSummary.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collaborationAnalysisTemplateSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collaborationAnalysisTemplateSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collaborationAnalysisTemplateSummary.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collaborationAnalysisTemplateSummary.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collaborationAnalysisTemplateSummary.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creatorAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collaborationAnalysisTemplateSummary.setCreatorAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collaborationAnalysisTemplateSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
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

        return collaborationAnalysisTemplateSummary;
    }

    private static CollaborationAnalysisTemplateSummaryJsonUnmarshaller instance;

    public static CollaborationAnalysisTemplateSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CollaborationAnalysisTemplateSummaryJsonUnmarshaller();
        return instance;
    }
}
