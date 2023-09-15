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
 * KafkaSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KafkaSettingsJsonUnmarshaller implements Unmarshaller<KafkaSettings, JsonUnmarshallerContext> {

    public KafkaSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        KafkaSettings kafkaSettings = new KafkaSettings();

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
                if (context.testExpression("Broker", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setBroker(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Topic", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setTopic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessageFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setMessageFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IncludeTransactionDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setIncludeTransactionDetails(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludePartitionValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setIncludePartitionValue(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PartitionIncludeSchemaTable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setPartitionIncludeSchemaTable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeTableAlterOperations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setIncludeTableAlterOperations(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeControlDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setIncludeControlDetails(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MessageMaxBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setMessageMaxBytes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("IncludeNullAndEmpty", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setIncludeNullAndEmpty(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SecurityProtocol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setSecurityProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslClientCertificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setSslClientCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslClientKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setSslClientKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslClientKeyPassword", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setSslClientKeyPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslCaCertificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setSslCaCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SaslUsername", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setSaslUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SaslPassword", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setSaslPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NoHexPrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setNoHexPrefix(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SaslMechanism", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setSaslMechanism(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SslEndpointIdentificationAlgorithm", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kafkaSettings.setSslEndpointIdentificationAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
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

        return kafkaSettings;
    }

    private static KafkaSettingsJsonUnmarshaller instance;

    public static KafkaSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KafkaSettingsJsonUnmarshaller();
        return instance;
    }
}
