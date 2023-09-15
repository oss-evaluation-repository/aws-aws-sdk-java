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
 * Table JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableJsonUnmarshaller implements Unmarshaller<Table, JsonUnmarshallerContext> {

    public Table unmarshall(JsonUnmarshallerContext context) throws Exception {
        Table table = new Table();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastAccessTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setLastAccessTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastAnalyzedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setLastAnalyzedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Retention", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setRetention(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StorageDescriptor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setStorageDescriptor(StorageDescriptorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PartitionKeys", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setPartitionKeys(new ListUnmarshaller<Column>(ColumnJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ViewOriginalText", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setViewOriginalText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ViewExpandedText", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setViewExpandedText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setTableType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsRegisteredWithLakeFormation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setIsRegisteredWithLakeFormation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TargetTable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setTargetTable(TableIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setCatalogId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FederatedTable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    table.setFederatedTable(FederatedTableJsonUnmarshaller.getInstance().unmarshall(context));
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

        return table;
    }

    private static TableJsonUnmarshaller instance;

    public static TableJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableJsonUnmarshaller();
        return instance;
    }
}
