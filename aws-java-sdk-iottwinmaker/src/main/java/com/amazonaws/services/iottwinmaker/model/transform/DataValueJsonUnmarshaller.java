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
package com.amazonaws.services.iottwinmaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iottwinmaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataValue JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataValueJsonUnmarshaller implements Unmarshaller<DataValue, JsonUnmarshallerContext> {

    public DataValue unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataValue dataValue = new DataValue();

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
                if (context.testExpression("booleanValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataValue.setBooleanValue(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("doubleValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataValue.setDoubleValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("integerValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataValue.setIntegerValue(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("longValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataValue.setLongValue(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("stringValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataValue.setStringValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("listValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataValue.setListValue(new ListUnmarshaller<DataValue>(DataValueJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("mapValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataValue
                            .setMapValue(new MapUnmarshaller<String, DataValue>(context.getUnmarshaller(String.class), DataValueJsonUnmarshaller.getInstance())
                                    .unmarshall(context));
                }
                if (context.testExpression("relationshipValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataValue.setRelationshipValue(RelationshipValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("expression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataValue.setExpression(context.getUnmarshaller(String.class).unmarshall(context));
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

        return dataValue;
    }

    private static DataValueJsonUnmarshaller instance;

    public static DataValueJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataValueJsonUnmarshaller();
        return instance;
    }
}
