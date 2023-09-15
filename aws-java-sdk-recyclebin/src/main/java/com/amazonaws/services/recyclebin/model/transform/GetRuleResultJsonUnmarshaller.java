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
package com.amazonaws.services.recyclebin.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.recyclebin.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRuleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRuleResultJsonUnmarshaller implements Unmarshaller<GetRuleResult, JsonUnmarshallerContext> {

    public GetRuleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRuleResult getRuleResult = new GetRuleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRuleResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Identifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRuleResult.setIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRuleResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRuleResult.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetentionPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRuleResult.setRetentionPeriod(RetentionPeriodJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRuleResult.setResourceTags(new ListUnmarshaller<ResourceTag>(ResourceTagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRuleResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LockConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRuleResult.setLockConfiguration(LockConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LockState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRuleResult.setLockState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LockEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRuleResult.setLockEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return getRuleResult;
    }

    private static GetRuleResultJsonUnmarshaller instance;

    public static GetRuleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRuleResultJsonUnmarshaller();
        return instance;
    }
}
