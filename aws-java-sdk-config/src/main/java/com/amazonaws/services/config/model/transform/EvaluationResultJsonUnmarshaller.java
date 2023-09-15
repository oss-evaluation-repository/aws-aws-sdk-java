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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EvaluationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationResultJsonUnmarshaller implements Unmarshaller<EvaluationResult, JsonUnmarshallerContext> {

    public EvaluationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        EvaluationResult evaluationResult = new EvaluationResult();

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
                if (context.testExpression("EvaluationResultIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    evaluationResult.setEvaluationResultIdentifier(EvaluationResultIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ComplianceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    evaluationResult.setComplianceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResultRecordedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    evaluationResult.setResultRecordedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ConfigRuleInvokedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    evaluationResult.setConfigRuleInvokedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Annotation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    evaluationResult.setAnnotation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResultToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    evaluationResult.setResultToken(context.getUnmarshaller(String.class).unmarshall(context));
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

        return evaluationResult;
    }

    private static EvaluationResultJsonUnmarshaller instance;

    public static EvaluationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EvaluationResultJsonUnmarshaller();
        return instance;
    }
}
