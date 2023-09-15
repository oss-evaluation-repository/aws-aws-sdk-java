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
 * OutputSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputSettingsJsonUnmarshaller implements Unmarshaller<OutputSettings, JsonUnmarshallerContext> {

    public OutputSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        OutputSettings outputSettings = new OutputSettings();

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
                if (context.testExpression("archiveOutputSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputSettings.setArchiveOutputSettings(ArchiveOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("frameCaptureOutputSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputSettings.setFrameCaptureOutputSettings(FrameCaptureOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hlsOutputSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputSettings.setHlsOutputSettings(HlsOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mediaPackageOutputSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputSettings.setMediaPackageOutputSettings(MediaPackageOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("msSmoothOutputSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputSettings.setMsSmoothOutputSettings(MsSmoothOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("multiplexOutputSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputSettings.setMultiplexOutputSettings(MultiplexOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rtmpOutputSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputSettings.setRtmpOutputSettings(RtmpOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("udpOutputSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outputSettings.setUdpOutputSettings(UdpOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return outputSettings;
    }

    private static OutputSettingsJsonUnmarshaller instance;

    public static OutputSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OutputSettingsJsonUnmarshaller();
        return instance;
    }
}
