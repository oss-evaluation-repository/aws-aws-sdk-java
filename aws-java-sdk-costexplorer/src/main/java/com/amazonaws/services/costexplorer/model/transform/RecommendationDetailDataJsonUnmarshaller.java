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
 * RecommendationDetailData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommendationDetailDataJsonUnmarshaller implements Unmarshaller<RecommendationDetailData, JsonUnmarshallerContext> {

    public RecommendationDetailData unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecommendationDetailData recommendationDetailData = new RecommendationDetailData();

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
                if (context.testExpression("AccountScope", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setAccountScope(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LookbackPeriodInDays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setLookbackPeriodInDays(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SavingsPlansType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setSavingsPlansType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TermInYears", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setTermInYears(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PaymentOption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setPaymentOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrencyCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setCurrencyCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceFamily", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setInstanceFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OfferingId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setOfferingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GenerationTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setGenerationTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LatestUsageTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setLatestUsageTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentAverageHourlyOnDemandSpend", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setCurrentAverageHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentMaximumHourlyOnDemandSpend", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setCurrentMaximumHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentMinimumHourlyOnDemandSpend", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setCurrentMinimumHourlyOnDemandSpend(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedAverageUtilization", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setEstimatedAverageUtilization(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedMonthlySavingsAmount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setEstimatedMonthlySavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCost", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setEstimatedOnDemandCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedOnDemandCostWithCurrentCommitment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setEstimatedOnDemandCostWithCurrentCommitment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedROI", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setEstimatedROI(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSPCost", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setEstimatedSPCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSavingsAmount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setEstimatedSavingsAmount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedSavingsPercentage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setEstimatedSavingsPercentage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExistingHourlyCommitment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setExistingHourlyCommitment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HourlyCommitmentToPurchase", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setHourlyCommitmentToPurchase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpfrontCost", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setUpfrontCost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentAverageCoverage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setCurrentAverageCoverage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedAverageCoverage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setEstimatedAverageCoverage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricsOverLookbackPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommendationDetailData.setMetricsOverLookbackPeriod(new ListUnmarshaller<RecommendationDetailHourlyMetrics>(
                            RecommendationDetailHourlyMetricsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return recommendationDetailData;
    }

    private static RecommendationDetailDataJsonUnmarshaller instance;

    public static RecommendationDetailDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommendationDetailDataJsonUnmarshaller();
        return instance;
    }
}
