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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AutomationRulesConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationRulesConfigJsonUnmarshaller implements Unmarshaller<AutomationRulesConfig, JsonUnmarshallerContext> {

    public AutomationRulesConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutomationRulesConfig automationRulesConfig = new AutomationRulesConfig();

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
                if (context.testExpression("RuleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setRuleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setRuleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleOrder", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setRuleOrder(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RuleName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setRuleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsTerminal", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setIsTerminal(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Criteria", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setCriteria(AutomationRulesFindingFiltersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Actions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setActions(new ListUnmarshaller<AutomationRulesAction>(AutomationRulesActionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesConfig.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
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

        return automationRulesConfig;
    }

    private static AutomationRulesConfigJsonUnmarshaller instance;

    public static AutomationRulesConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutomationRulesConfigJsonUnmarshaller();
        return instance;
    }
}
