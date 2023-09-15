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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SearchForTextResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchForTextResultJsonUnmarshaller implements Unmarshaller<SearchForTextResult, JsonUnmarshallerContext> {

    public SearchForTextResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchForTextResult searchForTextResult = new SearchForTextResult();

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
                if (context.testExpression("Distance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchForTextResult.setDistance(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Place", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchForTextResult.setPlace(PlaceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PlaceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchForTextResult.setPlaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Relevance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchForTextResult.setRelevance(context.getUnmarshaller(Double.class).unmarshall(context));
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

        return searchForTextResult;
    }

    private static SearchForTextResultJsonUnmarshaller instance;

    public static SearchForTextResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchForTextResultJsonUnmarshaller();
        return instance;
    }
}
