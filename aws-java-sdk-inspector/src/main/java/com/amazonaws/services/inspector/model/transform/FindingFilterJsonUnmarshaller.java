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
package com.amazonaws.services.inspector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FindingFilter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingFilterJsonUnmarshaller implements Unmarshaller<FindingFilter, JsonUnmarshallerContext> {

    public FindingFilter unmarshall(JsonUnmarshallerContext context) throws Exception {
        FindingFilter findingFilter = new FindingFilter();

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
                if (context.testExpression("agentIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    findingFilter.setAgentIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("autoScalingGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    findingFilter.setAutoScalingGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ruleNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    findingFilter.setRuleNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("severities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    findingFilter.setSeverities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("rulesPackageArns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    findingFilter.setRulesPackageArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("attributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    findingFilter.setAttributes(new ListUnmarshaller<Attribute>(AttributeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("userAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    findingFilter.setUserAttributes(new ListUnmarshaller<Attribute>(AttributeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationTimeRange", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    findingFilter.setCreationTimeRange(TimestampRangeJsonUnmarshaller.getInstance().unmarshall(context));
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

        return findingFilter;
    }

    private static FindingFilterJsonUnmarshaller instance;

    public static FindingFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FindingFilterJsonUnmarshaller();
        return instance;
    }
}
