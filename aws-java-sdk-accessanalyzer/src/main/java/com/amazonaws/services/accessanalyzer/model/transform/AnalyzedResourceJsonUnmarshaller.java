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
package com.amazonaws.services.accessanalyzer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.accessanalyzer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AnalyzedResource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyzedResourceJsonUnmarshaller implements Unmarshaller<AnalyzedResource, JsonUnmarshallerContext> {

    public AnalyzedResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        AnalyzedResource analyzedResource = new AnalyzedResource();

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
                if (context.testExpression("resourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("analyzedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setAnalyzedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("isPublic", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setIsPublic(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("actions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("sharedVia", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setSharedVia(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceOwnerAccount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setResourceOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    analyzedResource.setError(context.getUnmarshaller(String.class).unmarshall(context));
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

        return analyzedResource;
    }

    private static AnalyzedResourceJsonUnmarshaller instance;

    public static AnalyzedResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AnalyzedResourceJsonUnmarshaller();
        return instance;
    }
}
