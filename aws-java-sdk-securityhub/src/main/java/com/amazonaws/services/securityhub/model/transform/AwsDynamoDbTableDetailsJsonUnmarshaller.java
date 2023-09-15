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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsDynamoDbTableDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsDynamoDbTableDetailsJsonUnmarshaller implements Unmarshaller<AwsDynamoDbTableDetails, JsonUnmarshallerContext> {

    public AwsDynamoDbTableDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsDynamoDbTableDetails awsDynamoDbTableDetails = new AwsDynamoDbTableDetails();

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
                    awsDynamoDbTableDetails.setAttributeDefinitions(new ListUnmarshaller<AwsDynamoDbTableAttributeDefinition>(
                            AwsDynamoDbTableAttributeDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BillingModeSummary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setBillingModeSummary(AwsDynamoDbTableBillingModeSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setCreationDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlobalSecondaryIndexes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setGlobalSecondaryIndexes(new ListUnmarshaller<AwsDynamoDbTableGlobalSecondaryIndex>(
                            AwsDynamoDbTableGlobalSecondaryIndexJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GlobalTableVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setGlobalTableVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ItemCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setItemCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("KeySchema", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setKeySchema(new ListUnmarshaller<AwsDynamoDbTableKeySchema>(AwsDynamoDbTableKeySchemaJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LatestStreamArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setLatestStreamArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestStreamLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setLatestStreamLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocalSecondaryIndexes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setLocalSecondaryIndexes(new ListUnmarshaller<AwsDynamoDbTableLocalSecondaryIndex>(
                            AwsDynamoDbTableLocalSecondaryIndexJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProvisionedThroughput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setProvisionedThroughput(AwsDynamoDbTableProvisionedThroughputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Replicas", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setReplicas(new ListUnmarshaller<AwsDynamoDbTableReplica>(AwsDynamoDbTableReplicaJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RestoreSummary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setRestoreSummary(AwsDynamoDbTableRestoreSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SseDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setSseDescription(AwsDynamoDbTableSseDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StreamSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setStreamSpecification(AwsDynamoDbTableStreamSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TableId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableSizeBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setTableSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TableStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsDynamoDbTableDetails.setTableStatus(context.getUnmarshaller(String.class).unmarshall(context));
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

        return awsDynamoDbTableDetails;
    }

    private static AwsDynamoDbTableDetailsJsonUnmarshaller instance;

    public static AwsDynamoDbTableDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsDynamoDbTableDetailsJsonUnmarshaller();
        return instance;
    }
}
