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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportJobResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportJobResponseJsonUnmarshaller implements Unmarshaller<ImportJobResponse, JsonUnmarshallerContext> {

    public ImportJobResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportJobResponse importJobResponse = new ImportJobResponse();

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
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompletedPieces", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setCompletedPieces(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CompletionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setCompletionDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Definition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setDefinition(ImportJobResourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FailedPieces", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setFailedPieces(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Failures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setFailures(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalFailures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setTotalFailures(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TotalPieces", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setTotalPieces(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TotalProcessed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setTotalProcessed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importJobResponse.setType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return importJobResponse;
    }

    private static ImportJobResponseJsonUnmarshaller instance;

    public static ImportJobResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportJobResponseJsonUnmarshaller();
        return instance;
    }
}
