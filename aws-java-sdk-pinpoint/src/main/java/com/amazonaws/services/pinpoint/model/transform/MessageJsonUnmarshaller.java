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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Message JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageJsonUnmarshaller implements Unmarshaller<Message, JsonUnmarshallerContext> {

    public Message unmarshall(JsonUnmarshallerContext context) throws Exception {
        Message message = new Message();

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
                if (context.testExpression("Action", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Body", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageIconUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setImageIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageSmallIconUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setImageSmallIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setImageUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JsonBody", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setJsonBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MediaUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setMediaUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RawContent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setRawContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SilentPush", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setSilentPush(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TimeToLive", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setTimeToLive(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    message.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
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

        return message;
    }

    private static MessageJsonUnmarshaller instance;

    public static MessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MessageJsonUnmarshaller();
        return instance;
    }
}
