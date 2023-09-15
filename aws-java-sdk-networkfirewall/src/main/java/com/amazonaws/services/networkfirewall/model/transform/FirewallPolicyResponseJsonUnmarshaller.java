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
package com.amazonaws.services.networkfirewall.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkfirewall.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FirewallPolicyResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallPolicyResponseJsonUnmarshaller implements Unmarshaller<FirewallPolicyResponse, JsonUnmarshallerContext> {

    public FirewallPolicyResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        FirewallPolicyResponse firewallPolicyResponse = new FirewallPolicyResponse();

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
                if (context.testExpression("FirewallPolicyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setFirewallPolicyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallPolicyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setFirewallPolicyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallPolicyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setFirewallPolicyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallPolicyStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setFirewallPolicyStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ConsumedStatelessRuleCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setConsumedStatelessRuleCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ConsumedStatefulRuleCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setConsumedStatefulRuleCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfAssociations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setNumberOfAssociations(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setEncryptionConfiguration(EncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewallPolicyResponse.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return firewallPolicyResponse;
    }

    private static FirewallPolicyResponseJsonUnmarshaller instance;

    public static FirewallPolicyResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FirewallPolicyResponseJsonUnmarshaller();
        return instance;
    }
}
