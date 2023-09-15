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
 * Form JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FormJsonUnmarshaller implements Unmarshaller<Form, JsonUnmarshallerContext> {

    public Form unmarshall(JsonUnmarshallerContext context) throws Exception {
        Form form = new Form();

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
                if (context.testExpression("appId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setAppId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setEnvironmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("formActionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setFormActionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("style", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setStyle(FormStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dataType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setDataType(FormDataTypeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setFields(new MapUnmarshaller<String, FieldConfig>(context.getUnmarshaller(String.class), FieldConfigJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("sectionalElements", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setSectionalElements(new MapUnmarshaller<String, SectionalElement>(context.getUnmarshaller(String.class),
                            SectionalElementJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("schemaVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setSchemaVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("cta", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setCta(FormCTAJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("labelDecorator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    form.setLabelDecorator(context.getUnmarshaller(String.class).unmarshall(context));
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

        return form;
    }

    private static FormJsonUnmarshaller instance;

    public static FormJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FormJsonUnmarshaller();
        return instance;
    }
}
