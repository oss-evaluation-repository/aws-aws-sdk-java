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
package com.amazonaws.services.billingconductor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.billingconductor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PricingRuleListElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PricingRuleListElementJsonUnmarshaller implements Unmarshaller<PricingRuleListElement, JsonUnmarshallerContext> {

    public PricingRuleListElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        PricingRuleListElement pricingRuleListElement = new PricingRuleListElement();

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
                    pricingRuleListElement.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Scope", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModifierPercentage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setModifierPercentage(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("Service", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setService(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociatedPricingPlanCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setAssociatedPricingPlanCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setCreationTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setLastModifiedTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("BillingEntity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setBillingEntity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tiering", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setTiering(TieringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UsageType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setUsageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Operation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pricingRuleListElement.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
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

        return pricingRuleListElement;
    }

    private static PricingRuleListElementJsonUnmarshaller instance;

    public static PricingRuleListElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PricingRuleListElementJsonUnmarshaller();
        return instance;
    }
}
