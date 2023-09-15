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
package com.amazonaws.services.robomaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateWorldExportJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWorldExportJobResultJsonUnmarshaller implements Unmarshaller<CreateWorldExportJobResult, JsonUnmarshallerContext> {

    public CreateWorldExportJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateWorldExportJobResult createWorldExportJobResult = new CreateWorldExportJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createWorldExportJobResult;
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
                    createWorldExportJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createWorldExportJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createWorldExportJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createWorldExportJobResult.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createWorldExportJobResult.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createWorldExportJobResult.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iamRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createWorldExportJobResult.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createWorldExportJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return createWorldExportJobResult;
    }

    private static CreateWorldExportJobResultJsonUnmarshaller instance;

    public static CreateWorldExportJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateWorldExportJobResultJsonUnmarshaller();
        return instance;
    }
}
