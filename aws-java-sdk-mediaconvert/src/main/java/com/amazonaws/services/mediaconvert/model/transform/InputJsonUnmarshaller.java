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
 * Input JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputJsonUnmarshaller implements Unmarshaller<Input, JsonUnmarshallerContext> {

    public Input unmarshall(JsonUnmarshallerContext context) throws Exception {
        Input input = new Input();

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
                if (context.testExpression("advancedInputFilter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setAdvancedInputFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("advancedInputFilterSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setAdvancedInputFilterSettings(AdvancedInputFilterSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("audioSelectorGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setAudioSelectorGroups(new MapUnmarshaller<String, AudioSelectorGroup>(context.getUnmarshaller(String.class),
                            AudioSelectorGroupJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("audioSelectors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setAudioSelectors(new MapUnmarshaller<String, AudioSelector>(context.getUnmarshaller(String.class), AudioSelectorJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("captionSelectors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setCaptionSelectors(new MapUnmarshaller<String, CaptionSelector>(context.getUnmarshaller(String.class),
                            CaptionSelectorJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("crop", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setCrop(RectangleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deblockFilter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setDeblockFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("decryptionSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setDecryptionSettings(InputDecryptionSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("denoiseFilter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setDenoiseFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dolbyVisionMetadataXml", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setDolbyVisionMetadataXml(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileInput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setFileInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterEnable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setFilterEnable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterStrength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setFilterStrength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("imageInserter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setImageInserter(ImageInserterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputClippings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setInputClippings(new ListUnmarshaller<InputClipping>(InputClippingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("inputScanType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setInputScanType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("position", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setPosition(RectangleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("programNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setProgramNumber(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("psiControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setPsiControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supplementalImps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setSupplementalImps(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("timecodeSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setTimecodeSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timecodeStart", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setTimecodeStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("videoGenerator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setVideoGenerator(InputVideoGeneratorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("videoSelector", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    input.setVideoSelector(VideoSelectorJsonUnmarshaller.getInstance().unmarshall(context));
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

        return input;
    }

    private static InputJsonUnmarshaller instance;

    public static InputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputJsonUnmarshaller();
        return instance;
    }
}
