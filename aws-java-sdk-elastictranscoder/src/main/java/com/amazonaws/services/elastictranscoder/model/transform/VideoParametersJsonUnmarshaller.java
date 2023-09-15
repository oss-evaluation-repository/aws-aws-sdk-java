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
 * VideoParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoParametersJsonUnmarshaller implements Unmarshaller<VideoParameters, JsonUnmarshallerContext> {

    public VideoParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        VideoParameters videoParameters = new VideoParameters();

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
                if (context.testExpression("Codec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setCodec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodecOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setCodecOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("KeyframesMaxDist", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setKeyframesMaxDist(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FixedGOP", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setFixedGOP(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BitRate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setBitRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FrameRate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setFrameRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxFrameRate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setMaxFrameRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Resolution", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setResolution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AspectRatio", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setAspectRatio(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxWidth", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setMaxWidth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxHeight", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setMaxHeight(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayAspectRatio", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setDisplayAspectRatio(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SizingPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setSizingPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PaddingPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setPaddingPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Watermarks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoParameters.setWatermarks(new ListUnmarshaller<PresetWatermark>(PresetWatermarkJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return videoParameters;
    }

    private static VideoParametersJsonUnmarshaller instance;

    public static VideoParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VideoParametersJsonUnmarshaller();
        return instance;
    }
}
