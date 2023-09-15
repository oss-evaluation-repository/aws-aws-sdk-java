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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SnowflakeNodeData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeNodeDataJsonUnmarshaller implements Unmarshaller<SnowflakeNodeData, JsonUnmarshallerContext> {

    public SnowflakeNodeData unmarshall(JsonUnmarshallerContext context) throws Exception {
        SnowflakeNodeData snowflakeNodeData = new SnowflakeNodeData();

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
                if (context.testExpression("SourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Connection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setConnection(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Table", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Database", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TempDir", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setTempDir(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setIamRole(OptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AdditionalOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setAdditionalOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("SampleQuery", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setSampleQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreAction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setPreAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostAction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setPostAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Upsert", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setUpsert(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MergeAction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setMergeAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MergeWhenMatched", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setMergeWhenMatched(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MergeWhenNotMatched", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setMergeWhenNotMatched(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MergeClause", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setMergeClause(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StagingTable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setStagingTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelectedColumns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setSelectedColumns(new ListUnmarshaller<Option>(OptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AutoPushdown", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setAutoPushdown(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TableSchema", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    snowflakeNodeData.setTableSchema(new ListUnmarshaller<Option>(OptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return snowflakeNodeData;
    }

    private static SnowflakeNodeDataJsonUnmarshaller instance;

    public static SnowflakeNodeDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SnowflakeNodeDataJsonUnmarshaller();
        return instance;
    }
}
