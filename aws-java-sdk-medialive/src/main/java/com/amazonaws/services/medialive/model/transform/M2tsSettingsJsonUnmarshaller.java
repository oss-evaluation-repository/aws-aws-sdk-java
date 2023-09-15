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
 * M2tsSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class M2tsSettingsJsonUnmarshaller implements Unmarshaller<M2tsSettings, JsonUnmarshallerContext> {

    public M2tsSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        M2tsSettings m2tsSettings = new M2tsSettings();

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
                if (context.testExpression("absentInputAudioBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setAbsentInputAudioBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arib", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setArib(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("aribCaptionsPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setAribCaptionsPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("aribCaptionsPidControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setAribCaptionsPidControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audioBufferModel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setAudioBufferModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audioFramesPerPes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setAudioFramesPerPes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("audioPids", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setAudioPids(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("audioStreamType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setAudioStreamType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bitrate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bufferModel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setBufferModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ccDescriptor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setCcDescriptor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dvbNitSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setDvbNitSettings(DvbNitSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dvbSdtSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setDvbSdtSettings(DvbSdtSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dvbSubPids", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setDvbSubPids(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dvbTdtSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setDvbTdtSettings(DvbTdtSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dvbTeletextPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setDvbTeletextPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebif", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setEbif(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebpAudioInterval", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setEbpAudioInterval(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ebpLookaheadMs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setEbpLookaheadMs(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ebpPlacement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setEbpPlacement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ecmPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setEcmPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("esRateInPes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setEsRateInPes(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("etvPlatformPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setEtvPlatformPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("etvSignalPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setEtvSignalPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fragmentTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setFragmentTime(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("klv", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setKlv(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("klvDataPids", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setKlvDataPids(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nielsenId3Behavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setNielsenId3Behavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("nullPacketBitrate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setNullPacketBitrate(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("patInterval", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setPatInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pcrControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setPcrControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pcrPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setPcrPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pcrPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setPcrPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pmtInterval", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setPmtInterval(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pmtPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setPmtPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("programNum", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setProgramNum(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("rateMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setRateMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte27Pids", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setScte27Pids(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte35Control", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setScte35Control(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte35Pid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setScte35Pid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentationMarkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setSegmentationMarkers(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentationStyle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setSegmentationStyle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setSegmentationTime(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setTimedMetadataBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setTimedMetadataPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transportStreamId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setTransportStreamId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("videoPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setVideoPid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scte35PrerollPullupMilliseconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    m2tsSettings.setScte35PrerollPullupMilliseconds(context.getUnmarshaller(Double.class).unmarshall(context));
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

        return m2tsSettings;
    }

    private static M2tsSettingsJsonUnmarshaller instance;

    public static M2tsSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new M2tsSettingsJsonUnmarshaller();
        return instance;
    }
}
