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
 * SearchPlaceIndexForTextSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchPlaceIndexForTextSummaryJsonUnmarshaller implements Unmarshaller<SearchPlaceIndexForTextSummary, JsonUnmarshallerContext> {

    public SearchPlaceIndexForTextSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchPlaceIndexForTextSummary searchPlaceIndexForTextSummary = new SearchPlaceIndexForTextSummary();

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
                if (context.testExpression("BiasPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchPlaceIndexForTextSummary.setBiasPosition(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchPlaceIndexForTextSummary.setDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterBBox", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchPlaceIndexForTextSummary.setFilterBBox(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FilterCategories", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchPlaceIndexForTextSummary.setFilterCategories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FilterCountries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchPlaceIndexForTextSummary.setFilterCountries(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Language", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchPlaceIndexForTextSummary.setLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxResults", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchPlaceIndexForTextSummary.setMaxResults(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ResultBBox", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchPlaceIndexForTextSummary.setResultBBox(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Text", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    searchPlaceIndexForTextSummary.setText(context.getUnmarshaller(String.class).unmarshall(context));
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

        return searchPlaceIndexForTextSummary;
    }

    private static SearchPlaceIndexForTextSummaryJsonUnmarshaller instance;

    public static SearchPlaceIndexForTextSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchPlaceIndexForTextSummaryJsonUnmarshaller();
        return instance;
    }
}
