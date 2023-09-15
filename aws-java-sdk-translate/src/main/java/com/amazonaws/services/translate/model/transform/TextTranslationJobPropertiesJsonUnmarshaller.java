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
package com.amazonaws.services.translate.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.translate.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TextTranslationJobProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextTranslationJobPropertiesJsonUnmarshaller implements Unmarshaller<TextTranslationJobProperties, JsonUnmarshallerContext> {

    public TextTranslationJobProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        TextTranslationJobProperties textTranslationJobProperties = new TextTranslationJobProperties();

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
                if (context.testExpression("JobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setJobDetails(JobDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceLanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setSourceLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetLanguageCodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setTargetLanguageCodes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("TerminologyNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setTerminologyNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ParallelDataNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setParallelDataNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubmittedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setSubmittedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setInputDataConfig(InputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Settings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    textTranslationJobProperties.setSettings(TranslationSettingsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return textTranslationJobProperties;
    }

    private static TextTranslationJobPropertiesJsonUnmarshaller instance;

    public static TextTranslationJobPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TextTranslationJobPropertiesJsonUnmarshaller();
        return instance;
    }
}
