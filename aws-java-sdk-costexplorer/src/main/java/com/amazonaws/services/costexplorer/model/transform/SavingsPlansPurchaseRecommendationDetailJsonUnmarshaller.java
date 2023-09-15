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
 * SavingsPlansPurchaseRecommendationDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller implements
        Unmarshaller<SavingsPlansPurchaseRecommendationDetail, JsonUnmarshallerContext> {

    public SavingsPlansPurchaseRecommendationDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        SavingsPlansPurchaseRecommendationDetail savingsPlansPurchaseRecommendationDetail = new SavingsPlansPurchaseRecommendationDetail();

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
                if (context.testExpression("SavingsPlansDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setSavingsPlansDetails(SavingsPlansDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpfrontCost", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setUpfrontCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedROI", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedROI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSPCost", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedSPCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCost", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedOnDemandCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCostWithCurrentCommitment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedOnDemandCostWithCurrentCommitment(context.getUnmarshaller(String.class).unmarshall(
                            context));
                }
                if (context.testExpression("EstimatedSavingsAmount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedSavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSavingsPercentage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedSavingsPercentage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HourlyCommitmentToPurchase", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setHourlyCommitmentToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedAverageUtilization", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedAverageUtilization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedMonthlySavingsAmount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setEstimatedMonthlySavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentMinimumHourlyOnDemandSpend", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setCurrentMinimumHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentMaximumHourlyOnDemandSpend", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setCurrentMaximumHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentAverageHourlyOnDemandSpend", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setCurrentAverageHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommendationDetailId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    savingsPlansPurchaseRecommendationDetail.setRecommendationDetailId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return savingsPlansPurchaseRecommendationDetail;
    }

    private static SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller instance;

    public static SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SavingsPlansPurchaseRecommendationDetailJsonUnmarshaller();
        return instance;
    }
}
