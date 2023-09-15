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
package com.amazonaws.services.budgets.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.budgets.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CostTypes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostTypesJsonUnmarshaller implements Unmarshaller<CostTypes, JsonUnmarshallerContext> {

    public CostTypes unmarshall(JsonUnmarshallerContext context) throws Exception {
        CostTypes costTypes = new CostTypes();

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
                if (context.testExpression("IncludeTax", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setIncludeTax(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeSubscription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setIncludeSubscription(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseBlended", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setUseBlended(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeRefund", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setIncludeRefund(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeCredit", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setIncludeCredit(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeUpfront", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setIncludeUpfront(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeRecurring", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setIncludeRecurring(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeOtherSubscription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setIncludeOtherSubscription(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeSupport", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setIncludeSupport(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IncludeDiscount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setIncludeDiscount(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseAmortized", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costTypes.setUseAmortized(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return costTypes;
    }

    private static CostTypesJsonUnmarshaller instance;

    public static CostTypesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CostTypesJsonUnmarshaller();
        return instance;
    }
}
