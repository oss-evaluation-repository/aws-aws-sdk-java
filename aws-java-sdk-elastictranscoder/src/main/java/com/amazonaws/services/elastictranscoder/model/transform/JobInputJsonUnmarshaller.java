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
package com.amazonaws.services.elastictranscoder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elastictranscoder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobInput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobInputJsonUnmarshaller implements Unmarshaller<JobInput, JsonUnmarshallerContext> {

    public JobInput unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobInput jobInput = new JobInput();

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
                if (context.testExpression("Key", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FrameRate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setFrameRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Resolution", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setResolution(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AspectRatio", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setAspectRatio(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Interlaced", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setInterlaced(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Container", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setContainer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Encryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setEncryption(EncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimeSpan", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setTimeSpan(TimeSpanJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputCaptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setInputCaptions(InputCaptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DetectedProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobInput.setDetectedProperties(DetectedPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
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

        return jobInput;
    }

    private static JobInputJsonUnmarshaller instance;

    public static JobInputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobInputJsonUnmarshaller();
        return instance;
    }
}
