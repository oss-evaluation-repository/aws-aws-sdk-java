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
package com.amazonaws.services.serverlessapplicationrepository.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.serverlessapplicationrepository.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateApplicationVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateApplicationVersionResultJsonUnmarshaller implements Unmarshaller<CreateApplicationVersionResult, JsonUnmarshallerContext> {

    public CreateApplicationVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateApplicationVersionResult createApplicationVersionResult = new CreateApplicationVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createApplicationVersionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createApplicationVersionResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createApplicationVersionResult.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameterDefinitions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createApplicationVersionResult.setParameterDefinitions(new ListUnmarshaller<ParameterDefinition>(ParameterDefinitionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("requiredCapabilities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createApplicationVersionResult.setRequiredCapabilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("resourcesSupported", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createApplicationVersionResult.setResourcesSupported(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("semanticVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createApplicationVersionResult.setSemanticVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceCodeArchiveUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createApplicationVersionResult.setSourceCodeArchiveUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceCodeUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createApplicationVersionResult.setSourceCodeUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createApplicationVersionResult.setTemplateUrl(context.getUnmarshaller(String.class).unmarshall(context));
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

        return createApplicationVersionResult;
    }

    private static CreateApplicationVersionResultJsonUnmarshaller instance;

    public static CreateApplicationVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateApplicationVersionResultJsonUnmarshaller();
        return instance;
    }
}
