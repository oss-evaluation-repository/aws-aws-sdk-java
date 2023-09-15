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
package com.amazonaws.services.codegurureviewer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codegurureviewer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CodeReview JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeReviewJsonUnmarshaller implements Unmarshaller<CodeReview, JsonUnmarshallerContext> {

    public CodeReview unmarshall(JsonUnmarshallerContext context) throws Exception {
        CodeReview codeReview = new CodeReview();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeReviewArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setCodeReviewArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RepositoryName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setRepositoryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProviderType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setProviderType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimeStamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setCreatedTimeStamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTimeStamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setLastUpdatedTimeStamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PullRequestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setPullRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceCodeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setSourceCodeType(SourceCodeTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AssociationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setAssociationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setMetrics(MetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AnalysisTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setAnalysisTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ConfigFileState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    codeReview.setConfigFileState(context.getUnmarshaller(String.class).unmarshall(context));
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

        return codeReview;
    }

    private static CodeReviewJsonUnmarshaller instance;

    public static CodeReviewJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CodeReviewJsonUnmarshaller();
        return instance;
    }
}
