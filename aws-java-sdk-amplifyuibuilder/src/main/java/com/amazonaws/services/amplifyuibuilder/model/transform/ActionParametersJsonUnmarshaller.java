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
 * ActionParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionParametersJsonUnmarshaller implements Unmarshaller<ActionParameters, JsonUnmarshallerContext> {

    public ActionParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionParameters actionParameters = new ActionParameters();

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
                    actionParameters.setType(ComponentPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionParameters.setUrl(ComponentPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("anchor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionParameters.setAnchor(ComponentPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionParameters.setTarget(ComponentPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("global", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionParameters.setGlobal(ComponentPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionParameters.setModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionParameters.setId(ComponentPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionParameters.setFields(new MapUnmarshaller<String, ComponentProperty>(context.getUnmarshaller(String.class),
                            ComponentPropertyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionParameters.setState(MutationActionSetStateParameterJsonUnmarshaller.getInstance().unmarshall(context));
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

        return actionParameters;
    }

    private static ActionParametersJsonUnmarshaller instance;

    public static ActionParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionParametersJsonUnmarshaller();
        return instance;
    }
}
