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
package com.amazonaws.services.medicalimaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medicalimaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetImageSetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetImageSetResultJsonUnmarshaller implements Unmarshaller<GetImageSetResult, JsonUnmarshallerContext> {

    public GetImageSetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetImageSetResult getImageSetResult = new GetImageSetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getImageSetResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("datastoreId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setDatastoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setImageSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("versionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSetState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setImageSetState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSetWorkflowStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setImageSetWorkflowStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deletedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setDeletedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSetArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getImageSetResult.setImageSetArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getImageSetResult;
    }

    private static GetImageSetResultJsonUnmarshaller instance;

    public static GetImageSetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetImageSetResultJsonUnmarshaller();
        return instance;
    }
}
