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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateIntegrationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationResultJsonUnmarshaller implements Unmarshaller<CreateIntegrationResult, JsonUnmarshallerContext> {

    public CreateIntegrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIntegrationResult createIntegrationResult = new CreateIntegrationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createIntegrationResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("apiGatewayManaged", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setApiGatewayManaged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setConnectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentHandlingStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setContentHandlingStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("credentialsArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setCredentialsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setIntegrationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setIntegrationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationResponseSelectionExpression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setIntegrationResponseSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationSubtype", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setIntegrationSubtype(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setIntegrationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setIntegrationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("passthroughBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setPassthroughBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("payloadFormatVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setPayloadFormatVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setRequestParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("requestTemplates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setRequestTemplates(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("responseParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setResponseParameters(new MapUnmarshaller<String, java.util.Map<String, String>>(context
                            .getUnmarshaller(String.class), new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class))).unmarshall(context));
                }
                if (context.testExpression("templateSelectionExpression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setTemplateSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeoutInMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setTimeoutInMillis(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tlsConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntegrationResult.setTlsConfig(TlsConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return createIntegrationResult;
    }

    private static CreateIntegrationResultJsonUnmarshaller instance;

    public static CreateIntegrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIntegrationResultJsonUnmarshaller();
        return instance;
    }
}
