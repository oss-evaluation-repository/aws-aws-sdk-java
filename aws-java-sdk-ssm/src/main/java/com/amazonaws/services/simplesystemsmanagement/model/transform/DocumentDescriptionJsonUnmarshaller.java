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
 * DocumentDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentDescriptionJsonUnmarshaller implements Unmarshaller<DocumentDescription, JsonUnmarshallerContext> {

    public DocumentDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        DocumentDescription documentDescription = new DocumentDescription();

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
                if (context.testExpression("Sha1", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setSha1(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Hash", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setHash(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HashType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setHashType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setVersionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setStatusInformation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setParameters(new ListUnmarshaller<DocumentParameter>(DocumentParameterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PlatformTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setPlatformTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DocumentType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setDocumentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SchemaVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setLatestVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setDefaultVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DocumentFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setDocumentFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setTargetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AttachmentsInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setAttachmentsInformation(new ListUnmarshaller<AttachmentInformation>(AttachmentInformationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Requires", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setRequires(new ListUnmarshaller<DocumentRequires>(DocumentRequiresJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Author", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setAuthor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReviewInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setReviewInformation(new ListUnmarshaller<ReviewInformation>(ReviewInformationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ApprovedVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setApprovedVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PendingReviewVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setPendingReviewVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReviewStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setReviewStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Category", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setCategory(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CategoryEnum", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentDescription.setCategoryEnum(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return documentDescription;
    }

    private static DocumentDescriptionJsonUnmarshaller instance;

    public static DocumentDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentDescriptionJsonUnmarshaller();
        return instance;
    }
}
