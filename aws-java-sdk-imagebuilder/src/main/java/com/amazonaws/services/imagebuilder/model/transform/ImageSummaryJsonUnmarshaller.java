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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImageSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageSummaryJsonUnmarshaller implements Unmarshaller<ImageSummary, JsonUnmarshallerContext> {

    public ImageSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImageSummary imageSummary = new ImageSummary();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("osVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setOsVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setState(ImageStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("owner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dateCreated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setDateCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputResources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setOutputResources(OutputResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("buildType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setBuildType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageSummary.setImageSource(context.getUnmarshaller(String.class).unmarshall(context));
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

        return imageSummary;
    }

    private static ImageSummaryJsonUnmarshaller instance;

    public static ImageSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageSummaryJsonUnmarshaller();
        return instance;
    }
}
