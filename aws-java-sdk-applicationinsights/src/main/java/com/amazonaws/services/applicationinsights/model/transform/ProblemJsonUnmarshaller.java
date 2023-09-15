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
package com.amazonaws.services.applicationinsights.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationinsights.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Problem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProblemJsonUnmarshaller implements Unmarshaller<Problem, JsonUnmarshallerContext> {

    public Problem unmarshall(JsonUnmarshallerContext context) throws Exception {
        Problem problem = new Problem();

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
                    problem.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Insights", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setInsights(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AffectedResource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setAffectedResource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SeverityLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setSeverityLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setResourceGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Feedback", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setFeedback(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("RecurringCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setRecurringCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LastRecurrenceTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setLastRecurrenceTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Visibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResolutionMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    problem.setResolutionMethod(context.getUnmarshaller(String.class).unmarshall(context));
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

        return problem;
    }

    private static ProblemJsonUnmarshaller instance;

    public static ProblemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProblemJsonUnmarshaller();
        return instance;
    }
}
