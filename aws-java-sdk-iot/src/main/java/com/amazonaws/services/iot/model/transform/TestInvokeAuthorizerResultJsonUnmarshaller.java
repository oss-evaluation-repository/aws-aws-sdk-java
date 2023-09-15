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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TestInvokeAuthorizerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestInvokeAuthorizerResultJsonUnmarshaller implements Unmarshaller<TestInvokeAuthorizerResult, JsonUnmarshallerContext> {

    public TestInvokeAuthorizerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        TestInvokeAuthorizerResult testInvokeAuthorizerResult = new TestInvokeAuthorizerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return testInvokeAuthorizerResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("isAuthenticated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    testInvokeAuthorizerResult.setIsAuthenticated(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("principalId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    testInvokeAuthorizerResult.setPrincipalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("policyDocuments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    testInvokeAuthorizerResult.setPolicyDocuments(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("refreshAfterInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    testInvokeAuthorizerResult.setRefreshAfterInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("disconnectAfterInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    testInvokeAuthorizerResult.setDisconnectAfterInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return testInvokeAuthorizerResult;
    }

    private static TestInvokeAuthorizerResultJsonUnmarshaller instance;

    public static TestInvokeAuthorizerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TestInvokeAuthorizerResultJsonUnmarshaller();
        return instance;
    }
}
