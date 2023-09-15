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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TopicColumn JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicColumnJsonUnmarshaller implements Unmarshaller<TopicColumn, JsonUnmarshallerContext> {

    public TopicColumn unmarshall(JsonUnmarshallerContext context) throws Exception {
        TopicColumn topicColumn = new TopicColumn();

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
                if (context.testExpression("ColumnName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setColumnName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ColumnFriendlyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setColumnFriendlyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ColumnDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setColumnDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ColumnSynonyms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setColumnSynonyms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ColumnDataRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setColumnDataRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Aggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setAggregation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsIncludedInTopic", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setIsIncludedInTopic(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DisableIndexing", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setDisableIndexing(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ComparativeOrder", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setComparativeOrder(ComparativeOrderJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SemanticType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setSemanticType(SemanticTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimeGranularity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setTimeGranularity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowedAggregations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setAllowedAggregations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NotAllowedAggregations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setNotAllowedAggregations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DefaultFormatting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setDefaultFormatting(DefaultFormattingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NeverAggregateInFilter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setNeverAggregateInFilter(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CellValueSynonyms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setCellValueSynonyms(new ListUnmarshaller<CellValueSynonym>(CellValueSynonymJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NonAdditive", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    topicColumn.setNonAdditive(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return topicColumn;
    }

    private static TopicColumnJsonUnmarshaller instance;

    public static TopicColumnJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TopicColumnJsonUnmarshaller();
        return instance;
    }
}
