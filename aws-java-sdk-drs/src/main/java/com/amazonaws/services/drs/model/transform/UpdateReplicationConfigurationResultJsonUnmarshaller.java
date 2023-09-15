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
package com.amazonaws.services.drs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateReplicationConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReplicationConfigurationResultJsonUnmarshaller implements Unmarshaller<UpdateReplicationConfigurationResult, JsonUnmarshallerContext> {

    public UpdateReplicationConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateReplicationConfigurationResult updateReplicationConfigurationResult = new UpdateReplicationConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateReplicationConfigurationResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("associateDefaultSecurityGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setAssociateDefaultSecurityGroup(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("autoReplicateNewDisks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setAutoReplicateNewDisks(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("bandwidthThrottling", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setBandwidthThrottling(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("createPublicIP", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setCreatePublicIP(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("dataPlaneRouting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setDataPlaneRouting(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultLargeStagingDiskType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setDefaultLargeStagingDiskType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebsEncryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setEbsEncryption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebsEncryptionKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setEbsEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pitPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setPitPolicy(new ListUnmarshaller<PITPolicyRule>(PITPolicyRuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("replicatedDisks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setReplicatedDisks(new ListUnmarshaller<ReplicationConfigurationReplicatedDisk>(
                            ReplicationConfigurationReplicatedDiskJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("replicationServerInstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setReplicationServerInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationServersSecurityGroupsIDs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setReplicationServersSecurityGroupsIDs(new ListUnmarshaller<String>(context
                            .getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("sourceServerID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setSourceServerID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stagingAreaSubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setStagingAreaSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stagingAreaTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setStagingAreaTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("useDedicatedReplicationServer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReplicationConfigurationResult.setUseDedicatedReplicationServer(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return updateReplicationConfigurationResult;
    }

    private static UpdateReplicationConfigurationResultJsonUnmarshaller instance;

    public static UpdateReplicationConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateReplicationConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
