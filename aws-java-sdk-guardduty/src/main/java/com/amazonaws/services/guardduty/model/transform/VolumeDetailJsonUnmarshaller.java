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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VolumeDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeDetailJsonUnmarshaller implements Unmarshaller<VolumeDetail, JsonUnmarshallerContext> {

    public VolumeDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        VolumeDetail volumeDetail = new VolumeDetail();

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
                if (context.testExpression("volumeArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeDetail.setVolumeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeDetail.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeDetail.setDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("volumeSizeInGB", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeDetail.setVolumeSizeInGB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("encryptionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeDetail.setEncryptionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("snapshotArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeDetail.setSnapshotArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeDetail.setKmsKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return volumeDetail;
    }

    private static VolumeDetailJsonUnmarshaller instance;

    public static VolumeDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeDetailJsonUnmarshaller();
        return instance;
    }
}
