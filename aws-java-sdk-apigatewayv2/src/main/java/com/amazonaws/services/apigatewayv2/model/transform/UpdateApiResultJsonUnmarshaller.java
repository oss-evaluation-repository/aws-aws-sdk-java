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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateApiResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApiResultJsonUnmarshaller implements Unmarshaller<UpdateApiResult, JsonUnmarshallerContext> {

    public UpdateApiResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateApiResult updateApiResult = new UpdateApiResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateApiResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("apiEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setApiEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiGatewayManaged", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setApiGatewayManaged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("apiId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setApiId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("apiKeySelectionExpression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setApiKeySelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("corsConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setCorsConfiguration(CorsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("disableSchemaValidation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setDisableSchemaValidation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("disableExecuteApiEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setDisableExecuteApiEndpoint(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("importInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setImportInfo(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("protocolType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setProtocolType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeSelectionExpression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setRouteSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("warnings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateApiResult.setWarnings(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
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

        return updateApiResult;
    }

    private static UpdateApiResultJsonUnmarshaller instance;

    public static UpdateApiResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateApiResultJsonUnmarshaller();
        return instance;
    }
}
