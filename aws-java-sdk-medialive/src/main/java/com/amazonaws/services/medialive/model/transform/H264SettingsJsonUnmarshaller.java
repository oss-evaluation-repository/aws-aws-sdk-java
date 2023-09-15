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
                if (context.testExpression("afdSignaling", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setAfdSignaling(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bitrate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bufFillPct", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setBufFillPct(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bufSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setBufSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("colorMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setColorMetadata(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("colorSpaceSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setColorSpaceSettings(H264ColorSpaceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("entropyEncoding", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setEntropyEncoding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("filterSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFilterSettings(H264FilterSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fixedAfd", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFixedAfd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flickerAq", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFlickerAq(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("forceFieldPictures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setForceFieldPictures(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framerateControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setFramerateControl(context.getUnmarshaller(String.class).unmarshall(context));
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
                if (context.testExpression("gopNumBFrames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setGopNumBFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
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
                if (context.testExpression("level", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lookAheadRateControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setLookAheadRateControl(context.getUnmarshaller(String.class).unmarshall(context));
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
                if (context.testExpression("numRefFrames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setNumRefFrames(context.getUnmarshaller(Integer.class).unmarshall(context));
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
                if (context.testExpression("profile", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("qualityLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setQualityLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("qvbrQualityLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setQvbrQualityLevel(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("rateControlMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setRateControlMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setScanType(context.getUnmarshaller(String.class).unmarshall(context));
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
                if (context.testExpression("softness", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSoftness(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("spatialAq", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSpatialAq(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subgopLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSubgopLength(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("syntax", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setSyntax(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("temporalAq", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setTemporalAq(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timecodeInsertion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setTimecodeInsertion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timecodeBurninSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    h264Settings.setTimecodeBurninSettings(TimecodeBurninSettingsJsonUnmarshaller.getInstance().unmarshall(context));
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
