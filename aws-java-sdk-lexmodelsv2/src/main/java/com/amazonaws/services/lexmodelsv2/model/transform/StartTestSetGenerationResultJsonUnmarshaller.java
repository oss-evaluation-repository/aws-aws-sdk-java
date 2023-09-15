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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartTestSetGenerationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTestSetGenerationResultJsonUnmarshaller implements Unmarshaller<StartTestSetGenerationResult, JsonUnmarshallerContext> {

    public StartTestSetGenerationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartTestSetGenerationResult startTestSetGenerationResult = new StartTestSetGenerationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startTestSetGenerationResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("testSetGenerationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startTestSetGenerationResult.setTestSetGenerationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startTestSetGenerationResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("testSetGenerationStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startTestSetGenerationResult.setTestSetGenerationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSetName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startTestSetGenerationResult.setTestSetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startTestSetGenerationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storageLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startTestSetGenerationResult.setStorageLocation(TestSetStorageLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("generationDataSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startTestSetGenerationResult.setGenerationDataSource(TestSetGenerationDataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startTestSetGenerationResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("testSetTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startTestSetGenerationResult.setTestSetTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

        return startTestSetGenerationResult;
    }

    private static StartTestSetGenerationResultJsonUnmarshaller instance;

    public static StartTestSetGenerationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartTestSetGenerationResultJsonUnmarshaller();
        return instance;
    }
}
