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
 * ActionExecutionInput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActionExecutionInputJsonUnmarshaller implements Unmarshaller<ActionExecutionInput, JsonUnmarshallerContext> {

    public ActionExecutionInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActionExecutionInput actionExecutionInput = new ActionExecutionInput();

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
                if (context.testExpression("actionTypeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionExecutionInput.setActionTypeId(ActionTypeIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionExecutionInput.setConfiguration(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("resolvedConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionExecutionInput.setResolvedConfiguration(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionExecutionInput.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionExecutionInput.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputArtifacts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionExecutionInput.setInputArtifacts(new ListUnmarshaller<ArtifactDetail>(ArtifactDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("namespace", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    actionExecutionInput.setNamespace(context.getUnmarshaller(String.class).unmarshall(context));
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

        return actionExecutionInput;
    }

    private static ActionExecutionInputJsonUnmarshaller instance;

    public static ActionExecutionInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActionExecutionInputJsonUnmarshaller();
        return instance;
    }
}
