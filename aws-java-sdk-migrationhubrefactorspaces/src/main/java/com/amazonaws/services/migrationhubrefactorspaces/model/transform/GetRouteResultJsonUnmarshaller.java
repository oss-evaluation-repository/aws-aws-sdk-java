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
 * GetRouteResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRouteResultJsonUnmarshaller implements Unmarshaller<GetRouteResult, JsonUnmarshallerContext> {

    public GetRouteResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRouteResult getRouteResult = new GetRouteResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRouteResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("AppendSourcePath", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setAppendSourcePath(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedByAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setCreatedByAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EnvironmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Error", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setError(ErrorResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IncludeChildPaths", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setIncludeChildPaths(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Methods", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setMethods(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("OwnerAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setOwnerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PathResourceToId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setPathResourceToId(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RouteId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setRouteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RouteType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setRouteType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setServiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourcePath", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setSourcePath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRouteResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return getRouteResult;
    }

    private static GetRouteResultJsonUnmarshaller instance;

    public static GetRouteResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRouteResultJsonUnmarshaller();
        return instance;
    }
}
