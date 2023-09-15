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
 * AwsRdsDbSnapshotDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbSnapshotDetailsJsonUnmarshaller implements Unmarshaller<AwsRdsDbSnapshotDetails, JsonUnmarshallerContext> {

    public AwsRdsDbSnapshotDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsDbSnapshotDetails awsRdsDbSnapshotDetails = new AwsRdsDbSnapshotDetails();

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
                if (context.testExpression("DbSnapshotIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setDbSnapshotIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbInstanceIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setDbInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotCreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setSnapshotCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Engine", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setInstanceCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setLicenseModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setSnapshotType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Iops", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OptionGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setOptionGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PercentProgress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setPercentProgress(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SourceRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setSourceRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceDbSnapshotIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setSourceDbSnapshotIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TdeCredentialArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setTdeCredentialArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamDatabaseAuthenticationEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setIamDatabaseAuthenticationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ProcessorFeatures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setProcessorFeatures(new ListUnmarshaller<AwsRdsDbProcessorFeature>(AwsRdsDbProcessorFeatureJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DbiResourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbSnapshotDetails.setDbiResourceId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return awsRdsDbSnapshotDetails;
    }

    private static AwsRdsDbSnapshotDetailsJsonUnmarshaller instance;

    public static AwsRdsDbSnapshotDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbSnapshotDetailsJsonUnmarshaller();
        return instance;
    }
}
