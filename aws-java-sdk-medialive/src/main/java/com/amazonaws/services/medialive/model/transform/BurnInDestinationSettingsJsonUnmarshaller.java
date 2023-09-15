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
 * BurnInDestinationSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BurnInDestinationSettingsJsonUnmarshaller implements Unmarshaller<BurnInDestinationSettings, JsonUnmarshallerContext> {

    public BurnInDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        BurnInDestinationSettings burnInDestinationSettings = new BurnInDestinationSettings();

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
                if (context.testExpression("alignment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backgroundColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setBackgroundColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backgroundOpacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setBackgroundOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("font", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setFont(InputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fontColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setFontColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fontOpacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setFontOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fontResolution", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setFontResolution(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fontSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setFontSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outlineColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setOutlineColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outlineSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setOutlineSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setShadowColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shadowOpacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setShadowOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowXOffset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setShadowXOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowYOffset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setShadowYOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("teletextGridControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setTeletextGridControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("xPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setXPosition(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("yPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burnInDestinationSettings.setYPosition(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return burnInDestinationSettings;
    }

    private static BurnInDestinationSettingsJsonUnmarshaller instance;

    public static BurnInDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BurnInDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
