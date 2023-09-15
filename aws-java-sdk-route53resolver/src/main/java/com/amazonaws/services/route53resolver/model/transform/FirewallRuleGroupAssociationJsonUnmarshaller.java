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
 * FirewallRuleGroupAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallRuleGroupAssociationJsonUnmarshaller implements Unmarshaller<FirewallRuleGroupAssociation, JsonUnmarshallerContext> {

    public FirewallRuleGroupAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        FirewallRuleGroupAssociation firewallRuleGroupAssociation = new FirewallRuleGroupAssociation();

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
                    firewallRuleGroupAssociation.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallRuleGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setFirewallRuleGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MutationProtection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setMutationProtection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManagedOwnerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setManagedOwnerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatorRequestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setCreatorRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModificationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallRuleGroupAssociation.setModificationTime(context.getUnmarshaller(String.class).unmarshall(context));
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

        return firewallRuleGroupAssociation;
    }

    private static FirewallRuleGroupAssociationJsonUnmarshaller instance;

    public static FirewallRuleGroupAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FirewallRuleGroupAssociationJsonUnmarshaller();
        return instance;
    }
}
