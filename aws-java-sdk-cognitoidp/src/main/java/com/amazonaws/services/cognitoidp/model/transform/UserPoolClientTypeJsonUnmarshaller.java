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
 * UserPoolClientType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPoolClientTypeJsonUnmarshaller implements Unmarshaller<UserPoolClientType, JsonUnmarshallerContext> {

    public UserPoolClientType unmarshall(JsonUnmarshallerContext context) throws Exception {
        UserPoolClientType userPoolClientType = new UserPoolClientType();

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
                if (context.testExpression("UserPoolId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setUserPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setClientName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientSecret", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setClientSecret(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RefreshTokenValidity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setRefreshTokenValidity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AccessTokenValidity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setAccessTokenValidity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("IdTokenValidity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setIdTokenValidity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TokenValidityUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setTokenValidityUnits(TokenValidityUnitsTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReadAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setReadAttributes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("WriteAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setWriteAttributes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExplicitAuthFlows", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setExplicitAuthFlows(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SupportedIdentityProviders", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setSupportedIdentityProviders(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CallbackURLs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setCallbackURLs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("LogoutURLs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setLogoutURLs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DefaultRedirectURI", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setDefaultRedirectURI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowedOAuthFlows", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setAllowedOAuthFlows(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AllowedOAuthScopes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setAllowedOAuthScopes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AllowedOAuthFlowsUserPoolClient", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setAllowedOAuthFlowsUserPoolClient(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AnalyticsConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setAnalyticsConfiguration(AnalyticsConfigurationTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PreventUserExistenceErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setPreventUserExistenceErrors(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnableTokenRevocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setEnableTokenRevocation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnablePropagateAdditionalUserContextData", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setEnablePropagateAdditionalUserContextData(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AuthSessionValidity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    userPoolClientType.setAuthSessionValidity(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return userPoolClientType;
    }

    private static UserPoolClientTypeJsonUnmarshaller instance;

    public static UserPoolClientTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UserPoolClientTypeJsonUnmarshaller();
        return instance;
    }
}
