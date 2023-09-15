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
 * AwsEc2VolumeDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2VolumeDetailsJsonUnmarshaller implements Unmarshaller<AwsEc2VolumeDetails, JsonUnmarshallerContext> {

    public AwsEc2VolumeDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEc2VolumeDetails awsEc2VolumeDetails = new AwsEc2VolumeDetails();

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
                if (context.testExpression("CreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setCreateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Size", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attachments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setAttachments(new ListUnmarshaller<AwsEc2VolumeAttachment>(AwsEc2VolumeAttachmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VolumeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setVolumeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeScanStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEc2VolumeDetails.setVolumeScanStatus(context.getUnmarshaller(String.class).unmarshall(context));
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

        return awsEc2VolumeDetails;
    }

    private static AwsEc2VolumeDetailsJsonUnmarshaller instance;

    public static AwsEc2VolumeDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2VolumeDetailsJsonUnmarshaller();
        return instance;
    }
}
