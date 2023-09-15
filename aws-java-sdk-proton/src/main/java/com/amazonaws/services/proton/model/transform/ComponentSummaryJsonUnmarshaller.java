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
package com.amazonaws.services.proton.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.proton.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ComponentSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentSummaryJsonUnmarshaller implements Unmarshaller<ComponentSummary, JsonUnmarshallerContext> {

    public ComponentSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComponentSummary componentSummary = new ComponentSummary();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deploymentStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setDeploymentStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setEnvironmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastAttemptedDeploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setLastAttemptedDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastDeploymentAttemptedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setLastDeploymentAttemptedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastDeploymentSucceededAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setLastDeploymentSucceededAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setLastModifiedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastSucceededDeploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setLastSucceededDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceInstanceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setServiceInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    componentSummary.setServiceName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return componentSummary;
    }

    private static ComponentSummaryJsonUnmarshaller instance;

    public static ComponentSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComponentSummaryJsonUnmarshaller();
        return instance;
    }
}
