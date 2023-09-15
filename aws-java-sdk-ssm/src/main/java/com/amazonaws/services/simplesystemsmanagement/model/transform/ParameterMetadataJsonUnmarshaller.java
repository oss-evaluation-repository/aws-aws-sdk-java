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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ParameterMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParameterMetadataJsonUnmarshaller implements Unmarshaller<ParameterMetadata, JsonUnmarshallerContext> {

    public ParameterMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        ParameterMetadata parameterMetadata = new ParameterMetadata();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedUser", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setLastModifiedUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AllowedPattern", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setAllowedPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Tier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setTier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Policies", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setPolicies(new ListUnmarshaller<ParameterInlinePolicy>(ParameterInlinePolicyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    parameterMetadata.setDataType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return parameterMetadata;
    }

    private static ParameterMetadataJsonUnmarshaller instance;

    public static ParameterMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ParameterMetadataJsonUnmarshaller();
        return instance;
    }
}
