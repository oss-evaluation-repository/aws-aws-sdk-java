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
package com.amazonaws.services.transfer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribedExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedExecutionJsonUnmarshaller implements Unmarshaller<DescribedExecution, JsonUnmarshallerContext> {

    public DescribedExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribedExecution describedExecution = new DescribedExecution();

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
                if (context.testExpression("ExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedExecution.setExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitialFileLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedExecution.setInitialFileLocation(FileLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ServiceMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedExecution.setServiceMetadata(ServiceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExecutionRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedExecution.setExecutionRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggingConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedExecution.setLoggingConfiguration(LoggingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PosixProfile", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedExecution.setPosixProfile(PosixProfileJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedExecution.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Results", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedExecution.setResults(ExecutionResultsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describedExecution;
    }

    private static DescribedExecutionJsonUnmarshaller instance;

    public static DescribedExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedExecutionJsonUnmarshaller();
        return instance;
    }
}
