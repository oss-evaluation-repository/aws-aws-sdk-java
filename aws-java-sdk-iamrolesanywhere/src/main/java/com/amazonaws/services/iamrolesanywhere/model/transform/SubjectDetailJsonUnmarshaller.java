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
package com.amazonaws.services.iamrolesanywhere.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iamrolesanywhere.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SubjectDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubjectDetailJsonUnmarshaller implements Unmarshaller<SubjectDetail, JsonUnmarshallerContext> {

    public SubjectDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        SubjectDetail subjectDetail = new SubjectDetail();

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
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectDetail.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("credentials", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectDetail.setCredentials(new ListUnmarshaller<CredentialSummary>(CredentialSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("enabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectDetail.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("instanceProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectDetail.setInstanceProperties(new ListUnmarshaller<InstanceProperty>(InstancePropertyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lastSeenAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectDetail.setLastSeenAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("subjectArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectDetail.setSubjectArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subjectId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectDetail.setSubjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectDetail.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("x509Subject", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    subjectDetail.setX509Subject(context.getUnmarshaller(String.class).unmarshall(context));
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

        return subjectDetail;
    }

    private static SubjectDetailJsonUnmarshaller instance;

    public static SubjectDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubjectDetailJsonUnmarshaller();
        return instance;
    }
}
