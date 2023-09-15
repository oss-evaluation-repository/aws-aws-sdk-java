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
package com.amazonaws.services.backup.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeRecoveryPointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecoveryPointResultJsonUnmarshaller implements Unmarshaller<DescribeRecoveryPointResult, JsonUnmarshallerContext> {

    public DescribeRecoveryPointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeRecoveryPointResult describeRecoveryPointResult = new DescribeRecoveryPointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeRecoveryPointResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RecoveryPointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setRecoveryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setBackupVaultName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBackupVaultArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setSourceBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setCreatedBy(RecoveryPointCreatorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setCompletionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BackupSizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setBackupSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CalculatedLifecycle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setCalculatedLifecycle(CalculatedLifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setLifecycle(LifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsEncrypted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setIsEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StorageClass", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setStorageClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastRestoreTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setLastRestoreTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ParentRecoveryPointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setParentRecoveryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompositeMemberIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setCompositeMemberIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsParent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setIsParent(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ResourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRecoveryPointResult.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeRecoveryPointResult;
    }

    private static DescribeRecoveryPointResultJsonUnmarshaller instance;

    public static DescribeRecoveryPointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRecoveryPointResultJsonUnmarshaller();
        return instance;
    }
}
