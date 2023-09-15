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
 * MembershipSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MembershipSummaryJsonUnmarshaller implements Unmarshaller<MembershipSummary, JsonUnmarshallerContext> {

    public MembershipSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        MembershipSummary membershipSummary = new MembershipSummary();

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
                    membershipSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setCollaborationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setCollaborationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationCreatorAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setCollaborationCreatorAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationCreatorDisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setCollaborationCreatorDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("collaborationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setCollaborationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("memberAbilities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    membershipSummary.setMemberAbilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return membershipSummary;
    }

    private static MembershipSummaryJsonUnmarshaller instance;

    public static MembershipSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MembershipSummaryJsonUnmarshaller();
        return instance;
    }
}
