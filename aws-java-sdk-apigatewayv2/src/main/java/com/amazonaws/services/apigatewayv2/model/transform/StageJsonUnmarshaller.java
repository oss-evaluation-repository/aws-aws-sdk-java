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
 * Stage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageJsonUnmarshaller implements Unmarshaller<Stage, JsonUnmarshallerContext> {

    public Stage unmarshall(JsonUnmarshallerContext context) throws Exception {
        Stage stage = new Stage();

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
                if (context.testExpression("accessLogSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setAccessLogSettings(AccessLogSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("apiGatewayManaged", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setApiGatewayManaged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("autoDeploy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setAutoDeploy(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("clientCertificateId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setClientCertificateId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("defaultRouteSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setDefaultRouteSettings(RouteSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastDeploymentStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setLastDeploymentStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("routeSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setRouteSettings(new MapUnmarshaller<String, RouteSettings>(context.getUnmarshaller(String.class), RouteSettingsJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("stageName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setStageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stageVariables", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setStageVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stage.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return stage;
    }

    private static StageJsonUnmarshaller instance;

    public static StageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StageJsonUnmarshaller();
        return instance;
    }
}
