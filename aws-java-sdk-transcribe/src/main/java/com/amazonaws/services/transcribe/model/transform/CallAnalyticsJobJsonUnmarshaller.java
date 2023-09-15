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
package com.amazonaws.services.transcribe.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transcribe.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CallAnalyticsJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CallAnalyticsJobJsonUnmarshaller implements Unmarshaller<CallAnalyticsJob, JsonUnmarshallerContext> {

    public CallAnalyticsJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        CallAnalyticsJob callAnalyticsJob = new CallAnalyticsJob();

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
                if (context.testExpression("CallAnalyticsJobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setCallAnalyticsJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CallAnalyticsJobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setCallAnalyticsJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MediaSampleRateHertz", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setMediaSampleRateHertz(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MediaFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setMediaFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Media", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setMedia(MediaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Transcript", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setTranscript(TranscriptJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentifiedLanguageScore", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setIdentifiedLanguageScore(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("Settings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setSettings(CallAnalyticsJobSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChannelDefinitions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    callAnalyticsJob.setChannelDefinitions(new ListUnmarshaller<ChannelDefinition>(ChannelDefinitionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return callAnalyticsJob;
    }

    private static CallAnalyticsJobJsonUnmarshaller instance;

    public static CallAnalyticsJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CallAnalyticsJobJsonUnmarshaller();
        return instance;
    }
}
