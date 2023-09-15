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
package com.amazonaws.services.appmesh.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HttpGatewayRouteMatch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpGatewayRouteMatchJsonUnmarshaller implements Unmarshaller<HttpGatewayRouteMatch, JsonUnmarshallerContext> {

    public HttpGatewayRouteMatch unmarshall(JsonUnmarshallerContext context) throws Exception {
        HttpGatewayRouteMatch httpGatewayRouteMatch = new HttpGatewayRouteMatch();

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
                if (context.testExpression("headers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpGatewayRouteMatch.setHeaders(new ListUnmarshaller<HttpGatewayRouteHeader>(HttpGatewayRouteHeaderJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("hostname", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpGatewayRouteMatch.setHostname(GatewayRouteHostnameMatchJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("method", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpGatewayRouteMatch.setMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpGatewayRouteMatch.setPath(HttpPathMatchJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpGatewayRouteMatch.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("prefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpGatewayRouteMatch.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("queryParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpGatewayRouteMatch.setQueryParameters(new ListUnmarshaller<HttpQueryParameter>(HttpQueryParameterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return httpGatewayRouteMatch;
    }

    private static HttpGatewayRouteMatchJsonUnmarshaller instance;

    public static HttpGatewayRouteMatchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HttpGatewayRouteMatchJsonUnmarshaller();
        return instance;
    }
}
