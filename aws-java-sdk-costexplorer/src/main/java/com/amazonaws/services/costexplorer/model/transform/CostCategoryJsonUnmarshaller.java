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
package com.amazonaws.services.costexplorer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.costexplorer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CostCategory JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategoryJsonUnmarshaller implements Unmarshaller<CostCategory, JsonUnmarshallerContext> {

    public CostCategory unmarshall(JsonUnmarshallerContext context) throws Exception {
        CostCategory costCategory = new CostCategory();

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
                if (context.testExpression("CostCategoryArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costCategory.setCostCategoryArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EffectiveStart", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costCategory.setEffectiveStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EffectiveEnd", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costCategory.setEffectiveEnd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costCategory.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuleVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costCategory.setRuleVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Rules", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costCategory.setRules(new ListUnmarshaller<CostCategoryRule>(CostCategoryRuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SplitChargeRules", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costCategory.setSplitChargeRules(new ListUnmarshaller<CostCategorySplitChargeRule>(CostCategorySplitChargeRuleJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProcessingStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costCategory.setProcessingStatus(new ListUnmarshaller<CostCategoryProcessingStatus>(CostCategoryProcessingStatusJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DefaultValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    costCategory.setDefaultValue(context.getUnmarshaller(String.class).unmarshall(context));
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

        return costCategory;
    }

    private static CostCategoryJsonUnmarshaller instance;

    public static CostCategoryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CostCategoryJsonUnmarshaller();
        return instance;
    }
}
