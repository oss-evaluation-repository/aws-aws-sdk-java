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
 * TableCreationParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableCreationParametersJsonUnmarshaller implements Unmarshaller<TableCreationParameters, JsonUnmarshallerContext> {

    public TableCreationParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        TableCreationParameters tableCreationParameters = new TableCreationParameters();

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
                if (context.testExpression("TableName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableCreationParameters.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AttributeDefinitions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableCreationParameters
                            .setAttributeDefinitions(new ListUnmarshaller<AttributeDefinition>(AttributeDefinitionJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("KeySchema", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableCreationParameters.setKeySchema(new ListUnmarshaller<KeySchemaElement>(KeySchemaElementJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("BillingMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableCreationParameters.setBillingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedThroughput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableCreationParameters.setProvisionedThroughput(ProvisionedThroughputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SSESpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableCreationParameters.setSSESpecification(SSESpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GlobalSecondaryIndexes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableCreationParameters.setGlobalSecondaryIndexes(new ListUnmarshaller<GlobalSecondaryIndex>(GlobalSecondaryIndexJsonUnmarshaller
                            .getInstance())

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

        return tableCreationParameters;
    }

    private static TableCreationParametersJsonUnmarshaller instance;

    public static TableCreationParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableCreationParametersJsonUnmarshaller();
        return instance;
    }
}
