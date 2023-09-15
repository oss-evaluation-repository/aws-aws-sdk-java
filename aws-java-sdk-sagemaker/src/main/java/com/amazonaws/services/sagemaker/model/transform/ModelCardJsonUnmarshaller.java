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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ModelCard JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelCardJsonUnmarshaller implements Unmarshaller<ModelCard, JsonUnmarshallerContext> {

    public ModelCard unmarshall(JsonUnmarshallerContext context) throws Exception {
        ModelCard modelCard = new ModelCard();

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
                if (context.testExpression("ModelCardArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setModelCardArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setModelCardName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setModelCardVersion(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelCardStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setModelCardStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setSecurityConfig(ModelCardSecurityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ModelId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RiskRating", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setRiskRating(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelPackageGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    modelCard.setModelPackageGroupName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return modelCard;
    }

    private static ModelCardJsonUnmarshaller instance;

    public static ModelCardJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ModelCardJsonUnmarshaller();
        return instance;
    }
}
