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
 * Endpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointJsonUnmarshaller implements Unmarshaller<Endpoint, JsonUnmarshallerContext> {

    public Endpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        Endpoint endpoint = new Endpoint();

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
                if (context.testExpression("EndpointIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setEndpointIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setEngineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineDisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setEngineDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setServerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraConnectionAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setExtraConnectionAttributes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CertificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setSslMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setServiceAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalTableDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setExternalTableDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setExternalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DynamoDbSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setDynamoDbSettings(DynamoDbSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3Settings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setS3Settings(S3SettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DmsTransferSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setDmsTransferSettings(DmsTransferSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MongoDbSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setMongoDbSettings(MongoDbSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KinesisSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setKinesisSettings(KinesisSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KafkaSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setKafkaSettings(KafkaSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ElasticsearchSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setElasticsearchSettings(ElasticsearchSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NeptuneSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setNeptuneSettings(NeptuneSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedshiftSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setRedshiftSettings(RedshiftSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PostgreSQLSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setPostgreSQLSettings(PostgreSQLSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MySQLSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setMySQLSettings(MySQLSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OracleSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setOracleSettings(OracleSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SybaseSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setSybaseSettings(SybaseSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MicrosoftSQLServerSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setMicrosoftSQLServerSettings(MicrosoftSQLServerSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IBMDb2Settings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setIBMDb2Settings(IBMDb2SettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DocDbSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setDocDbSettings(DocDbSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RedisSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setRedisSettings(RedisSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GcpMySQLSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setGcpMySQLSettings(GcpMySQLSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimestreamSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setTimestreamSettings(TimestreamSettingsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return endpoint;
    }

    private static EndpointJsonUnmarshaller instance;

    public static EndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonUnmarshaller();
        return instance;
    }
}
