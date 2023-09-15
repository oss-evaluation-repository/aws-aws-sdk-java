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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecommendationTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationTemplateJsonUnmarshaller implements Unmarshaller<RecommendationTemplate, JsonUnmarshallerContext> {

    public RecommendationTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommendationTemplate recommendationTemplate = new RecommendationTemplate();

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
                if (context.testExpression("appArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setAssessmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("format", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("needsReplacements", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setNeedsReplacements(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("recommendationIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setRecommendationIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("recommendationTemplateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setRecommendationTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendationTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setRecommendationTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("templatesLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationTemplate.setTemplatesLocation(S3LocationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return recommendationTemplate;
    }

    private static RecommendationTemplateJsonUnmarshaller instance;

    public static RecommendationTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationTemplateJsonUnmarshaller();
        return instance;
    }
}
