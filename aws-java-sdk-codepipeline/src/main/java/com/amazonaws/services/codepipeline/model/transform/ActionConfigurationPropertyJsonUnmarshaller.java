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
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActionConfigurationProperty JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionConfigurationPropertyJsonUnmarshaller implements Unmarshaller<ActionConfigurationProperty, JsonUnmarshallerContext> {

    public ActionConfigurationProperty unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionConfigurationProperty actionConfigurationProperty = new ActionConfigurationProperty();

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
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionConfigurationProperty.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("required", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionConfigurationProperty.setRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("key", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionConfigurationProperty.setKey(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("secret", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionConfigurationProperty.setSecret(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("queryable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionConfigurationProperty.setQueryable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionConfigurationProperty.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionConfigurationProperty.setType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return actionConfigurationProperty;
    }

    private static ActionConfigurationPropertyJsonUnmarshaller instance;

    public static ActionConfigurationPropertyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionConfigurationPropertyJsonUnmarshaller();
        return instance;
    }
}
