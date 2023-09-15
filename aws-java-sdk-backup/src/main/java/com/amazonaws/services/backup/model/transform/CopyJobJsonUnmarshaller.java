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
 * CopyJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyJobJsonUnmarshaller implements Unmarshaller<CopyJob, JsonUnmarshallerContext> {

    public CopyJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        CopyJob copyJob = new CopyJob();

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
                    copyJob.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CopyJobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setCopyJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBackupVaultArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setSourceBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceRecoveryPointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setSourceRecoveryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationBackupVaultArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setDestinationBackupVaultArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationRecoveryPointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setDestinationRecoveryPointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setCompletionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackupSizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setBackupSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setCreatedBy(RecoveryPointCreatorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParentJobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setParentJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsParent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setIsParent(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CompositeMemberIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setCompositeMemberIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfChildJobs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setNumberOfChildJobs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ChildJobsInState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setChildJobsInState(new MapUnmarshaller<String, Long>(context.getUnmarshaller(String.class), context.getUnmarshaller(Long.class))
                            .unmarshall(context));
                }
                if (context.testExpression("ResourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    copyJob.setResourceName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return copyJob;
    }

    private static CopyJobJsonUnmarshaller instance;

    public static CopyJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CopyJobJsonUnmarshaller();
        return instance;
    }
}
