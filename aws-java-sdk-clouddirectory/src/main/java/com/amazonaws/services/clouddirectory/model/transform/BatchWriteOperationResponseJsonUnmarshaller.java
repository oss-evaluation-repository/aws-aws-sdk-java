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
package com.amazonaws.services.clouddirectory.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.clouddirectory.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchWriteOperationResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteOperationResponseJsonUnmarshaller implements Unmarshaller<BatchWriteOperationResponse, JsonUnmarshallerContext> {

    public BatchWriteOperationResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchWriteOperationResponse batchWriteOperationResponse = new BatchWriteOperationResponse();

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
                if (context.testExpression("CreateObject", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setCreateObject(BatchCreateObjectResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachObject", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setAttachObject(BatchAttachObjectResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DetachObject", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setDetachObject(BatchDetachObjectResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UpdateObjectAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse
                            .setUpdateObjectAttributes(BatchUpdateObjectAttributesResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeleteObject", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setDeleteObject(BatchDeleteObjectResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AddFacetToObject", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setAddFacetToObject(BatchAddFacetToObjectResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RemoveFacetFromObject", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setRemoveFacetFromObject(BatchRemoveFacetFromObjectResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setAttachPolicy(BatchAttachPolicyResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DetachPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setDetachPolicy(BatchDetachPolicyResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreateIndex", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setCreateIndex(BatchCreateIndexResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachToIndex", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setAttachToIndex(BatchAttachToIndexResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DetachFromIndex", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setDetachFromIndex(BatchDetachFromIndexResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AttachTypedLink", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setAttachTypedLink(BatchAttachTypedLinkResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DetachTypedLink", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setDetachTypedLink(BatchDetachTypedLinkResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UpdateLinkAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchWriteOperationResponse.setUpdateLinkAttributes(BatchUpdateLinkAttributesResponseJsonUnmarshaller.getInstance().unmarshall(context));
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

        return batchWriteOperationResponse;
    }

    private static BatchWriteOperationResponseJsonUnmarshaller instance;

    public static BatchWriteOperationResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchWriteOperationResponseJsonUnmarshaller();
        return instance;
    }
}
