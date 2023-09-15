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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateJobOutput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateJobOutputJsonUnmarshaller implements Unmarshaller<CreateJobOutput, JsonUnmarshallerContext> {

    public CreateJobOutput unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateJobOutput createJobOutput = new CreateJobOutput();

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
                if (context.testExpression("Key", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThumbnailPattern", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setThumbnailPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ThumbnailEncryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setThumbnailEncryption(EncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Rotate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setRotate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PresetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setPresetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SegmentDuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setSegmentDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Watermarks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setWatermarks(new ListUnmarshaller<JobWatermark>(JobWatermarkJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AlbumArt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setAlbumArt(JobAlbumArtJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Composition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setComposition(new ListUnmarshaller<Clip>(ClipJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Captions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setCaptions(CaptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Encryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createJobOutput.setEncryption(EncryptionJsonUnmarshaller.getInstance().unmarshall(context));
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

        return createJobOutput;
    }

    private static CreateJobOutputJsonUnmarshaller instance;

    public static CreateJobOutputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateJobOutputJsonUnmarshaller();
        return instance;
    }
}
