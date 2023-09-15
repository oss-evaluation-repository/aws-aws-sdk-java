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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DiskSnapshot JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DiskSnapshotJsonUnmarshaller implements Unmarshaller<DiskSnapshot, JsonUnmarshallerContext> {

    public DiskSnapshot unmarshall(JsonUnmarshallerContext context) throws Exception {
        DiskSnapshot diskSnapshot = new DiskSnapshot();

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
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("sizeInGb", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setSizeInGb(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("progress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setProgress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromDiskName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setFromDiskName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromDiskArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setFromDiskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromInstanceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setFromInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fromInstanceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setFromInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isFromAutoSnapshot", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    diskSnapshot.setIsFromAutoSnapshot(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return diskSnapshot;
    }

    private static DiskSnapshotJsonUnmarshaller instance;

    public static DiskSnapshotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DiskSnapshotJsonUnmarshaller();
        return instance;
    }
}
