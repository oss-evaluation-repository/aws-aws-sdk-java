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
 * MedicalTranscriptionJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MedicalTranscriptionJobJsonUnmarshaller implements Unmarshaller<MedicalTranscriptionJob, JsonUnmarshallerContext> {

    public MedicalTranscriptionJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        MedicalTranscriptionJob medicalTranscriptionJob = new MedicalTranscriptionJob();

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
                if (context.testExpression("MedicalTranscriptionJobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setMedicalTranscriptionJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TranscriptionJobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setTranscriptionJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MediaSampleRateHertz", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setMediaSampleRateHertz(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MediaFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setMediaFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Media", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setMedia(MediaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Transcript", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setTranscript(MedicalTranscriptJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Settings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setSettings(MedicalTranscriptionSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ContentIdentificationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setContentIdentificationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Specialty", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setSpecialty(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    medicalTranscriptionJob.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

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

        return medicalTranscriptionJob;
    }

    private static MedicalTranscriptionJobJsonUnmarshaller instance;

    public static MedicalTranscriptionJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MedicalTranscriptionJobJsonUnmarshaller();
        return instance;
    }
}
