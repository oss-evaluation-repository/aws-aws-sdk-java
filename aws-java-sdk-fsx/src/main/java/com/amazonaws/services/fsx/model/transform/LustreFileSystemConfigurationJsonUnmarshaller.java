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
 * LustreFileSystemConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LustreFileSystemConfigurationJsonUnmarshaller implements Unmarshaller<LustreFileSystemConfiguration, JsonUnmarshallerContext> {

    public LustreFileSystemConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        LustreFileSystemConfiguration lustreFileSystemConfiguration = new LustreFileSystemConfiguration();

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
                if (context.testExpression("WeeklyMaintenanceStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setWeeklyMaintenanceStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataRepositoryConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setDataRepositoryConfiguration(DataRepositoryConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeploymentType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setDeploymentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PerUnitStorageThroughput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setPerUnitStorageThroughput(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MountName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setMountName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DailyAutomaticBackupStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setDailyAutomaticBackupStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AutomaticBackupRetentionDays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setAutomaticBackupRetentionDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CopyTagsToBackups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setCopyTagsToBackups(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DriveCacheType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setDriveCacheType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataCompressionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setDataCompressionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setLogConfiguration(LustreLogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootSquashConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lustreFileSystemConfiguration.setRootSquashConfiguration(LustreRootSquashConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return lustreFileSystemConfiguration;
    }

    private static LustreFileSystemConfigurationJsonUnmarshaller instance;

    public static LustreFileSystemConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LustreFileSystemConfigurationJsonUnmarshaller();
        return instance;
    }
}
