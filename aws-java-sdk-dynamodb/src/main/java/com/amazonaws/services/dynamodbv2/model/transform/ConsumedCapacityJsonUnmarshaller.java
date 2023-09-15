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
 * ConsumedCapacity JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConsumedCapacityJsonUnmarshaller implements Unmarshaller<ConsumedCapacity, JsonUnmarshallerContext> {

    public ConsumedCapacity unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConsumedCapacity consumedCapacity = new ConsumedCapacity();

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
                    consumedCapacity.setTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CapacityUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    consumedCapacity.setCapacityUnits(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ReadCapacityUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    consumedCapacity.setReadCapacityUnits(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("WriteCapacityUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    consumedCapacity.setWriteCapacityUnits(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Table", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    consumedCapacity.setTable(CapacityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LocalSecondaryIndexes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    consumedCapacity.setLocalSecondaryIndexes(new MapUnmarshaller<String, Capacity>(context.getUnmarshaller(String.class),
                            CapacityJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("GlobalSecondaryIndexes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    consumedCapacity.setGlobalSecondaryIndexes(new MapUnmarshaller<String, Capacity>(context.getUnmarshaller(String.class),
                            CapacityJsonUnmarshaller.getInstance()).unmarshall(context));
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

        return consumedCapacity;
    }

    private static ConsumedCapacityJsonUnmarshaller instance;

    public static ConsumedCapacityJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConsumedCapacityJsonUnmarshaller();
        return instance;
    }
}
