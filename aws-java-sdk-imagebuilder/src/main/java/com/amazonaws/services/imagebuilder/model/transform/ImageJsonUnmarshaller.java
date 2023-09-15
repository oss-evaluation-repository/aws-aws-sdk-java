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
 * Image JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageJsonUnmarshaller implements Unmarshaller<Image, JsonUnmarshallerContext> {

    public Image unmarshall(JsonUnmarshallerContext context) throws Exception {
        Image image = new Image();

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
                    image.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enhancedImageMetadataEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setEnhancedImageMetadataEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("osVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setOsVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setState(ImageStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageRecipe", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setImageRecipe(ImageRecipeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("containerRecipe", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setContainerRecipe(ContainerRecipeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourcePipelineName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setSourcePipelineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourcePipelineArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setSourcePipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("infrastructureConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setInfrastructureConfiguration(InfrastructureConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("distributionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setDistributionConfiguration(DistributionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageTestsConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setImageTestsConfiguration(ImageTestsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dateCreated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setDateCreated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputResources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setOutputResources(OutputResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("buildType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setBuildType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setImageSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setScanState(ImageScanStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageScanningConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    image.setImageScanningConfiguration(ImageScanningConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return image;
    }

    private static ImageJsonUnmarshaller instance;

    public static ImageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageJsonUnmarshaller();
        return instance;
    }
}
