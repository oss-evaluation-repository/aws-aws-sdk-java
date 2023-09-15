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
package com.amazonaws.services.transfer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.transfer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribedServer JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribedServerJsonUnmarshaller implements Unmarshaller<DescribedServer, JsonUnmarshallerContext> {

    public DescribedServer unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribedServer describedServer = new DescribedServer();

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
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Certificate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setCertificate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProtocolDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setProtocolDetails(ProtocolDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Domain", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setEndpointDetails(EndpointDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EndpointType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HostKeyFingerprint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setHostKeyFingerprint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityProviderDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setIdentityProviderDetails(IdentityProviderDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IdentityProviderType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setIdentityProviderType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoggingRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setLoggingRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostAuthenticationLoginBanner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setPostAuthenticationLoginBanner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreAuthenticationLoginBanner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setPreAuthenticationLoginBanner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Protocols", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setProtocols(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SecurityPolicyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setSecurityPolicyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setServerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setUserCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WorkflowDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setWorkflowDetails(WorkflowDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StructuredLogDestinations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describedServer.setStructuredLogDestinations(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return describedServer;
    }

    private static DescribedServerJsonUnmarshaller instance;

    public static DescribedServerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribedServerJsonUnmarshaller();
        return instance;
    }
}
