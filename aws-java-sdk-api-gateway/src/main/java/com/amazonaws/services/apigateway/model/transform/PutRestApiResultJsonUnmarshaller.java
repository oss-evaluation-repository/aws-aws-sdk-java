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
 * PutRestApiResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRestApiResultJsonUnmarshaller implements Unmarshaller<PutRestApiResult, JsonUnmarshallerContext> {

    public PutRestApiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutRestApiResult putRestApiResult = new PutRestApiResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putRestApiResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("warnings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setWarnings(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("binaryMediaTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setBinaryMediaTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("minimumCompressionSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setMinimumCompressionSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("apiKeySource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setApiKeySource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpointConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setEndpointConfiguration(EndpointConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("policy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("disableExecuteApiEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setDisableExecuteApiEndpoint(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("rootResourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putRestApiResult.setRootResourceId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return putRestApiResult;
    }

    private static PutRestApiResultJsonUnmarshaller instance;

    public static PutRestApiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutRestApiResultJsonUnmarshaller();
        return instance;
    }
}
