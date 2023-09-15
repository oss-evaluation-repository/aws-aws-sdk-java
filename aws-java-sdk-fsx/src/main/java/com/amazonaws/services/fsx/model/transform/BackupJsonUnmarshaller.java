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
 * Backup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BackupJsonUnmarshaller implements Unmarshaller<Backup, JsonUnmarshallerContext> {

    public Backup unmarshall(JsonUnmarshallerContext context) throws Exception {
        Backup backup = new Backup();

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
                if (context.testExpression("BackupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setBackupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setLifecycle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setFailureDetails(BackupFailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProgressPercent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setProgressPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setResourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FileSystem", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setFileSystem(FileSystemJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DirectoryInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setDirectoryInformation(ActiveDirectoryBackupAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBackupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setSourceBackupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBackupRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setSourceBackupRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Volume", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    backup.setVolume(VolumeJsonUnmarshaller.getInstance().unmarshall(context));
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

        return backup;
    }

    private static BackupJsonUnmarshaller instance;

    public static BackupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BackupJsonUnmarshaller();
        return instance;
    }
}
