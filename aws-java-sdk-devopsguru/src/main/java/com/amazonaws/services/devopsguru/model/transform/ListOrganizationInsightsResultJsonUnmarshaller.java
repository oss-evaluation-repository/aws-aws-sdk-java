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
package com.amazonaws.services.devopsguru.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListOrganizationInsightsResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOrganizationInsightsResultJsonUnmarshaller implements Unmarshaller<ListOrganizationInsightsResult, JsonUnmarshallerContext> {

    public ListOrganizationInsightsResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListOrganizationInsightsResult listOrganizationInsightsResult = new ListOrganizationInsightsResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return listOrganizationInsightsResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ProactiveInsights", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listOrganizationInsightsResult.setProactiveInsights(new ListUnmarshaller<ProactiveOrganizationInsightSummary>(
                            ProactiveOrganizationInsightSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ReactiveInsights", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listOrganizationInsightsResult.setReactiveInsights(new ListUnmarshaller<ReactiveOrganizationInsightSummary>(
                            ReactiveOrganizationInsightSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listOrganizationInsightsResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
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

        return listOrganizationInsightsResult;
    }

    private static ListOrganizationInsightsResultJsonUnmarshaller instance;

    public static ListOrganizationInsightsResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListOrganizationInsightsResultJsonUnmarshaller();
        return instance;
    }
}
