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
package com.amazonaws.services.appconfig.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appconfig.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateConfigurationProfileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConfigurationProfileResultJsonUnmarshaller implements Unmarshaller<UpdateConfigurationProfileResult, JsonUnmarshallerContext> {

    public UpdateConfigurationProfileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateConfigurationProfileResult updateConfigurationProfileResult = new UpdateConfigurationProfileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateConfigurationProfileResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateConfigurationProfileResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateConfigurationProfileResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateConfigurationProfileResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateConfigurationProfileResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateConfigurationProfileResult.setLocationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetrievalRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateConfigurationProfileResult.setRetrievalRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Validators", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateConfigurationProfileResult.setValidators(new ListUnmarshaller<Validator>(ValidatorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateConfigurationProfileResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return updateConfigurationProfileResult;
    }

    private static UpdateConfigurationProfileResultJsonUnmarshaller instance;

    public static UpdateConfigurationProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateConfigurationProfileResultJsonUnmarshaller();
        return instance;
    }
}
