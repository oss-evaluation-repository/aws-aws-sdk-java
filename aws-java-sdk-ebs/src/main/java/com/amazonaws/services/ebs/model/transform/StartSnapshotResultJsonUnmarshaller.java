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
package com.amazonaws.services.ebs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ebs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartSnapshotResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSnapshotResultJsonUnmarshaller implements Unmarshaller<StartSnapshotResult, JsonUnmarshallerContext> {

    public StartSnapshotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartSnapshotResult startSnapshotResult = new StartSnapshotResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startSnapshotResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("VolumeSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setVolumeSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("BlockSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setBlockSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ParentSnapshotId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setParentSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SseType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startSnapshotResult.setSseType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return startSnapshotResult;
    }

    private static StartSnapshotResultJsonUnmarshaller instance;

    public static StartSnapshotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartSnapshotResultJsonUnmarshaller();
        return instance;
    }
}
