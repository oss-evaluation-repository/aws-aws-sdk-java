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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
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
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("httpMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setHttpMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setConnectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("credentials", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setCredentials(context.getUnmarshaller(String.class).unmarshall(context));
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
                if (context.testExpression("passthroughBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setPassthroughBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentHandling", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setContentHandling(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeoutInMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setTimeoutInMillis(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("cacheNamespace", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setCacheNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cacheKeyParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setCacheKeyParameters(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("integrationResponses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    integration.setIntegrationResponses(new MapUnmarshaller<String, IntegrationResponse>(context.getUnmarshaller(String.class),
                            IntegrationResponseJsonUnmarshaller.getInstance()).unmarshall(context));
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
