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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetKxClusterResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKxClusterResultJsonUnmarshaller implements Unmarshaller<GetKxClusterResult, JsonUnmarshallerContext> {

    public GetKxClusterResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetKxClusterResult getKxClusterResult = new GetKxClusterResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getKxClusterResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setClusterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("databases", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setDatabases(new ListUnmarshaller<KxDatabaseConfiguration>(KxDatabaseConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("cacheStorageConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setCacheStorageConfigurations(new ListUnmarshaller<KxCacheStorageConfiguration>(
                            KxCacheStorageConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("autoScalingConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setAutoScalingConfiguration(AutoScalingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("clusterDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setClusterDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capacityConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setCapacityConfiguration(CapacityConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("releaseLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setReleaseLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setVpcConfiguration(VpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("initializationScript", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setInitializationScript(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("commandLineArguments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setCommandLineArguments(new ListUnmarshaller<KxCommandLineArgument>(KxCommandLineArgumentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("code", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setCode(CodeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("executionRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setExecutionRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("savedownStorageConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setSavedownStorageConfiguration(KxSavedownStorageConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("azMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setAzMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZoneId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxClusterResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return getKxClusterResult;
    }

    private static GetKxClusterResultJsonUnmarshaller instance;

    public static GetKxClusterResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetKxClusterResultJsonUnmarshaller();
        return instance;
    }
}
