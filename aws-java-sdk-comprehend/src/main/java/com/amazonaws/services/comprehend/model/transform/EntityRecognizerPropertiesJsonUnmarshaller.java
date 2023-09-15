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
 * EntityRecognizerProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EntityRecognizerPropertiesJsonUnmarshaller implements Unmarshaller<EntityRecognizerProperties, JsonUnmarshallerContext> {

    public EntityRecognizerProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        EntityRecognizerProperties entityRecognizerProperties = new EntityRecognizerProperties();

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
                if (context.testExpression("EntityRecognizerArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setEntityRecognizerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubmitTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setSubmitTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setTrainingStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TrainingEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setTrainingEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setInputDataConfig(EntityRecognizerInputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RecognizerMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setRecognizerMetadata(EntityRecognizerMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeKmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setVolumeKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ModelKmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setModelKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setVersionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setSourceModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FlywheelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setFlywheelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputDataConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    entityRecognizerProperties.setOutputDataConfig(EntityRecognizerOutputDataConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return entityRecognizerProperties;
    }

    private static EntityRecognizerPropertiesJsonUnmarshaller instance;

    public static EntityRecognizerPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EntityRecognizerPropertiesJsonUnmarshaller();
        return instance;
    }
}
