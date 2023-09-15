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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BurninDestinationSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BurninDestinationSettingsJsonUnmarshaller implements Unmarshaller<BurninDestinationSettings, JsonUnmarshallerContext> {

    public BurninDestinationSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        BurninDestinationSettings burninDestinationSettings = new BurninDestinationSettings();

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
                    burninDestinationSettings.setAlignment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applyFontColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setApplyFontColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backgroundColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setBackgroundColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backgroundOpacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setBackgroundOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fallbackFont", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setFallbackFont(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fontColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setFontColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fontOpacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setFontOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fontResolution", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setFontResolution(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fontScript", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setFontScript(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fontSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setFontSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hexFontColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setHexFontColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outlineColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setOutlineColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outlineSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setOutlineSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setShadowColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shadowOpacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setShadowOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowXOffset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setShadowXOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("shadowYOffset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setShadowYOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("stylePassthrough", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setStylePassthrough(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("teletextSpacing", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setTeletextSpacing(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("xPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setXPosition(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("yPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    burninDestinationSettings.setYPosition(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return burninDestinationSettings;
    }

    private static BurninDestinationSettingsJsonUnmarshaller instance;

    public static BurninDestinationSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BurninDestinationSettingsJsonUnmarshaller();
        return instance;
    }
}
