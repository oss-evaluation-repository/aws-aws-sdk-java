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
package com.amazonaws.services.mediaconvert.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconvert.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReservationPlan JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationPlanJsonUnmarshaller implements Unmarshaller<ReservationPlan, JsonUnmarshallerContext> {

    public ReservationPlan unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservationPlan reservationPlan = new ReservationPlan();

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
                if (context.testExpression("commitment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationPlan.setCommitment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expiresAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationPlan.setExpiresAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("purchasedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationPlan.setPurchasedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("renewalType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationPlan.setRenewalType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reservedSlots", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationPlan.setReservedSlots(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservationPlan.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
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

        return reservationPlan;
    }

    private static ReservationPlanJsonUnmarshaller instance;

    public static ReservationPlanJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationPlanJsonUnmarshaller();
        return instance;
    }
}
