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
package com.amazonaws.services.route53resolver.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.route53resolver.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResolverEndpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverEndpointJsonUnmarshaller implements Unmarshaller<ResolverEndpoint, JsonUnmarshallerContext> {

    public ResolverEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResolverEndpoint resolverEndpoint = new ResolverEndpoint();

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
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatorRequestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setCreatorRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Direction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setDirection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddressCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setIpAddressCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HostVPCId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setHostVPCId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModificationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setModificationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResolverEndpointType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setResolverEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutpostArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setOutpostArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredInstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverEndpoint.setPreferredInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return resolverEndpoint;
    }

    private static ResolverEndpointJsonUnmarshaller instance;

    public static ResolverEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResolverEndpointJsonUnmarshaller();
        return instance;
    }
}
