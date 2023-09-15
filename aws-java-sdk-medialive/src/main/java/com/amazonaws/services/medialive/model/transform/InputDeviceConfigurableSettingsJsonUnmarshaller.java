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
 * InputDeviceConfigurableSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceConfigurableSettingsJsonUnmarshaller implements Unmarshaller<InputDeviceConfigurableSettings, JsonUnmarshallerContext> {

    public InputDeviceConfigurableSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        InputDeviceConfigurableSettings inputDeviceConfigurableSettings = new InputDeviceConfigurableSettings();

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
                if (context.testExpression("configuredInput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceConfigurableSettings.setConfiguredInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceConfigurableSettings.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("latencyMs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceConfigurableSettings.setLatencyMs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("codec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceConfigurableSettings.setCodec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mediaconnectSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceConfigurableSettings.setMediaconnectSettings(InputDeviceMediaConnectConfigurableSettingsJsonUnmarshaller.getInstance()
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

        return inputDeviceConfigurableSettings;
    }

    private static InputDeviceConfigurableSettingsJsonUnmarshaller instance;

    public static InputDeviceConfigurableSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceConfigurableSettingsJsonUnmarshaller();
        return instance;
    }
}
