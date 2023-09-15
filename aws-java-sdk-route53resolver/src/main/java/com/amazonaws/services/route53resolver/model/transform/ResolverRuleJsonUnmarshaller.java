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
 * ResolverRule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolverRuleJsonUnmarshaller implements Unmarshaller<ResolverRule, JsonUnmarshallerContext> {

    public ResolverRule unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResolverRule resolverRule = new ResolverRule();

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
                    resolverRule.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatorRequestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setCreatorRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setRuleType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetIps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setTargetIps(new ListUnmarshaller<TargetAddress>(TargetAddressJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResolverEndpointId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setResolverEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShareStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setShareStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModificationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resolverRule.setModificationTime(context.getUnmarshaller(String.class).unmarshall(context));
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

        return resolverRule;
    }

    private static ResolverRuleJsonUnmarshaller instance;

    public static ResolverRuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResolverRuleJsonUnmarshaller();
        return instance;
    }
}
