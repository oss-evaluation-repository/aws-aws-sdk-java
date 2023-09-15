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
 * HttpRouteMatch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpRouteMatchJsonUnmarshaller implements Unmarshaller<HttpRouteMatch, JsonUnmarshallerContext> {

    public HttpRouteMatch unmarshall(JsonUnmarshallerContext context) throws Exception {
        HttpRouteMatch httpRouteMatch = new HttpRouteMatch();

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
                    httpRouteMatch.setHeaders(new ListUnmarshaller<HttpRouteHeader>(HttpRouteHeaderJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("method", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpRouteMatch.setMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpRouteMatch.setPath(HttpPathMatchJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpRouteMatch.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("prefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpRouteMatch.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("queryParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpRouteMatch.setQueryParameters(new ListUnmarshaller<HttpQueryParameter>(HttpQueryParameterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("scheme", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    httpRouteMatch.setScheme(context.getUnmarshaller(String.class).unmarshall(context));
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

        return httpRouteMatch;
    }

    private static HttpRouteMatchJsonUnmarshaller instance;

    public static HttpRouteMatchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HttpRouteMatchJsonUnmarshaller();
        return instance;
    }
}
