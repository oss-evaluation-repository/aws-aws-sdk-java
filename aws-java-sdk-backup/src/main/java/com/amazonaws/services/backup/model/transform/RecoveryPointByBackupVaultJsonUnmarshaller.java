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
 * RecoveryPointByBackupVault JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryPointByBackupVaultJsonUnmarshaller implements Unmarshaller<RecoveryPointByBackupVault, JsonUnmarshallerContext> {

    public RecoveryPointByBackupVault unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecoveryPointByBackupVault recoveryPointByBackupVault = new RecoveryPointByBackupVault();

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
                if (context.testExpression("RecoveryPointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setRecoveryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setBackupVaultName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBackupVaultArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setSourceBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setCreatedBy(RecoveryPointCreatorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setCompletionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BackupSizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setBackupSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CalculatedLifecycle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setCalculatedLifecycle(CalculatedLifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setLifecycle(LifecycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EncryptionKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsEncrypted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setIsEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastRestoreTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setLastRestoreTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ParentRecoveryPointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setParentRecoveryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompositeMemberIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setCompositeMemberIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsParent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setIsParent(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ResourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryPointByBackupVault.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return recoveryPointByBackupVault;
    }

    private static RecoveryPointByBackupVaultJsonUnmarshaller instance;

    public static RecoveryPointByBackupVaultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryPointByBackupVaultJsonUnmarshaller();
        return instance;
    }
}
