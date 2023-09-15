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
 * InputDeviceUhdSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceUhdSettingsJsonUnmarshaller implements Unmarshaller<InputDeviceUhdSettings, JsonUnmarshallerContext> {

    public InputDeviceUhdSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        InputDeviceUhdSettings inputDeviceUhdSettings = new InputDeviceUhdSettings();

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
                if (context.testExpression("activeInput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setActiveInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("configuredInput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setConfiguredInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setDeviceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setFramerate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("height", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scanType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setScanType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("width", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("latencyMs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setLatencyMs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("codec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setCodec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mediaconnectSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceUhdSettings.setMediaconnectSettings(InputDeviceMediaConnectSettingsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return inputDeviceUhdSettings;
    }

    private static InputDeviceUhdSettingsJsonUnmarshaller instance;

    public static InputDeviceUhdSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceUhdSettingsJsonUnmarshaller();
        return instance;
    }
}
