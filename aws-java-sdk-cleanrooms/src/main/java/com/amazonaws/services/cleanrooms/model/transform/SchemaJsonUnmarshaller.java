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
package com.amazonaws.services.cleanrooms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Schema JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaJsonUnmarshaller implements Unmarshaller<Schema, JsonUnmarshallerContext> {

    public Schema unmarshall(JsonUnmarshallerContext context) throws Exception {
        Schema schema = new Schema();

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
                if (context.testExpression("columns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setColumns(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("partitionKeys", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setPartitionKeys(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("analysisRuleTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setAnalysisRuleTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("analysisMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setAnalysisMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creatorAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setCreatorAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    schema.setType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return schema;
    }

    private static SchemaJsonUnmarshaller instance;

    public static SchemaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SchemaJsonUnmarshaller();
        return instance;
    }
}
