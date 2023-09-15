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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Cluster JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterJsonUnmarshaller implements Unmarshaller<Cluster, JsonUnmarshallerContext> {

    public Cluster unmarshall(JsonUnmarshallerContext context) throws Exception {
        Cluster cluster = new Cluster();

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
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setStatus(ClusterStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setEc2InstanceAttributes(Ec2InstanceAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceCollectionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setInstanceCollectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setLogUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogEncryptionKmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setLogEncryptionKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequestedAmiVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setRequestedAmiVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RunningAmiVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setRunningAmiVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReleaseLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setReleaseLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoTerminate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setAutoTerminate(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TerminationProtected", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setTerminationProtected(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("VisibleToAllUsers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setVisibleToAllUsers(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Applications", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setApplications(new ListUnmarshaller<Application>(ApplicationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ServiceRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NormalizedInstanceHours", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setNormalizedInstanceHours(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MasterPublicDnsName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setMasterPublicDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Configurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setConfigurations(new ListUnmarshaller<Configuration>(ConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SecurityConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoScalingRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setAutoScalingRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScaleDownBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setScaleDownBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomAmiId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setCustomAmiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsRootVolumeSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setEbsRootVolumeSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RepoUpgradeOnBoot", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setRepoUpgradeOnBoot(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KerberosAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setKerberosAttributes(KerberosAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ClusterArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutpostArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setOutpostArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StepConcurrencyLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setStepConcurrencyLevel(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PlacementGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setPlacementGroups(new ListUnmarshaller<PlacementGroupConfig>(PlacementGroupConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OSReleaseLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cluster.setOSReleaseLabel(context.getUnmarshaller(String.class).unmarshall(context));
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

        return cluster;
    }

    private static ClusterJsonUnmarshaller instance;

    public static ClusterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClusterJsonUnmarshaller();
        return instance;
    }
}
