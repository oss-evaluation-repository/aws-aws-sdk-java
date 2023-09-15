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
 * AccessPreviewFinding JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPreviewFindingJsonUnmarshaller implements Unmarshaller<AccessPreviewFinding, JsonUnmarshallerContext> {

    public AccessPreviewFinding unmarshall(JsonUnmarshallerContext context) throws Exception {
        AccessPreviewFinding accessPreviewFinding = new AccessPreviewFinding();

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
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("existingFindingId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setExistingFindingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("existingFindingStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setExistingFindingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("principal", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setPrincipal(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("action", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setAction(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("condition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setCondition(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("resource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setResource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isPublic", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setIsPublic(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("changeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setChangeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceOwnerAccount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setResourceOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("error", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    accessPreviewFinding.setSources(new ListUnmarshaller<FindingSource>(FindingSourceJsonUnmarshaller.getInstance())

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

        return accessPreviewFinding;
    }

    private static AccessPreviewFindingJsonUnmarshaller instance;

    public static AccessPreviewFindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AccessPreviewFindingJsonUnmarshaller();
        return instance;
    }
}
