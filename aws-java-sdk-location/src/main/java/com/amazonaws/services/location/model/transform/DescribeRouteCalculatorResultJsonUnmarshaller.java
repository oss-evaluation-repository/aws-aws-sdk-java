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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeRouteCalculatorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRouteCalculatorResultJsonUnmarshaller implements Unmarshaller<DescribeRouteCalculatorResult, JsonUnmarshallerContext> {

    public DescribeRouteCalculatorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeRouteCalculatorResult describeRouteCalculatorResult = new DescribeRouteCalculatorResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeRouteCalculatorResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CalculatorArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRouteCalculatorResult.setCalculatorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CalculatorName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRouteCalculatorResult.setCalculatorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRouteCalculatorResult.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRouteCalculatorResult.setDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRouteCalculatorResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PricingPlan", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRouteCalculatorResult.setPricingPlan(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRouteCalculatorResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("UpdateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeRouteCalculatorResult.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
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

        return describeRouteCalculatorResult;
    }

    private static DescribeRouteCalculatorResultJsonUnmarshaller instance;

    public static DescribeRouteCalculatorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeRouteCalculatorResultJsonUnmarshaller();
        return instance;
    }
}
