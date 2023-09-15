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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OpenZFSFileSystemConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenZFSFileSystemConfigurationJsonUnmarshaller implements Unmarshaller<OpenZFSFileSystemConfiguration, JsonUnmarshallerContext> {

    public OpenZFSFileSystemConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        OpenZFSFileSystemConfiguration openZFSFileSystemConfiguration = new OpenZFSFileSystemConfiguration();

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
                if (context.testExpression("AutomaticBackupRetentionDays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setAutomaticBackupRetentionDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToBackups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setCopyTagsToBackups(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToVolumes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setCopyTagsToVolumes(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DailyAutomaticBackupStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setDailyAutomaticBackupStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeploymentType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setDeploymentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThroughputCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setThroughputCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WeeklyMaintenanceStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setWeeklyMaintenanceStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DiskIopsConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setDiskIopsConfiguration(DiskIopsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootVolumeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setRootVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredSubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setPreferredSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointIpAddressRange", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setEndpointIpAddressRange(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RouteTableIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setRouteTableIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("EndpointIpAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSFileSystemConfiguration.setEndpointIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
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

        return openZFSFileSystemConfiguration;
    }

    private static OpenZFSFileSystemConfigurationJsonUnmarshaller instance;

    public static OpenZFSFileSystemConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OpenZFSFileSystemConfigurationJsonUnmarshaller();
        return instance;
    }
}
