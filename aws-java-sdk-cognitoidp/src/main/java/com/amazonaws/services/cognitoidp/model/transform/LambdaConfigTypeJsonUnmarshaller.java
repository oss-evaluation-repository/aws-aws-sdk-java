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
package com.amazonaws.services.cognitoidp.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cognitoidp.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LambdaConfigType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LambdaConfigTypeJsonUnmarshaller implements Unmarshaller<LambdaConfigType, JsonUnmarshallerContext> {

    public LambdaConfigType unmarshall(JsonUnmarshallerContext context) throws Exception {
        LambdaConfigType lambdaConfigType = new LambdaConfigType();

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
                if (context.testExpression("PreSignUp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setPreSignUp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setCustomMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostConfirmation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setPostConfirmation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreAuthentication", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setPreAuthentication(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostAuthentication", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setPostAuthentication(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefineAuthChallenge", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setDefineAuthChallenge(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateAuthChallenge", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setCreateAuthChallenge(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VerifyAuthChallengeResponse", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setVerifyAuthChallengeResponse(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreTokenGeneration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setPreTokenGeneration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserMigration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setUserMigration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomSMSSender", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setCustomSMSSender(CustomSMSLambdaVersionConfigTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomEmailSender", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setCustomEmailSender(CustomEmailLambdaVersionConfigTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KMSKeyID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lambdaConfigType.setKMSKeyID(context.getUnmarshaller(String.class).unmarshall(context));
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

        return lambdaConfigType;
    }

    private static LambdaConfigTypeJsonUnmarshaller instance;

    public static LambdaConfigTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LambdaConfigTypeJsonUnmarshaller();
        return instance;
    }
}
