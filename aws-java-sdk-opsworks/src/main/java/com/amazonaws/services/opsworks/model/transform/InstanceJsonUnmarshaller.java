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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Instance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceJsonUnmarshaller implements Unmarshaller<Instance, JsonUnmarshallerContext> {

    public Instance unmarshall(JsonUnmarshallerContext context) throws Exception {
        Instance instance = new Instance();

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
                if (context.testExpression("AgentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AmiId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setAmiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Architecture", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setArchitecture(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutoScalingType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setAutoScalingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BlockDeviceMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setBlockDeviceMappings(new ListUnmarshaller<BlockDeviceMapping>(BlockDeviceMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsOptimized", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setEbsOptimized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setEc2InstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EcsClusterArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setEcsClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EcsContainerInstanceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setEcsContainerInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ElasticIp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setElasticIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Hostname", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InfrastructureClass", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInfrastructureClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstallUpdatesOnBoot", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInstallUpdatesOnBoot(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceProfileArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInstanceProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastServiceErrorId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setLastServiceErrorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LayerIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setLayerIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Os", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setOs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Platform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateDns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPrivateDns(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateIp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPrivateIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicDns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPublicDns(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicIp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPublicIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegisteredBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setRegisteredBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportedAgentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setReportedAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportedOs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setReportedOs(ReportedOsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootDeviceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setRootDeviceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RootDeviceVolumeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setRootDeviceVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SshHostDsaKeyFingerprint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setSshHostDsaKeyFingerprint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshHostRsaKeyFingerprint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setSshHostRsaKeyFingerprint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshKeyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setSshKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setStackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tenancy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setTenancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VirtualizationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setVirtualizationType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return instance;
    }

    private static InstanceJsonUnmarshaller instance;

    public static InstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonUnmarshaller();
        return instance;
    }
}
