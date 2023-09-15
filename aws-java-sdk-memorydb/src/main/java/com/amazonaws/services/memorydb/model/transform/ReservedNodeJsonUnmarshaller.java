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
package com.amazonaws.services.memorydb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.memorydb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReservedNode JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNodeJsonUnmarshaller implements Unmarshaller<ReservedNode, JsonUnmarshallerContext> {

    public ReservedNode unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReservedNode reservedNode = new ReservedNode();

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
                if (context.testExpression("ReservationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setReservationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReservedNodesOfferingId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setReservedNodesOfferingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setNodeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Duration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FixedPrice", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setFixedPrice(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("NodeCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setNodeCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OfferingType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setOfferingType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecurringCharges", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setRecurringCharges(new ListUnmarshaller<RecurringCharge>(RecurringChargeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reservedNode.setARN(context.getUnmarshaller(String.class).unmarshall(context));
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

        return reservedNode;
    }

    private static ReservedNodeJsonUnmarshaller instance;

    public static ReservedNodeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedNodeJsonUnmarshaller();
        return instance;
    }
}
