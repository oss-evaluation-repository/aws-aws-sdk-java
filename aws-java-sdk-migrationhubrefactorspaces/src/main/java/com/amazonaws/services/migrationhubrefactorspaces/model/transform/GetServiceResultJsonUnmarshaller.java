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
 * GetServiceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceResultJsonUnmarshaller implements Unmarshaller<GetServiceResult, JsonUnmarshallerContext> {

    public GetServiceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetServiceResult getServiceResult = new GetServiceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getServiceResult;
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
                    getServiceResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedByAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setCreatedByAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnvironmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Error", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setError(ErrorResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LambdaEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setLambdaEndpoint(LambdaEndpointConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setOwnerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setServiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("UrlEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setUrlEndpoint(UrlEndpointConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getServiceResult.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getServiceResult;
    }

    private static GetServiceResultJsonUnmarshaller instance;

    public static GetServiceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetServiceResultJsonUnmarshaller();
        return instance;
    }
}
