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
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Gnss JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GnssJsonUnmarshaller implements Unmarshaller<Gnss, JsonUnmarshallerContext> {

    public Gnss unmarshall(JsonUnmarshallerContext context) throws Exception {
        Gnss gnss = new Gnss();

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
                if (context.testExpression("Payload", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gnss.setPayload(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CaptureTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gnss.setCaptureTime(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("CaptureTimeAccuracy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gnss.setCaptureTimeAccuracy(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("AssistPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gnss.setAssistPosition(new ListUnmarshaller<Float>(context.getUnmarshaller(Float.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AssistAltitude", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gnss.setAssistAltitude(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("Use2DSolver", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gnss.setUse2DSolver(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return gnss;
    }

    private static GnssJsonUnmarshaller instance;

    public static GnssJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GnssJsonUnmarshaller();
        return instance;
    }
}
