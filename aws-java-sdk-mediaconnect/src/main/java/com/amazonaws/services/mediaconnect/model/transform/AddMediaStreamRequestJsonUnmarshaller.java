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
package com.amazonaws.services.mediaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AddMediaStreamRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddMediaStreamRequestJsonUnmarshaller implements Unmarshaller<AddMediaStreamRequest, JsonUnmarshallerContext> {

    public AddMediaStreamRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AddMediaStreamRequest addMediaStreamRequest = new AddMediaStreamRequest();

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
                if (context.testExpression("attributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    addMediaStreamRequest.setAttributes(MediaStreamAttributesRequestJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("clockRate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    addMediaStreamRequest.setClockRate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    addMediaStreamRequest.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mediaStreamId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    addMediaStreamRequest.setMediaStreamId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("mediaStreamName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    addMediaStreamRequest.setMediaStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mediaStreamType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    addMediaStreamRequest.setMediaStreamType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("videoFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    addMediaStreamRequest.setVideoFormat(context.getUnmarshaller(String.class).unmarshall(context));
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

        return addMediaStreamRequest;
    }

    private static AddMediaStreamRequestJsonUnmarshaller instance;

    public static AddMediaStreamRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddMediaStreamRequestJsonUnmarshaller();
        return instance;
    }
}
