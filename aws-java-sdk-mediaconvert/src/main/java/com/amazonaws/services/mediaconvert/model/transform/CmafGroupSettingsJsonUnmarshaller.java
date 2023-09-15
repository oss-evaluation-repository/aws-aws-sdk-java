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
 * CmafGroupSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafGroupSettingsJsonUnmarshaller implements Unmarshaller<CmafGroupSettings, JsonUnmarshallerContext> {

    public CmafGroupSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        CmafGroupSettings cmafGroupSettings = new CmafGroupSettings();

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
                if (context.testExpression("additionalManifests", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setAdditionalManifests(new ListUnmarshaller<CmafAdditionalManifest>(CmafAdditionalManifestJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("baseUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setBaseUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientCache", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setClientCache(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codecSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setCodecSpecification(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dashManifestStyle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setDashManifestStyle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destination", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setDestination(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setDestinationSettings(DestinationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("encryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setEncryption(CmafEncryptionSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fragmentLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setFragmentLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("imageBasedTrickPlay", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setImageBasedTrickPlay(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageBasedTrickPlaySettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setImageBasedTrickPlaySettings(CmafImageBasedTrickPlaySettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("manifestCompression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setManifestCompression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manifestDurationFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setManifestDurationFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minBufferTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setMinBufferTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minFinalSegmentLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setMinFinalSegmentLength(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("mpdManifestBandwidthType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setMpdManifestBandwidthType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mpdProfile", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setMpdProfile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ptsOffsetHandlingForBFrames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setPtsOffsetHandlingForBFrames(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setSegmentControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("segmentLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setSegmentLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("segmentLengthControl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setSegmentLengthControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("streamInfResolution", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setStreamInfResolution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetDurationCompatibilityMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setTargetDurationCompatibilityMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("videoCompositionOffsets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setVideoCompositionOffsets(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("writeDashManifest", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setWriteDashManifest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("writeHlsManifest", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setWriteHlsManifest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("writeSegmentTimelineInRepresentation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cmafGroupSettings.setWriteSegmentTimelineInRepresentation(context.getUnmarshaller(String.class).unmarshall(context));
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

        return cmafGroupSettings;
    }

    private static CmafGroupSettingsJsonUnmarshaller instance;

    public static CmafGroupSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CmafGroupSettingsJsonUnmarshaller();
        return instance;
    }
}
