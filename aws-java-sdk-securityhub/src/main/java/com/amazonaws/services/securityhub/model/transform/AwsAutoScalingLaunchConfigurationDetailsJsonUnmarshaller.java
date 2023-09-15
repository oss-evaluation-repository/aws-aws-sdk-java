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
 * AwsAutoScalingLaunchConfigurationDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAutoScalingLaunchConfigurationDetailsJsonUnmarshaller implements
        Unmarshaller<AwsAutoScalingLaunchConfigurationDetails, JsonUnmarshallerContext> {

    public AwsAutoScalingLaunchConfigurationDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsAutoScalingLaunchConfigurationDetails awsAutoScalingLaunchConfigurationDetails = new AwsAutoScalingLaunchConfigurationDetails();

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
                if (context.testExpression("AssociatePublicIpAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setAssociatePublicIpAddress(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("BlockDeviceMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails
                            .setBlockDeviceMappings(new ListUnmarshaller<AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetails>(
                                    AwsAutoScalingLaunchConfigurationBlockDeviceMappingsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("ClassicLinkVpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setClassicLinkVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClassicLinkVpcSecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails
                            .setClassicLinkVpcSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                            .unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsOptimized", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setEbsOptimized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IamInstanceProfile", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setIamInstanceProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setImageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceMonitoring", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setInstanceMonitoring(AwsAutoScalingLaunchConfigurationInstanceMonitoringDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KernelId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setKernelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LaunchConfigurationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setLaunchConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlacementTenancy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setPlacementTenancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RamdiskId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setRamdiskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SpotPrice", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setSpotPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserData", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setUserData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetadataOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAutoScalingLaunchConfigurationDetails.setMetadataOptions(AwsAutoScalingLaunchConfigurationMetadataOptionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
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

        return awsAutoScalingLaunchConfigurationDetails;
    }

    private static AwsAutoScalingLaunchConfigurationDetailsJsonUnmarshaller instance;

    public static AwsAutoScalingLaunchConfigurationDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsAutoScalingLaunchConfigurationDetailsJsonUnmarshaller();
        return instance;
    }
}
