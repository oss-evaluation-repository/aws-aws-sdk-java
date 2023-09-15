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
package com.amazonaws.services.amplifyuibuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplifyuibuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ComponentConditionProperty JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentConditionPropertyJsonUnmarshaller implements Unmarshaller<ComponentConditionProperty, JsonUnmarshallerContext> {

    public ComponentConditionProperty unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComponentConditionProperty componentConditionProperty = new ComponentConditionProperty();

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
                if (context.testExpression("property", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentConditionProperty.setProperty(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("field", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentConditionProperty.setField(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentConditionProperty.setOperator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operand", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentConditionProperty.setOperand(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("then", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentConditionProperty.setThen(ComponentPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("else", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentConditionProperty.setElse(ComponentPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("operandType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentConditionProperty.setOperandType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return componentConditionProperty;
    }

    private static ComponentConditionPropertyJsonUnmarshaller instance;

    public static ComponentConditionPropertyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComponentConditionPropertyJsonUnmarshaller();
        return instance;
    }
}
