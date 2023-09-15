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
 * Environment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentJsonUnmarshaller implements Unmarshaller<Environment, JsonUnmarshallerContext> {

    public Environment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Environment environment = new Environment();

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
                    environment.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("codebuildRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setCodebuildRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("componentRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setComponentRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("deploymentStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setDeploymentStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentAccountConnectionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setEnvironmentAccountConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setEnvironmentAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastAttemptedDeploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setLastAttemptedDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastDeploymentAttemptedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setLastDeploymentAttemptedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastDeploymentSucceededAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setLastDeploymentSucceededAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastSucceededDeploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setLastSucceededDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("protonServiceRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setProtonServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provisioning", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setProvisioning(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("provisioningRepository", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setProvisioningRepository(RepositoryBranchJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("spec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateMajorVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setTemplateMajorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateMinorVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setTemplateMinorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("templateName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return environment;
    }

    private static EnvironmentJsonUnmarshaller instance;

    public static EnvironmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentJsonUnmarshaller();
        return instance;
    }
}
