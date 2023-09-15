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
package com.amazonaws.services.polly.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.polly.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SynthesisTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SynthesisTaskJsonUnmarshaller implements Unmarshaller<SynthesisTask, JsonUnmarshallerContext> {

    public SynthesisTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        SynthesisTask synthesisTask = new SynthesisTask();

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
                if (context.testExpression("Engine", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setTaskStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskStatusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setTaskStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setOutputUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RequestCharacters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setRequestCharacters(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setSnsTopicArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LexiconNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setLexiconNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("OutputFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setOutputFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SampleRate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setSampleRate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SpeechMarkTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setSpeechMarkTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("TextType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setTextType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VoiceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setVoiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    synthesisTask.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
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

        return synthesisTask;
    }

    private static SynthesisTaskJsonUnmarshaller instance;

    public static SynthesisTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SynthesisTaskJsonUnmarshaller();
        return instance;
    }
}
