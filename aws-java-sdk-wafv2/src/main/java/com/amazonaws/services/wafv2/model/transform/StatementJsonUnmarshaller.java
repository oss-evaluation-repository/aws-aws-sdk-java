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
 * Statement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatementJsonUnmarshaller implements Unmarshaller<Statement, JsonUnmarshallerContext> {

    public Statement unmarshall(JsonUnmarshallerContext context) throws Exception {
        Statement statement = new Statement();

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
                if (context.testExpression("ByteMatchStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setByteMatchStatement(ByteMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SqliMatchStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setSqliMatchStatement(SqliMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("XssMatchStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setXssMatchStatement(XssMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SizeConstraintStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setSizeConstraintStatement(SizeConstraintStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GeoMatchStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setGeoMatchStatement(GeoMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RuleGroupReferenceStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setRuleGroupReferenceStatement(RuleGroupReferenceStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IPSetReferenceStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setIPSetReferenceStatement(IPSetReferenceStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RegexPatternSetReferenceStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setRegexPatternSetReferenceStatement(RegexPatternSetReferenceStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RateBasedStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setRateBasedStatement(RateBasedStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AndStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setAndStatement(AndStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("OrStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setOrStatement(OrStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NotStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setNotStatement(NotStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ManagedRuleGroupStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setManagedRuleGroupStatement(ManagedRuleGroupStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LabelMatchStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setLabelMatchStatement(LabelMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RegexMatchStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statement.setRegexMatchStatement(RegexMatchStatementJsonUnmarshaller.getInstance().unmarshall(context));
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

        return statement;
    }

    private static StatementJsonUnmarshaller instance;

    public static StatementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StatementJsonUnmarshaller();
        return instance;
    }
}
