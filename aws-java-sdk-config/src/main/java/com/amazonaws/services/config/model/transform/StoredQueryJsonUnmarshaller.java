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
package com.amazonaws.services.config.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StoredQuery JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StoredQueryJsonUnmarshaller implements Unmarshaller<StoredQuery, JsonUnmarshallerContext> {

    public StoredQuery unmarshall(JsonUnmarshallerContext context) throws Exception {
        StoredQuery storedQuery = new StoredQuery();

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
                if (context.testExpression("QueryId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    storedQuery.setQueryId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    storedQuery.setQueryArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    storedQuery.setQueryName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    storedQuery.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Expression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    storedQuery.setExpression(context.getUnmarshaller(String.class).unmarshall(context));
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

        return storedQuery;
    }

    private static StoredQueryJsonUnmarshaller instance;

    public static StoredQueryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StoredQueryJsonUnmarshaller();
        return instance;
    }
}
