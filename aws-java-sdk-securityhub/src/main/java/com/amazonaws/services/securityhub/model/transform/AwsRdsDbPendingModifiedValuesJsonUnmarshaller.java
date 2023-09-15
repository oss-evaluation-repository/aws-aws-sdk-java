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
 * AwsRdsDbPendingModifiedValues JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRdsDbPendingModifiedValuesJsonUnmarshaller implements Unmarshaller<AwsRdsDbPendingModifiedValues, JsonUnmarshallerContext> {

    public AwsRdsDbPendingModifiedValues unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsRdsDbPendingModifiedValues awsRdsDbPendingModifiedValues = new AwsRdsDbPendingModifiedValues();

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
                if (context.testExpression("DbInstanceClass", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setDbInstanceClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllocatedStorage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setAllocatedStorage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MasterUserPassword", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setMasterUserPassword(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BackupRetentionPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setBackupRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MultiAZ", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setMultiAZ(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LicenseModel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setLicenseModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Iops", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DbInstanceIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setDbInstanceIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StorageType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setStorageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CaCertificateIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setCaCertificateIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DbSubnetGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setDbSubnetGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PendingCloudWatchLogsExports", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setPendingCloudWatchLogsExports(AwsRdsPendingCloudWatchLogsExportsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ProcessorFeatures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsRdsDbPendingModifiedValues.setProcessorFeatures(new ListUnmarshaller<AwsRdsDbProcessorFeature>(AwsRdsDbProcessorFeatureJsonUnmarshaller
                            .getInstance())

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

        return awsRdsDbPendingModifiedValues;
    }

    private static AwsRdsDbPendingModifiedValuesJsonUnmarshaller instance;

    public static AwsRdsDbPendingModifiedValuesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsRdsDbPendingModifiedValuesJsonUnmarshaller();
        return instance;
    }
}
