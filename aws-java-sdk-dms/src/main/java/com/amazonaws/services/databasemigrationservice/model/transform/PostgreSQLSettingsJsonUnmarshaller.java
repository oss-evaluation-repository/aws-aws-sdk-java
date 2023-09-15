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
 * PostgreSQLSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostgreSQLSettingsJsonUnmarshaller implements Unmarshaller<PostgreSQLSettings, JsonUnmarshallerContext> {

    public PostgreSQLSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        PostgreSQLSettings postgreSQLSettings = new PostgreSQLSettings();

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
                if (context.testExpression("AfterConnectScript", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setAfterConnectScript(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CaptureDdls", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setCaptureDdls(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaxFileSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setMaxFileSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DdlArtifactsSchema", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setDdlArtifactsSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecuteTimeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setExecuteTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FailTasksOnLobTruncation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setFailTasksOnLobTruncation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HeartbeatEnable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setHeartbeatEnable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HeartbeatSchema", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setHeartbeatSchema(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HeartbeatFrequency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setHeartbeatFrequency(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SlotName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setSlotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PluginName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setPluginName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setSecretsManagerAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecretId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setSecretsManagerSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrimSpaceInChar", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setTrimSpaceInChar(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MapBooleanAsBoolean", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setMapBooleanAsBoolean(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MapJsonbAsClob", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setMapJsonbAsClob(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MapLongVarcharAs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setMapLongVarcharAs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setDatabaseMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BabelfishDatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    postgreSQLSettings.setBabelfishDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return postgreSQLSettings;
    }

    private static PostgreSQLSettingsJsonUnmarshaller instance;

    public static PostgreSQLSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PostgreSQLSettingsJsonUnmarshaller();
        return instance;
    }
}
