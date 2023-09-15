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
 * AwsRedshiftClusterDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterDetailsJsonUnmarshaller implements Unmarshaller<AwsRedshiftClusterDetails, JsonUnmarshallerContext> {

    public AwsRedshiftClusterDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRedshiftClusterDetails awsRedshiftClusterDetails = new AwsRedshiftClusterDetails();

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
                if (context.testExpression("AllowVersionUpgrade", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setAllowVersionUpgrade(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AutomatedSnapshotRetentionPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setAutomatedSnapshotRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterAvailabilityStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterAvailabilityStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterNodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterNodes(new ListUnmarshaller<AwsRedshiftClusterClusterNode>(AwsRedshiftClusterClusterNodeJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterParameterGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterParameterGroups(new ListUnmarshaller<AwsRedshiftClusterClusterParameterGroup>(
                            AwsRedshiftClusterClusterParameterGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterPublicKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterPublicKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterRevisionNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterRevisionNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterSecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterSecurityGroups(new ListUnmarshaller<AwsRedshiftClusterClusterSecurityGroup>(
                            AwsRedshiftClusterClusterSecurityGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ClusterSnapshotCopyStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterSnapshotCopyStatus(AwsRedshiftClusterClusterSnapshotCopyStatusJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ClusterStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterSubnetGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterSubnetGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setClusterVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DBName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setDBName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeferredMaintenanceWindows", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setDeferredMaintenanceWindows(new ListUnmarshaller<AwsRedshiftClusterDeferredMaintenanceWindow>(
                            AwsRedshiftClusterDeferredMaintenanceWindowJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ElasticIpStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setElasticIpStatus(AwsRedshiftClusterElasticIpStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ElasticResizeNumberOfNodeOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setElasticResizeNumberOfNodeOptions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Endpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setEndpoint(AwsRedshiftClusterEndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EnhancedVpcRouting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setEnhancedVpcRouting(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExpectedNextSnapshotScheduleTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setExpectedNextSnapshotScheduleTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpectedNextSnapshotScheduleTimeStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setExpectedNextSnapshotScheduleTimeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HsmStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setHsmStatus(AwsRedshiftClusterHsmStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IamRoles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setIamRoles(new ListUnmarshaller<AwsRedshiftClusterIamRole>(AwsRedshiftClusterIamRoleJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaintenanceTrackName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setMaintenanceTrackName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManualSnapshotRetentionPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setManualSnapshotRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NextMaintenanceWindowStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setNextMaintenanceWindowStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfNodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setNumberOfNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PendingActions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setPendingActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("PendingModifiedValues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setPendingModifiedValues(AwsRedshiftClusterPendingModifiedValuesJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("PreferredMaintenanceWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PubliclyAccessible", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ResizeInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setResizeInfo(AwsRedshiftClusterResizeInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RestoreStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setRestoreStatus(AwsRedshiftClusterRestoreStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SnapshotScheduleIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setSnapshotScheduleIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotScheduleState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setSnapshotScheduleState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcSecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setVpcSecurityGroups(new ListUnmarshaller<AwsRedshiftClusterVpcSecurityGroup>(
                            AwsRedshiftClusterVpcSecurityGroupJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LoggingStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRedshiftClusterDetails.setLoggingStatus(AwsRedshiftClusterLoggingStatusJsonUnmarshaller.getInstance().unmarshall(context));
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

        return awsRedshiftClusterDetails;
    }

    private static AwsRedshiftClusterDetailsJsonUnmarshaller instance;

    public static AwsRedshiftClusterDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRedshiftClusterDetailsJsonUnmarshaller();
        return instance;
    }
}
