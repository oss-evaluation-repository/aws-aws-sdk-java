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
package com.amazonaws.services.redshiftserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UsageLimit JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageLimitJsonUnmarshaller implements Unmarshaller<UsageLimit, JsonUnmarshallerContext> {

    public UsageLimit unmarshall(JsonUnmarshallerContext context) throws Exception {
        UsageLimit usageLimit = new UsageLimit();

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
                if (context.testExpression("amount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    usageLimit.setAmount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("breachAction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    usageLimit.setBreachAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("period", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    usageLimit.setPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    usageLimit.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usageLimitArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    usageLimit.setUsageLimitArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usageLimitId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    usageLimit.setUsageLimitId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("usageType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    usageLimit.setUsageType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return usageLimit;
    }

    private static UsageLimitJsonUnmarshaller instance;

    public static UsageLimitJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UsageLimitJsonUnmarshaller();
        return instance;
    }
}
