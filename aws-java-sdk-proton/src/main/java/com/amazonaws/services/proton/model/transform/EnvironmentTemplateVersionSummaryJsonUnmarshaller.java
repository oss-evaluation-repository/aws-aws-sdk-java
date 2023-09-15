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
package com.amazonaws.services.proton.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.proton.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EnvironmentTemplateVersionSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentTemplateVersionSummaryJsonUnmarshaller implements Unmarshaller<EnvironmentTemplateVersionSummary, JsonUnmarshallerContext> {

    public EnvironmentTemplateVersionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        EnvironmentTemplateVersionSummary environmentTemplateVersionSummary = new EnvironmentTemplateVersionSummary();

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
                    environmentTemplateVersionSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environmentTemplateVersionSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environmentTemplateVersionSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environmentTemplateVersionSummary.setLastModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("majorVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environmentTemplateVersionSummary.setMajorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minorVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environmentTemplateVersionSummary.setMinorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommendedMinorVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environmentTemplateVersionSummary.setRecommendedMinorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environmentTemplateVersionSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environmentTemplateVersionSummary.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environmentTemplateVersionSummary.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return environmentTemplateVersionSummary;
    }

    private static EnvironmentTemplateVersionSummaryJsonUnmarshaller instance;

    public static EnvironmentTemplateVersionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentTemplateVersionSummaryJsonUnmarshaller();
        return instance;
    }
}
