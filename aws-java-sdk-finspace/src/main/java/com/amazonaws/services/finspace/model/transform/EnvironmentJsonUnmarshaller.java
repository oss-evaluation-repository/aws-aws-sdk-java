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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
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
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setEnvironmentUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setEnvironmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sageMakerStudioDomainUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setSageMakerStudioDomainUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dedicatedServiceAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setDedicatedServiceAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("federationMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setFederationMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("federationParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setFederationParameters(FederationParametersJsonUnmarshaller.getInstance().unmarshall(context));
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
