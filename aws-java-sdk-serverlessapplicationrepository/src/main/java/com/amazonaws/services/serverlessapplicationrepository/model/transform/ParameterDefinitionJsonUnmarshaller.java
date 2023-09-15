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
package com.amazonaws.services.serverlessapplicationrepository.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.serverlessapplicationrepository.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ParameterDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterDefinitionJsonUnmarshaller implements Unmarshaller<ParameterDefinition, JsonUnmarshallerContext> {

    public ParameterDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        ParameterDefinition parameterDefinition = new ParameterDefinition();

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
                if (context.testExpression("allowedPattern", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setAllowedPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("allowedValues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setAllowedValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("constraintDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setConstraintDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setMaxLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setMaxValue(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setMinLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setMinValue(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("noEcho", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setNoEcho(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("referencedByResources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setReferencedByResources(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterDefinition.setType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return parameterDefinition;
    }

    private static ParameterDefinitionJsonUnmarshaller instance;

    public static ParameterDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParameterDefinitionJsonUnmarshaller();
        return instance;
    }
}
