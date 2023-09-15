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
package com.amazonaws.services.cleanrooms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cleanrooms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Membership JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MembershipJsonUnmarshaller implements Unmarshaller<Membership, JsonUnmarshallerContext> {

    public Membership unmarshall(JsonUnmarshallerContext context) throws Exception {
        Membership membership = new Membership();

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
                    membership.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationCreatorAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setCollaborationCreatorAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationCreatorDisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setCollaborationCreatorDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setCollaborationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("memberAbilities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setMemberAbilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("queryLogStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setQueryLogStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultResultConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membership.setDefaultResultConfiguration(MembershipProtectedQueryResultConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return membership;
    }

    private static MembershipJsonUnmarshaller instance;

    public static MembershipJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MembershipJsonUnmarshaller();
        return instance;
    }
}
