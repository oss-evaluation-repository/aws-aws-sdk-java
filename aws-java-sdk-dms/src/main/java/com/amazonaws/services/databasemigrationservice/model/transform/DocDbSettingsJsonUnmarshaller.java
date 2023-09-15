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
 * DocDbSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocDbSettingsJsonUnmarshaller implements Unmarshaller<DocDbSettings, JsonUnmarshallerContext> {

    public DocDbSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        DocDbSettings docDbSettings = new DocDbSettings();

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
                if (context.testExpression("Username", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Password", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NestingLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setNestingLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtractDocId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setExtractDocId(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DocsToInvestigate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setDocsToInvestigate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setSecretsManagerAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretsManagerSecretId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setSecretsManagerSecretId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UseUpdateLookUp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setUseUpdateLookUp(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReplicateShardCollections", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    docDbSettings.setReplicateShardCollections(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return docDbSettings;
    }

    private static DocDbSettingsJsonUnmarshaller instance;

    public static DocDbSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocDbSettingsJsonUnmarshaller();
        return instance;
    }
}
