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
package com.amazonaws.services.migrationhubrefactorspaces.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.migrationhubrefactorspaces.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetEnvironmentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnvironmentResultJsonUnmarshaller implements Unmarshaller<GetEnvironmentResult, JsonUnmarshallerContext> {

    public GetEnvironmentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEnvironmentResult getEnvironmentResult = new GetEnvironmentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEnvironmentResult;
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
                    getEnvironmentResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnvironmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Error", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setError(ErrorResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkFabricType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setNetworkFabricType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setOwnerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TransitGatewayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEnvironmentResult.setTransitGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getEnvironmentResult;
    }

    private static GetEnvironmentResultJsonUnmarshaller instance;

    public static GetEnvironmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEnvironmentResultJsonUnmarshaller();
        return instance;
    }
}
