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
 * InsertableImage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsertableImageJsonUnmarshaller implements Unmarshaller<InsertableImage, JsonUnmarshallerContext> {

    public InsertableImage unmarshall(JsonUnmarshallerContext context) throws Exception {
        InsertableImage insertableImage = new InsertableImage();

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
                if (context.testExpression("duration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fadeIn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setFadeIn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("fadeOut", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setFadeOut(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("height", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setHeight(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("imageInserterInput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setImageInserterInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageX", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setImageX(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("imageY", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setImageY(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("layer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setLayer(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("opacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setOpacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("width", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insertableImage.setWidth(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return insertableImage;
    }

    private static InsertableImageJsonUnmarshaller instance;

    public static InsertableImageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsertableImageJsonUnmarshaller();
        return instance;
    }
}
