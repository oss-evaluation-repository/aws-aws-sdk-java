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
package com.amazonaws.services.iotevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DetectorModelVersionSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorModelVersionSummaryJsonUnmarshaller implements Unmarshaller<DetectorModelVersionSummary, JsonUnmarshallerContext> {

    public DetectorModelVersionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DetectorModelVersionSummary detectorModelVersionSummary = new DetectorModelVersionSummary();

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
                if (context.testExpression("detectorModelName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    detectorModelVersionSummary.setDetectorModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorModelVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    detectorModelVersionSummary.setDetectorModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    detectorModelVersionSummary.setDetectorModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    detectorModelVersionSummary.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    detectorModelVersionSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    detectorModelVersionSummary.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    detectorModelVersionSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("evaluationMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    detectorModelVersionSummary.setEvaluationMethod(context.getUnmarshaller(String.class).unmarshall(context));
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

        return detectorModelVersionSummary;
    }

    private static DetectorModelVersionSummaryJsonUnmarshaller instance;

    public static DetectorModelVersionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetectorModelVersionSummaryJsonUnmarshaller();
        return instance;
    }
}
