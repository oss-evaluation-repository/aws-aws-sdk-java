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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DocumentIdentifier JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentIdentifierJsonUnmarshaller implements Unmarshaller<DocumentIdentifier, JsonUnmarshallerContext> {

    public DocumentIdentifier unmarshall(JsonUnmarshallerContext context) throws Exception {
        DocumentIdentifier documentIdentifier = new DocumentIdentifier();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setVersionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setPlatformTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setDocumentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setDocumentFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setTargetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Requires", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setRequires(new ListUnmarshaller<DocumentRequires>(DocumentRequiresJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ReviewStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setReviewStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Author", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentIdentifier.setAuthor(context.getUnmarshaller(String.class).unmarshall(context));
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

        return documentIdentifier;
    }

    private static DocumentIdentifierJsonUnmarshaller instance;

    public static DocumentIdentifierJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentIdentifierJsonUnmarshaller();
        return instance;
    }
}
