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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Blueprint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueprintJsonUnmarshaller implements Unmarshaller<Blueprint, JsonUnmarshallerContext> {

    public Blueprint unmarshall(JsonUnmarshallerContext context) throws Exception {
        Blueprint blueprint = new Blueprint();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setCreatedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setLastModifiedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ParameterSpec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setParameterSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlueprintLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setBlueprintLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlueprintServiceLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setBlueprintServiceLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastActiveDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    blueprint.setLastActiveDefinition(LastActiveDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
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

        return blueprint;
    }

    private static BlueprintJsonUnmarshaller instance;

    public static BlueprintJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BlueprintJsonUnmarshaller();
        return instance;
    }
}
