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
package com.amazonaws.services.eventbridge.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eventbridge.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ApiDestination JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiDestinationJsonUnmarshaller implements Unmarshaller<ApiDestination, JsonUnmarshallerContext> {

    public ApiDestination unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApiDestination apiDestination = new ApiDestination();

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
                if (context.testExpression("ApiDestinationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    apiDestination.setApiDestinationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    apiDestination.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApiDestinationState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    apiDestination.setApiDestinationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    apiDestination.setConnectionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvocationEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    apiDestination.setInvocationEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HttpMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    apiDestination.setHttpMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InvocationRateLimitPerSecond", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    apiDestination.setInvocationRateLimitPerSecond(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    apiDestination.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    apiDestination.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return apiDestination;
    }

    private static ApiDestinationJsonUnmarshaller instance;

    public static ApiDestinationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApiDestinationJsonUnmarshaller();
        return instance;
    }
}
