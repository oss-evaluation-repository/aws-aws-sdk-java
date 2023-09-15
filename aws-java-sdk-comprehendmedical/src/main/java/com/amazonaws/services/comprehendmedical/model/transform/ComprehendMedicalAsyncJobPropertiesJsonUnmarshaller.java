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
package com.amazonaws.services.comprehendmedical.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehendmedical.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ComprehendMedicalAsyncJobProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller implements Unmarshaller<ComprehendMedicalAsyncJobProperties, JsonUnmarshallerContext> {

    public ComprehendMedicalAsyncJobProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComprehendMedicalAsyncJobProperties comprehendMedicalAsyncJobProperties = new ComprehendMedicalAsyncJobProperties();

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
                    comprehendMedicalAsyncJobProperties.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubmitTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setSubmitTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExpirationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setExpirationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setInputDataConfig(InputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setOutputDataConfig(OutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManifestFilePath", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setManifestFilePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KMSKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setKMSKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comprehendMedicalAsyncJobProperties.setModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
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

        return comprehendMedicalAsyncJobProperties;
    }

    private static ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller instance;

    public static ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComprehendMedicalAsyncJobPropertiesJsonUnmarshaller();
        return instance;
    }
}
