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
package com.amazonaws.services.mq.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeBrokerResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBrokerResultJsonUnmarshaller implements Unmarshaller<DescribeBrokerResult, JsonUnmarshallerContext> {

    public DescribeBrokerResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeBrokerResult describeBrokerResult = new DescribeBrokerResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeBrokerResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("actionsRequired", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setActionsRequired(new ListUnmarshaller<ActionRequired>(ActionRequiredJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("authenticationStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setAuthenticationStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("autoMinorVersionUpgrade", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setAutoMinorVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("brokerArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setBrokerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("brokerId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setBrokerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("brokerInstances", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setBrokerInstances(new ListUnmarshaller<BrokerInstance>(BrokerInstanceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("brokerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setBrokerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("brokerState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setBrokerState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setConfigurations(ConfigurationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setCreated(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("deploymentMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setDeploymentMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setEncryptionOptions(EncryptionOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("engineType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setEngineType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostInstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setHostInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ldapServerMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setLdapServerMetadata(LdapServerMetadataOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("logs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setLogs(LogsSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("maintenanceWindowStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setMaintenanceWindowStartTime(WeeklyStartTimeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pendingAuthenticationStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setPendingAuthenticationStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingEngineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setPendingEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingHostInstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setPendingHostInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingLdapServerMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setPendingLdapServerMetadata(LdapServerMetadataOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pendingSecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setPendingSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("publiclyAccessible", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("securityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("storageType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subnetIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("users", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setUsers(new ListUnmarshaller<UserSummary>(UserSummaryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dataReplicationMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setDataReplicationMetadata(DataReplicationMetadataOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dataReplicationMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setDataReplicationMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pendingDataReplicationMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setPendingDataReplicationMetadata(DataReplicationMetadataOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pendingDataReplicationMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeBrokerResult.setPendingDataReplicationMode(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeBrokerResult;
    }

    private static DescribeBrokerResultJsonUnmarshaller instance;

    public static DescribeBrokerResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeBrokerResultJsonUnmarshaller();
        return instance;
    }
}
