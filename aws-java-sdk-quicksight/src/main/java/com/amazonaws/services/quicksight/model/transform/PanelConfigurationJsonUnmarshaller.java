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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PanelConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PanelConfigurationJsonUnmarshaller implements Unmarshaller<PanelConfiguration, JsonUnmarshallerContext> {

    public PanelConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        PanelConfiguration panelConfiguration = new PanelConfiguration();

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
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    panelConfiguration.setTitle(PanelTitleOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BorderVisibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    panelConfiguration.setBorderVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BorderThickness", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    panelConfiguration.setBorderThickness(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BorderStyle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    panelConfiguration.setBorderStyle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BorderColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    panelConfiguration.setBorderColor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GutterVisibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    panelConfiguration.setGutterVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GutterSpacing", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    panelConfiguration.setGutterSpacing(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackgroundVisibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    panelConfiguration.setBackgroundVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BackgroundColor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    panelConfiguration.setBackgroundColor(context.getUnmarshaller(String.class).unmarshall(context));
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

        return panelConfiguration;
    }

    private static PanelConfigurationJsonUnmarshaller instance;

    public static PanelConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PanelConfigurationJsonUnmarshaller();
        return instance;
    }
}
