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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetCustomDataIdentifierResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCustomDataIdentifierResultJsonUnmarshaller implements Unmarshaller<GetCustomDataIdentifierResult, JsonUnmarshallerContext> {

    public GetCustomDataIdentifierResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCustomDataIdentifierResult getCustomDataIdentifierResult = new GetCustomDataIdentifierResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getCustomDataIdentifierResult;
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
                    getCustomDataIdentifierResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("deleted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setDeleted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ignoreWords", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setIgnoreWords(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("keywords", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setKeywords(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("maximumMatchDistance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setMaximumMatchDistance(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regex", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setRegex(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("severityLevels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setSeverityLevels(new ListUnmarshaller<SeverityLevel>(SeverityLevelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getCustomDataIdentifierResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return getCustomDataIdentifierResult;
    }

    private static GetCustomDataIdentifierResultJsonUnmarshaller instance;

    public static GetCustomDataIdentifierResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCustomDataIdentifierResultJsonUnmarshaller();
        return instance;
    }
}
