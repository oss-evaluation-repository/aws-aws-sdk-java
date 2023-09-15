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
 * GetLabelDetectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetLabelDetectionResultJsonUnmarshaller implements Unmarshaller<GetLabelDetectionResult, JsonUnmarshallerContext> {

    public GetLabelDetectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetLabelDetectionResult getLabelDetectionResult = new GetLabelDetectionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getLabelDetectionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VideoMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setVideoMetadata(VideoMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Labels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setLabels(new ListUnmarshaller<LabelDetection>(LabelDetectionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LabelModelVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setLabelModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Video", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setVideo(VideoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobTag", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setJobTag(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GetRequestMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getLabelDetectionResult.setGetRequestMetadata(GetLabelDetectionRequestMetadataJsonUnmarshaller.getInstance().unmarshall(context));
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

        return getLabelDetectionResult;
    }

    private static GetLabelDetectionResultJsonUnmarshaller instance;

    public static GetLabelDetectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetLabelDetectionResultJsonUnmarshaller();
        return instance;
    }
}
