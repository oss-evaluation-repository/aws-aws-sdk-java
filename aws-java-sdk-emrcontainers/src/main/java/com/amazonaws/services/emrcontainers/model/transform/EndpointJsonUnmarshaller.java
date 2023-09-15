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
package com.amazonaws.services.emrcontainers.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.emrcontainers.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Endpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointJsonUnmarshaller implements Unmarshaller<Endpoint, JsonUnmarshallerContext> {

    public Endpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        Endpoint endpoint = new Endpoint();

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
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualClusterId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setVirtualClusterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("releaseLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setReleaseLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateAuthority", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setCertificateAuthority(CertificateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("configurationOverrides", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setConfigurationOverrides(ConfigurationOverridesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serverUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setServerUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("securityGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setSecurityGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subnetIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("stateDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setStateDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return endpoint;
    }

    private static EndpointJsonUnmarshaller instance;

    public static EndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonUnmarshaller();
        return instance;
    }
}
