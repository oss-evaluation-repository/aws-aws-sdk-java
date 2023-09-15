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
package com.amazonaws.services.workdocs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.workdocs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FolderMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FolderMetadataJsonUnmarshaller implements Unmarshaller<FolderMetadata, JsonUnmarshallerContext> {

    public FolderMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        FolderMetadata folderMetadata = new FolderMetadata();

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
                    folderMetadata.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatorId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setCreatorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParentFolderId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setParentFolderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ModifiedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResourceState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setResourceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Signature", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Labels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setLabels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Size", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LatestVersionSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    folderMetadata.setLatestVersionSize(context.getUnmarshaller(Long.class).unmarshall(context));
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

        return folderMetadata;
    }

    private static FolderMetadataJsonUnmarshaller instance;

    public static FolderMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FolderMetadataJsonUnmarshaller();
        return instance;
    }
}
