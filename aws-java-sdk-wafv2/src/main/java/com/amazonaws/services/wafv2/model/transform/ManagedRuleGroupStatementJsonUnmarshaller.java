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
 * ManagedRuleGroupStatement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ManagedRuleGroupStatementJsonUnmarshaller implements Unmarshaller<ManagedRuleGroupStatement, JsonUnmarshallerContext> {

    public ManagedRuleGroupStatement unmarshall(JsonUnmarshallerContext context) throws Exception {
        ManagedRuleGroupStatement managedRuleGroupStatement = new ManagedRuleGroupStatement();

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
                if (context.testExpression("VendorName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    managedRuleGroupStatement.setVendorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    managedRuleGroupStatement.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    managedRuleGroupStatement.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExcludedRules", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    managedRuleGroupStatement.setExcludedRules(new ListUnmarshaller<ExcludedRule>(ExcludedRuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ScopeDownStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    managedRuleGroupStatement.setScopeDownStatement(StatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ManagedRuleGroupConfigs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    managedRuleGroupStatement.setManagedRuleGroupConfigs(new ListUnmarshaller<ManagedRuleGroupConfig>(ManagedRuleGroupConfigJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RuleActionOverrides", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    managedRuleGroupStatement.setRuleActionOverrides(new ListUnmarshaller<RuleActionOverride>(RuleActionOverrideJsonUnmarshaller.getInstance())

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

        return managedRuleGroupStatement;
    }

    private static ManagedRuleGroupStatementJsonUnmarshaller instance;

    public static ManagedRuleGroupStatementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ManagedRuleGroupStatementJsonUnmarshaller();
        return instance;
    }
}
