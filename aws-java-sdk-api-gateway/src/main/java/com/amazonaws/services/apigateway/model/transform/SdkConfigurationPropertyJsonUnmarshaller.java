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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SdkConfigurationProperty JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SdkConfigurationPropertyJsonUnmarshaller implements Unmarshaller<SdkConfigurationProperty, JsonUnmarshallerContext> {

    public SdkConfigurationProperty unmarshall(JsonUnmarshallerContext context) throws Exception {
        SdkConfigurationProperty sdkConfigurationProperty = new SdkConfigurationProperty();

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
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sdkConfigurationProperty.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("friendlyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sdkConfigurationProperty.setFriendlyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sdkConfigurationProperty.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("required", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sdkConfigurationProperty.setRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("defaultValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sdkConfigurationProperty.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
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

        return sdkConfigurationProperty;
    }

    private static SdkConfigurationPropertyJsonUnmarshaller instance;

    public static SdkConfigurationPropertyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SdkConfigurationPropertyJsonUnmarshaller();
        return instance;
    }
}
