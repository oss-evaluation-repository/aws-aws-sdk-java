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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Rule JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleJsonUnmarshaller implements Unmarshaller<Rule, JsonUnmarshallerContext> {

    public Rule unmarshall(JsonUnmarshallerContext context) throws Exception {
        Rule rule = new Rule();

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
                    rule.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rule.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventPattern", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rule.setEventPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rule.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rule.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleExpression", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rule.setScheduleExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rule.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ManagedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rule.setManagedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventBusName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    rule.setEventBusName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return rule;
    }

    private static RuleJsonUnmarshaller instance;

    public static RuleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RuleJsonUnmarshaller();
        return instance;
    }
}
