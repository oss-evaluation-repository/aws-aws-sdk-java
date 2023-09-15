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
package com.amazonaws.services.nimblestudio.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StudioComponent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioComponentJsonUnmarshaller implements Unmarshaller<StudioComponent, JsonUnmarshallerContext> {

    public StudioComponent unmarshall(JsonUnmarshallerContext context) throws Exception {
        StudioComponent studioComponent = new StudioComponent();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setConfiguration(StudioComponentConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ec2SecurityGroupIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setEc2SecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("initializationScripts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setInitializationScripts(new ListUnmarshaller<StudioComponentInitializationScript>(
                            StudioComponentInitializationScriptJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runtimeRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setRuntimeRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scriptParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setScriptParameters(new ListUnmarshaller<ScriptParameterKeyValue>(ScriptParameterKeyValueJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("secureInitializationRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setSecureInitializationRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setStatusCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("studioComponentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setStudioComponentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subtype", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setSubtype(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("updatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    studioComponent.setUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
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

        return studioComponent;
    }

    private static StudioComponentJsonUnmarshaller instance;

    public static StudioComponentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StudioComponentJsonUnmarshaller();
        return instance;
    }
}
