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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RedisSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedisSettingsJsonUnmarshaller implements Unmarshaller<RedisSettings, JsonUnmarshallerContext> {

    public RedisSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        RedisSettings redisSettings = new RedisSettings();

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
                if (context.testExpression("ServerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redisSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redisSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SslSecurityProtocol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redisSettings.setSslSecurityProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redisSettings.setAuthType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthUserName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redisSettings.setAuthUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthPassword", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redisSettings.setAuthPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslCaCertificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redisSettings.setSslCaCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return redisSettings;
    }

    private static RedisSettingsJsonUnmarshaller instance;

    public static RedisSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedisSettingsJsonUnmarshaller();
        return instance;
    }
}
