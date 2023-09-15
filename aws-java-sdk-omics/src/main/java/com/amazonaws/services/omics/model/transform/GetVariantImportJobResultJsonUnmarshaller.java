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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetVariantImportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVariantImportJobResultJsonUnmarshaller implements Unmarshaller<GetVariantImportJobResult, JsonUnmarshallerContext> {

    public GetVariantImportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetVariantImportJobResult getVariantImportJobResult = new GetVariantImportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getVariantImportJobResult;
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
                    getVariantImportJobResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setDestinationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("completionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("items", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setItems(new ListUnmarshaller<VariantImportItemDetail>(VariantImportItemDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("runLeftNormalization", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setRunLeftNormalization(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("annotationFields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getVariantImportJobResult.setAnnotationFields(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

        return getVariantImportJobResult;
    }

    private static GetVariantImportJobResultJsonUnmarshaller instance;

    public static GetVariantImportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetVariantImportJobResultJsonUnmarshaller();
        return instance;
    }
}
