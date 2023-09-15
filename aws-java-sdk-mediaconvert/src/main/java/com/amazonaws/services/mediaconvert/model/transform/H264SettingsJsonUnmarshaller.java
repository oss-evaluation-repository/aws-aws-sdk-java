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
 * H264Settings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class H264SettingsJsonUnmarshaller implements Unmarshaller<H264Settings, JsonUnmarshallerContext> {

    public H264Settings unmarshall(JsonUnmarshallerContext context) throws Exception {
        H264Settings h264Settings = new H264Settings();

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
                if (context.testExpression("adaptiveQuantization", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bandwidthReductionFilter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setBandwidthReductionFilter(BandwidthReductionFilterJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("bitrate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("codecLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setCodecLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codecProfile", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setCodecProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dynamicSubGop", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setDynamicSubGop(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entropyEncoding", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setEntropyEncoding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fieldEncoding", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFieldEncoding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flickerAdaptiveQuantization", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFlickerAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateConversionAlgorithm", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFramerateConversionAlgorithm(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateDenominator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFramerateDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("framerateNumerator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFramerateNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopBReference", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setGopBReference(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gopClosedCadence", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setGopClosedCadence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("gopSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setGopSize(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("gopSizeUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setGopSizeUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferFinalFillPercentage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setHrdBufferFinalFillPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferInitialFillPercentage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setHrdBufferInitialFillPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hrdBufferSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setHrdBufferSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("interlaceMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setInterlaceMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minIInterval", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setMinIInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberBFramesBetweenReferenceFrames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setNumberBFramesBetweenReferenceFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("numberReferenceFrames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setNumberReferenceFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setParControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parDenominator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setParDenominator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parNumerator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setParNumerator(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("qualityTuningLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setQualityTuningLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("qvbrSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setQvbrSettings(H264QvbrSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rateControlMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setRateControlMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("repeatPps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setRepeatPps(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanTypeConversionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setScanTypeConversionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sceneChangeDetect", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSceneChangeDetect(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slices", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSlices(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("slowPal", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSlowPal(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("softness", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSoftness(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("spatialAdaptiveQuantization", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSpatialAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("syntax", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSyntax(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("telecine", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setTelecine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("temporalAdaptiveQuantization", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setTemporalAdaptiveQuantization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unregisteredSeiTimecode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setUnregisteredSeiTimecode(context.getUnmarshaller(String.class).unmarshall(context));
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

        return h264Settings;
    }

    private static H264SettingsJsonUnmarshaller instance;

    public static H264SettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new H264SettingsJsonUnmarshaller();
        return instance;
    }
}
