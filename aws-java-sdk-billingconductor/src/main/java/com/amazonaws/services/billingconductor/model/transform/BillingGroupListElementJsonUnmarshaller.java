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
 * BillingGroupListElement JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BillingGroupListElementJsonUnmarshaller implements Unmarshaller<BillingGroupListElement, JsonUnmarshallerContext> {

    public BillingGroupListElement unmarshall(JsonUnmarshallerContext context) throws Exception {
        BillingGroupListElement billingGroupListElement = new BillingGroupListElement();

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
                    billingGroupListElement.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrimaryAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setPrimaryAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputationPreference", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setComputationPreference(ComputationPreferenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Size", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setCreationTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setLastModifiedTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountGrouping", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    billingGroupListElement.setAccountGrouping(ListBillingGroupAccountGroupingJsonUnmarshaller.getInstance().unmarshall(context));
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

        return billingGroupListElement;
    }

    private static BillingGroupListElementJsonUnmarshaller instance;

    public static BillingGroupListElementJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BillingGroupListElementJsonUnmarshaller();
        return instance;
    }
}
