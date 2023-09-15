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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsRdsDbClusterDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbClusterDetailsJsonUnmarshaller implements Unmarshaller<AwsRdsDbClusterDetails, JsonUnmarshallerContext> {

    public AwsRdsDbClusterDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsDbClusterDetails awsRdsDbClusterDetails = new AwsRdsDbClusterDetails();

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
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setBackupRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReaderEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setReaderEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomEndpoints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setCustomEndpoints(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MultiAz", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setMultiAz(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Engine", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredBackupWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setPreferredBackupWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReadReplicaIdentifiers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setReadReplicaIdentifiers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setVpcSecurityGroups(new ListUnmarshaller<AwsRdsDbInstanceVpcSecurityGroup>(
                            AwsRdsDbInstanceVpcSecurityGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("HostedZoneId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setHostedZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setStorageEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterResourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociatedRoles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setAssociatedRoles(new ListUnmarshaller<AwsRdsDbClusterAssociatedRole>(AwsRdsDbClusterAssociatedRoleJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setClusterCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnabledCloudWatchLogsExports", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setEnabledCloudWatchLogsExports(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("EngineMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setEngineMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeletionProtection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setDeletionProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HttpEndpointEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setHttpEndpointEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ActivityStreamStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setActivityStreamStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToSnapshot", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setCopyTagsToSnapshot(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CrossAccountClone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setCrossAccountClone(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DomainMemberships", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setDomainMemberships(new ListUnmarshaller<AwsRdsDbDomainMembership>(AwsRdsDbDomainMembershipJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DbClusterParameterGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterParameterGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbSubnetGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbSubnetGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterOptionGroupMemberships", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterOptionGroupMemberships(new ListUnmarshaller<AwsRdsDbClusterOptionGroupMembership>(
                            AwsRdsDbClusterOptionGroupMembershipJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DbClusterIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterMembers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setDbClusterMembers(new ListUnmarshaller<AwsRdsDbClusterMember>(AwsRdsDbClusterMemberJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IamDatabaseAuthenticationEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterDetails.setIamDatabaseAuthenticationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return awsRdsDbClusterDetails;
    }

    private static AwsRdsDbClusterDetailsJsonUnmarshaller instance;

    public static AwsRdsDbClusterDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbClusterDetailsJsonUnmarshaller();
        return instance;
    }
}
