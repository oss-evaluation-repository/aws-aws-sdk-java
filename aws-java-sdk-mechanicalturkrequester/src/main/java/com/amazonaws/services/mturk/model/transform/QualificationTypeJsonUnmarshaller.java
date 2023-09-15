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
package com.amazonaws.services.mturk.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mturk.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * QualificationType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QualificationTypeJsonUnmarshaller implements Unmarshaller<QualificationType, JsonUnmarshallerContext> {

    public QualificationType unmarshall(JsonUnmarshallerContext context) throws Exception {
        QualificationType qualificationType = new QualificationType();

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
                if (context.testExpression("QualificationTypeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setQualificationTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Keywords", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setKeywords(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QualificationTypeStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setQualificationTypeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Test", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setTest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TestDurationInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setTestDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("AnswerKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setAnswerKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetryDelayInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setRetryDelayInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("IsRequestable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setIsRequestable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AutoGranted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setAutoGranted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AutoGrantedValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    qualificationType.setAutoGrantedValue(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return qualificationType;
    }

    private static QualificationTypeJsonUnmarshaller instance;

    public static QualificationTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QualificationTypeJsonUnmarshaller();
        return instance;
    }
}
