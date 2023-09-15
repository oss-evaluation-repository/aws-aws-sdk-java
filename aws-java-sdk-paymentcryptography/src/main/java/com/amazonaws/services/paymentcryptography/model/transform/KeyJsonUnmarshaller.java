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
package com.amazonaws.services.paymentcryptography.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.paymentcryptography.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Key JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyJsonUnmarshaller implements Unmarshaller<Key, JsonUnmarshallerContext> {

    public Key unmarshall(JsonUnmarshallerContext context) throws Exception {
        Key key = new Key();

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
                if (context.testExpression("CreateTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setCreateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeletePendingTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setDeletePendingTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeleteTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setDeleteTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Exportable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setExportable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setKeyAttributes(KeyAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KeyCheckValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setKeyCheckValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyCheckValueAlgorithm", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setKeyCheckValueAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyOrigin", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setKeyOrigin(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setKeyState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UsageStartTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setUsageStartTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UsageStopTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    key.setUsageStopTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return key;
    }

    private static KeyJsonUnmarshaller instance;

    public static KeyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyJsonUnmarshaller();
        return instance;
    }
}
