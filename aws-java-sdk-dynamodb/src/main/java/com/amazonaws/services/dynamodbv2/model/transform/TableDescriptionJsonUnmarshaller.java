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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TableDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableDescriptionJsonUnmarshaller implements Unmarshaller<TableDescription, JsonUnmarshallerContext> {

    public TableDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        TableDescription tableDescription = new TableDescription();

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
                if (context.testExpression("AttributeDefinitions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setAttributeDefinitions(new ListUnmarshaller<AttributeDefinition>(AttributeDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeySchema", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setKeySchema(new ListUnmarshaller<KeySchemaElement>(KeySchemaElementJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TableStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setTableStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ProvisionedThroughput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setProvisionedThroughput(ProvisionedThroughputDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TableSizeBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setTableSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ItemCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setItemCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TableArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setTableArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BillingModeSummary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setBillingModeSummary(BillingModeSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LocalSecondaryIndexes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setLocalSecondaryIndexes(new ListUnmarshaller<LocalSecondaryIndexDescription>(
                            LocalSecondaryIndexDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GlobalSecondaryIndexes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setGlobalSecondaryIndexes(new ListUnmarshaller<GlobalSecondaryIndexDescription>(
                            GlobalSecondaryIndexDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StreamSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setStreamSpecification(StreamSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LatestStreamLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setLatestStreamLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestStreamArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setLatestStreamArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlobalTableVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setGlobalTableVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Replicas", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setReplicas(new ListUnmarshaller<ReplicaDescription>(ReplicaDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RestoreSummary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setRestoreSummary(RestoreSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SSEDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setSSEDescription(SSEDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ArchivalSummary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setArchivalSummary(ArchivalSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TableClassSummary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setTableClassSummary(TableClassSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeletionProtectionEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableDescription.setDeletionProtectionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return tableDescription;
    }

    private static TableDescriptionJsonUnmarshaller instance;

    public static TableDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableDescriptionJsonUnmarshaller();
        return instance;
    }
}
