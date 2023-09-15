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
 * AwsRdsDbClusterSnapshotDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbClusterSnapshotDetailsJsonUnmarshaller implements Unmarshaller<AwsRdsDbClusterSnapshotDetails, JsonUnmarshallerContext> {

    public AwsRdsDbClusterSnapshotDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsDbClusterSnapshotDetails awsRdsDbClusterSnapshotDetails = new AwsRdsDbClusterSnapshotDetails();

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
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SnapshotCreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setSnapshotCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Engine", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setClusterCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setLicenseModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setSnapshotType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PercentProgress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setPercentProgress(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StorageEncrypted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setStorageEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setDbClusterIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterSnapshotIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setDbClusterSnapshotIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamDatabaseAuthenticationEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setIamDatabaseAuthenticationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DbClusterSnapshotAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbClusterSnapshotDetails.setDbClusterSnapshotAttributes(new ListUnmarshaller<AwsRdsDbClusterSnapshotDbClusterSnapshotAttribute>(
                            AwsRdsDbClusterSnapshotDbClusterSnapshotAttributeJsonUnmarshaller.getInstance())

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

        return awsRdsDbClusterSnapshotDetails;
    }

    private static AwsRdsDbClusterSnapshotDetailsJsonUnmarshaller instance;

    public static AwsRdsDbClusterSnapshotDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbClusterSnapshotDetailsJsonUnmarshaller();
        return instance;
    }
}
