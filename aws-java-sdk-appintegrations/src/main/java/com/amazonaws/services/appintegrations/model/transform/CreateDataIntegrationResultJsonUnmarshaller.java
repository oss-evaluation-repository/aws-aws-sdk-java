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
package com.amazonaws.services.appintegrations.model.transform;

import java.util.Map;
import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appintegrations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateDataIntegrationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataIntegrationResultJsonUnmarshaller implements Unmarshaller<CreateDataIntegrationResult, JsonUnmarshallerContext> {

    public CreateDataIntegrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateDataIntegrationResult createDataIntegrationResult = new CreateDataIntegrationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createDataIntegrationResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setKmsKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceURI", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setSourceURI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setScheduleConfiguration(ScheduleConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ClientToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setFileConfiguration(FileConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ObjectConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDataIntegrationResult.setObjectConfiguration(new MapUnmarshaller<String, java.util.Map<String, java.util.List<String>>>(context
                            .getUnmarshaller(String.class), new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    )).unmarshall(context));
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

        return createDataIntegrationResult;
    }

    private static CreateDataIntegrationResultJsonUnmarshaller instance;

    public static CreateDataIntegrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDataIntegrationResultJsonUnmarshaller();
        return instance;
    }
}
