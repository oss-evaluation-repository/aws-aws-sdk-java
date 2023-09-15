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
 * Firewall JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallJsonUnmarshaller implements Unmarshaller<Firewall, JsonUnmarshallerContext> {

    public Firewall unmarshall(JsonUnmarshallerContext context) throws Exception {
        Firewall firewall = new Firewall();

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
                if (context.testExpression("FirewallName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setFirewallName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setFirewallArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallPolicyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setFirewallPolicyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setSubnetMappings(new ListUnmarshaller<SubnetMapping>(SubnetMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DeleteProtection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setDeleteProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SubnetChangeProtection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setSubnetChangeProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("FirewallPolicyChangeProtection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setFirewallPolicyChangeProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setFirewallId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EncryptionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    firewall.setEncryptionConfiguration(EncryptionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return firewall;
    }

    private static FirewallJsonUnmarshaller instance;

    public static FirewallJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FirewallJsonUnmarshaller();
        return instance;
    }
}
