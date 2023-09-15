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
 * Integration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntegrationJsonUnmarshaller implements Unmarshaller<Integration, JsonUnmarshallerContext> {

    public Integration unmarshall(JsonUnmarshallerContext context) throws Exception {
        Integration integration = new Integration();

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
                if (context.testExpression("apiGatewayManaged", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setApiGatewayManaged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setConnectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentHandlingStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setContentHandlingStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("credentialsArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setCredentialsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setIntegrationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setIntegrationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationResponseSelectionExpression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setIntegrationResponseSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationSubtype", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setIntegrationSubtype(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setIntegrationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setIntegrationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("passthroughBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setPassthroughBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("payloadFormatVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setPayloadFormatVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setRequestParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("requestTemplates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setRequestTemplates(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("responseParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setResponseParameters(new MapUnmarshaller<String, java.util.Map<String, String>>(context.getUnmarshaller(String.class),
                            new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class)))
                            .unmarshall(context));
                }
                if (context.testExpression("templateSelectionExpression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setTemplateSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeoutInMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setTimeoutInMillis(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tlsConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setTlsConfig(TlsConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return integration;
    }

    private static IntegrationJsonUnmarshaller instance;

    public static IntegrationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationJsonUnmarshaller();
        return instance;
    }
}
