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
package com.amazonaws.services.mediatailor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SegmentationDescriptor JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SegmentationDescriptorJsonUnmarshaller implements Unmarshaller<SegmentationDescriptor, JsonUnmarshallerContext> {

    public SegmentationDescriptor unmarshall(JsonUnmarshallerContext context) throws Exception {
        SegmentationDescriptor segmentationDescriptor = new SegmentationDescriptor();

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
                if (context.testExpression("SegmentNum", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentationDescriptor.setSegmentNum(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentationEventId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentationDescriptor.setSegmentationEventId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentationTypeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentationDescriptor.setSegmentationTypeId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentationUpid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentationDescriptor.setSegmentationUpid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SegmentationUpidType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentationDescriptor.setSegmentationUpidType(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SegmentsExpected", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentationDescriptor.setSegmentsExpected(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SubSegmentNum", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentationDescriptor.setSubSegmentNum(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SubSegmentsExpected", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    segmentationDescriptor.setSubSegmentsExpected(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return segmentationDescriptor;
    }

    private static SegmentationDescriptorJsonUnmarshaller instance;

    public static SegmentationDescriptorJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SegmentationDescriptorJsonUnmarshaller();
        return instance;
    }
}
