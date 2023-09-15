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
package com.amazonaws.services.wafv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WebACL JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WebACLJsonUnmarshaller implements Unmarshaller<WebACL, JsonUnmarshallerContext> {

    public WebACL unmarshall(JsonUnmarshallerContext context) throws Exception {
        WebACL webACL = new WebACL();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultAction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setDefaultAction(DefaultActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Rules", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setRules(new ListUnmarshaller<Rule>(RuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VisibilityConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setVisibilityConfig(VisibilityConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Capacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setCapacity(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("PreProcessFirewallManagerRuleGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setPreProcessFirewallManagerRuleGroups(new ListUnmarshaller<FirewallManagerRuleGroup>(FirewallManagerRuleGroupJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PostProcessFirewallManagerRuleGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setPostProcessFirewallManagerRuleGroups(new ListUnmarshaller<FirewallManagerRuleGroup>(FirewallManagerRuleGroupJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ManagedByFirewallManager", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setManagedByFirewallManager(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LabelNamespace", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setLabelNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomResponseBodies", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setCustomResponseBodies(new MapUnmarshaller<String, CustomResponseBody>(context.getUnmarshaller(String.class),
                            CustomResponseBodyJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("CaptchaConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setCaptchaConfig(CaptchaConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChallengeConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setChallengeConfig(ChallengeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TokenDomains", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setTokenDomains(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AssociationConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    webACL.setAssociationConfig(AssociationConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return webACL;
    }

    private static WebACLJsonUnmarshaller instance;

    public static WebACLJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WebACLJsonUnmarshaller();
        return instance;
    }
}
