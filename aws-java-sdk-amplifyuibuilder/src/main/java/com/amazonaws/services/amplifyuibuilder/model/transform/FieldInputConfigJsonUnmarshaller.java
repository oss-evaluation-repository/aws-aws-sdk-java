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
 * FieldInputConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldInputConfigJsonUnmarshaller implements Unmarshaller<FieldInputConfig, JsonUnmarshallerContext> {

    public FieldInputConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        FieldInputConfig fieldInputConfig = new FieldInputConfig();

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
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("required", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("readOnly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setReadOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("placeholder", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setPlaceholder(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("descriptiveText", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setDescriptiveText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultChecked", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setDefaultChecked(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("defaultCountryCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setDefaultCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setValueMappings(ValueMappingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setMinValue(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("maxValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setMaxValue(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("step", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setStep(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("value", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setValue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isArray", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setIsArray(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("fileUploaderConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldInputConfig.setFileUploaderConfig(FileUploaderFieldConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return fieldInputConfig;
    }

    private static FieldInputConfigJsonUnmarshaller instance;

    public static FieldInputConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FieldInputConfigJsonUnmarshaller();
        return instance;
    }
}
