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
 * TranscriptionJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptionJobJsonUnmarshaller implements Unmarshaller<TranscriptionJob, JsonUnmarshallerContext> {

    public TranscriptionJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        TranscriptionJob transcriptionJob = new TranscriptionJob();

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
                if (context.testExpression("TranscriptionJobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setTranscriptionJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TranscriptionJobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setTranscriptionJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MediaSampleRateHertz", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setMediaSampleRateHertz(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MediaFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setMediaFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Media", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setMedia(MediaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Transcript", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setTranscript(TranscriptJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Settings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setSettings(SettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setModelSettings(ModelSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobExecutionSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setJobExecutionSettings(JobExecutionSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ContentRedaction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setContentRedaction(ContentRedactionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IdentifyLanguage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setIdentifyLanguage(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IdentifyMultipleLanguages", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setIdentifyMultipleLanguages(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LanguageOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setLanguageOptions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("IdentifiedLanguageScore", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setIdentifiedLanguageScore(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("LanguageCodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setLanguageCodes(new ListUnmarshaller<LanguageCodeItem>(LanguageCodeItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Subtitles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setSubtitles(SubtitlesOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LanguageIdSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setLanguageIdSettings(new MapUnmarshaller<String, LanguageIdSettings>(context.getUnmarshaller(String.class),
                            LanguageIdSettingsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ToxicityDetection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transcriptionJob.setToxicityDetection(new ListUnmarshaller<ToxicityDetectionSettings>(ToxicityDetectionSettingsJsonUnmarshaller
                            .getInstance())

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

        return transcriptionJob;
    }

    private static TranscriptionJobJsonUnmarshaller instance;

    public static TranscriptionJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TranscriptionJobJsonUnmarshaller();
        return instance;
    }
}
