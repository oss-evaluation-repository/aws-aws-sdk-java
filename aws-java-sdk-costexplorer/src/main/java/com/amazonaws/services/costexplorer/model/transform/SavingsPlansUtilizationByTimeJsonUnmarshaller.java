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
 * SavingsPlansUtilizationByTime JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansUtilizationByTimeJsonUnmarshaller implements Unmarshaller<SavingsPlansUtilizationByTime, JsonUnmarshallerContext> {

    public SavingsPlansUtilizationByTime unmarshall(JsonUnmarshallerContext context) throws Exception {
        SavingsPlansUtilizationByTime savingsPlansUtilizationByTime = new SavingsPlansUtilizationByTime();

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
                if (context.testExpression("TimePeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansUtilizationByTime.setTimePeriod(DateIntervalJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Utilization", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansUtilizationByTime.setUtilization(SavingsPlansUtilizationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Savings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansUtilizationByTime.setSavings(SavingsPlansSavingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AmortizedCommitment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansUtilizationByTime.setAmortizedCommitment(SavingsPlansAmortizedCommitmentJsonUnmarshaller.getInstance().unmarshall(context));
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

        return savingsPlansUtilizationByTime;
    }

    private static SavingsPlansUtilizationByTimeJsonUnmarshaller instance;

    public static SavingsPlansUtilizationByTimeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansUtilizationByTimeJsonUnmarshaller();
        return instance;
    }
}
