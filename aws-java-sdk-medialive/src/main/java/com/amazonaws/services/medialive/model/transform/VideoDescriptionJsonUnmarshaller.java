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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VideoDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoDescriptionJsonUnmarshaller implements Unmarshaller<VideoDescription, JsonUnmarshallerContext> {

    public VideoDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        VideoDescription videoDescription = new VideoDescription();

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
                if (context.testExpression("codecSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoDescription.setCodecSettings(VideoCodecSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("height", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoDescription.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoDescription.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("respondToAfd", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoDescription.setRespondToAfd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scalingBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoDescription.setScalingBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sharpness", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoDescription.setSharpness(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("width", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    videoDescription.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return videoDescription;
    }

    private static VideoDescriptionJsonUnmarshaller instance;

    public static VideoDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VideoDescriptionJsonUnmarshaller();
        return instance;
    }
}
