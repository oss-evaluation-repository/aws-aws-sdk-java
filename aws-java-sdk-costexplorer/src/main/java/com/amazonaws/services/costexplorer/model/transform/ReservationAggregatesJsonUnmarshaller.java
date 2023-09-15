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
 * ReservationAggregates JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationAggregatesJsonUnmarshaller implements Unmarshaller<ReservationAggregates, JsonUnmarshallerContext> {

    public ReservationAggregates unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservationAggregates reservationAggregates = new ReservationAggregates();

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
                if (context.testExpression("UtilizationPercentage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setUtilizationPercentage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UtilizationPercentageInUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setUtilizationPercentageInUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PurchasedHours", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setPurchasedHours(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PurchasedUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setPurchasedUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalActualHours", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setTotalActualHours(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalActualUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setTotalActualUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UnusedHours", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setUnusedHours(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UnusedUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setUnusedUnits(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OnDemandCostOfRIHoursUsed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setOnDemandCostOfRIHoursUsed(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetRISavings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setNetRISavings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalPotentialRISavings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setTotalPotentialRISavings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AmortizedUpfrontFee", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setAmortizedUpfrontFee(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AmortizedRecurringFee", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setAmortizedRecurringFee(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TotalAmortizedFee", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setTotalAmortizedFee(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RICostForUnusedHours", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setRICostForUnusedHours(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RealizedSavings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setRealizedSavings(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UnrealizedSavings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationAggregates.setUnrealizedSavings(context.getUnmarshaller(String.class).unmarshall(context));
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

        return reservationAggregates;
    }

    private static ReservationAggregatesJsonUnmarshaller instance;

    public static ReservationAggregatesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationAggregatesJsonUnmarshaller();
        return instance;
    }
}
