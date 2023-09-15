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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImprovementSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImprovementSummaryJsonUnmarshaller implements Unmarshaller<ImprovementSummary, JsonUnmarshallerContext> {

    public ImprovementSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImprovementSummary improvementSummary = new ImprovementSummary();

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
                if (context.testExpression("QuestionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    improvementSummary.setQuestionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PillarId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    improvementSummary.setPillarId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionTitle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    improvementSummary.setQuestionTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Risk", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    improvementSummary.setRisk(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImprovementPlanUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    improvementSummary.setImprovementPlanUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImprovementPlans", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    improvementSummary.setImprovementPlans(new ListUnmarshaller<ChoiceImprovementPlan>(ChoiceImprovementPlanJsonUnmarshaller.getInstance())

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

        return improvementSummary;
    }

    private static ImprovementSummaryJsonUnmarshaller instance;

    public static ImprovementSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImprovementSummaryJsonUnmarshaller();
        return instance;
    }
}
