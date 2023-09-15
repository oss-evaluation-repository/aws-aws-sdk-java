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
package com.amazonaws.services.ivs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ivs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Channel JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChannelJsonUnmarshaller implements Unmarshaller<Channel, JsonUnmarshallerContext> {

    public Channel unmarshall(JsonUnmarshallerContext context) throws Exception {
        Channel channel = new Channel();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorized", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setAuthorized(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ingestEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setIngestEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("insecureIngest", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setInsecureIngest(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("latencyMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setLatencyMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("playbackUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setPlaybackUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("preset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setPreset(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recordingConfigurationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setRecordingConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    channel.setType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return channel;
    }

    private static ChannelJsonUnmarshaller instance;

    public static ChannelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChannelJsonUnmarshaller();
        return instance;
    }
}
