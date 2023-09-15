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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DocumentClassifierProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentClassifierPropertiesJsonUnmarshaller implements Unmarshaller<DocumentClassifierProperties, JsonUnmarshallerContext> {

    public DocumentClassifierProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        DocumentClassifierProperties documentClassifierProperties = new DocumentClassifierProperties();

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
                if (context.testExpression("DocumentClassifierArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setDocumentClassifierArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubmitTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setSubmitTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setTrainingStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setTrainingEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setInputDataConfig(DocumentClassifierInputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setOutputDataConfig(DocumentClassifierOutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ClassifierMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setClassifierMetadata(ClassifierMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeKmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setVolumeKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Mode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelKmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setModelKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setVersionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setSourceModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FlywheelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    documentClassifierProperties.setFlywheelArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return documentClassifierProperties;
    }

    private static DocumentClassifierPropertiesJsonUnmarshaller instance;

    public static DocumentClassifierPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DocumentClassifierPropertiesJsonUnmarshaller();
        return instance;
    }
}
