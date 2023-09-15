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
 * Filters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FiltersJsonUnmarshaller implements Unmarshaller<Filters, JsonUnmarshallerContext> {

    public Filters unmarshall(JsonUnmarshallerContext context) throws Exception {
        Filters filters = new Filters();

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
                if (context.testExpression("TextLocales", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setTextLocales(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ContentCategories", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setContentCategories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setResourceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Labels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setLabels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Principals", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setPrincipals(new ListUnmarshaller<SearchPrincipalType>(SearchPrincipalTypeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AncestorIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setAncestorIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SearchCollectionTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setSearchCollectionTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SizeRange", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setSizeRange(LongRangeTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedRange", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setCreatedRange(DateRangeTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModifiedRange", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filters.setModifiedRange(DateRangeTypeJsonUnmarshaller.getInstance().unmarshall(context));
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

        return filters;
    }

    private static FiltersJsonUnmarshaller instance;

    public static FiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FiltersJsonUnmarshaller();
        return instance;
    }
}
