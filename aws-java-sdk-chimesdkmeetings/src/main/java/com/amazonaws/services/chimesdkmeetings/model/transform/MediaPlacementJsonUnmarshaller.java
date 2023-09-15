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
package com.amazonaws.services.chimesdkmeetings.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmeetings.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MediaPlacement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaPlacementJsonUnmarshaller implements Unmarshaller<MediaPlacement, JsonUnmarshallerContext> {

    public MediaPlacement unmarshall(JsonUnmarshallerContext context) throws Exception {
        MediaPlacement mediaPlacement = new MediaPlacement();

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
                if (context.testExpression("AudioHostUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaPlacement.setAudioHostUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AudioFallbackUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaPlacement.setAudioFallbackUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SignalingUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaPlacement.setSignalingUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TurnControlUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaPlacement.setTurnControlUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScreenDataUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaPlacement.setScreenDataUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScreenViewingUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaPlacement.setScreenViewingUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScreenSharingUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaPlacement.setScreenSharingUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventIngestionUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mediaPlacement.setEventIngestionUrl(context.getUnmarshaller(String.class).unmarshall(context));
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

        return mediaPlacement;
    }

    private static MediaPlacementJsonUnmarshaller instance;

    public static MediaPlacementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MediaPlacementJsonUnmarshaller();
        return instance;
    }
}
