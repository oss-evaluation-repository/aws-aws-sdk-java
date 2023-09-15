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
package com.amazonaws.services.rekognition.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SegmentDetection JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentDetectionJsonUnmarshaller implements Unmarshaller<SegmentDetection, JsonUnmarshallerContext> {

    public SegmentDetection unmarshall(JsonUnmarshallerContext context) throws Exception {
        SegmentDetection segmentDetection = new SegmentDetection();

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
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTimestampMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setStartTimestampMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EndTimestampMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setEndTimestampMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DurationMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setDurationMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("StartTimecodeSMPTE", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setStartTimecodeSMPTE(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndTimecodeSMPTE", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setEndTimecodeSMPTE(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DurationSMPTE", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setDurationSMPTE(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TechnicalCueSegment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setTechnicalCueSegment(TechnicalCueSegmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ShotSegment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setShotSegment(ShotSegmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartFrameNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setStartFrameNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("EndFrameNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setEndFrameNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DurationFrames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentDetection.setDurationFrames(context.getUnmarshaller(Long.class).unmarshall(context));
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

        return segmentDetection;
    }

    private static SegmentDetectionJsonUnmarshaller instance;

    public static SegmentDetectionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SegmentDetectionJsonUnmarshaller();
        return instance;
    }
}
