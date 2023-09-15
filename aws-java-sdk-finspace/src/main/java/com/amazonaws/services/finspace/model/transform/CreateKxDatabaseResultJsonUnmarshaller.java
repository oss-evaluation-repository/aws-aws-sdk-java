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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateKxDatabaseResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateKxDatabaseResultJsonUnmarshaller implements Unmarshaller<CreateKxDatabaseResult, JsonUnmarshallerContext> {

    public CreateKxDatabaseResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateKxDatabaseResult createKxDatabaseResult = new CreateKxDatabaseResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createKxDatabaseResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("databaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createKxDatabaseResult.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("databaseArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createKxDatabaseResult.setDatabaseArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createKxDatabaseResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createKxDatabaseResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createKxDatabaseResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createKxDatabaseResult.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return createKxDatabaseResult;
    }

    private static CreateKxDatabaseResultJsonUnmarshaller instance;

    public static CreateKxDatabaseResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateKxDatabaseResultJsonUnmarshaller();
        return instance;
    }
}
