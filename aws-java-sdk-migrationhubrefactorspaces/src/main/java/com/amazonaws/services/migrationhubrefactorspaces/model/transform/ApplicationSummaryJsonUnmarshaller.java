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
 * ApplicationSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSummaryJsonUnmarshaller implements Unmarshaller<ApplicationSummary, JsonUnmarshallerContext> {

    public ApplicationSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ApplicationSummary applicationSummary = new ApplicationSummary();

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
                if (context.testExpression("ApiGatewayProxy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setApiGatewayProxy(ApiGatewayProxySummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedByAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setCreatedByAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EnvironmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Error", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setError(ErrorResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setOwnerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProxyType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setProxyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary
                            .setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    applicationSummary.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return applicationSummary;
    }

    private static ApplicationSummaryJsonUnmarshaller instance;

    public static ApplicationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ApplicationSummaryJsonUnmarshaller();
        return instance;
    }
}
