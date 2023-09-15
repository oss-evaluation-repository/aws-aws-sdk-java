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
 * BackupJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupJobJsonUnmarshaller implements Unmarshaller<BackupJob, JsonUnmarshallerContext> {

    public BackupJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        BackupJob backupJob = new BackupJob();

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
                if (context.testExpression("AccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupJobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setBackupJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setBackupVaultName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupVaultArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecoveryPointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setRecoveryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setCompletionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PercentDone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setPercentDone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupSizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setBackupSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setCreatedBy(RecoveryPointCreatorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExpectedCompletionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setExpectedCompletionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setStartBy(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BytesTransferred", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setBytesTransferred(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("BackupOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob
                            .setBackupOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("BackupType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setBackupType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParentJobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setParentJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsParent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setIsParent(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ResourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backupJob.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return backupJob;
    }

    private static BackupJobJsonUnmarshaller instance;

    public static BackupJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupJobJsonUnmarshaller();
        return instance;
    }
}
