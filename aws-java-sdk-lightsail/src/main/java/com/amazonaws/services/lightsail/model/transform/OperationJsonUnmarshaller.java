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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Operation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OperationJsonUnmarshaller implements Unmarshaller<Operation, JsonUnmarshallerContext> {

    public Operation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Operation operation = new Operation();

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
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("isTerminal", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setIsTerminal(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("operationDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setOperationDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setOperationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusChangedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setStatusChangedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("errorCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    operation.setErrorDetails(context.getUnmarshaller(String.class).unmarshall(context));
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

        return operation;
    }

    private static OperationJsonUnmarshaller instance;

    public static OperationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OperationJsonUnmarshaller();
        return instance;
    }
}
