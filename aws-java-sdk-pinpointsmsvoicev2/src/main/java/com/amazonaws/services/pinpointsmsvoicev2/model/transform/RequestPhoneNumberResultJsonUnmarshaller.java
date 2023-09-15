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
package com.amazonaws.services.pinpointsmsvoicev2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpointsmsvoicev2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RequestPhoneNumberResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestPhoneNumberResultJsonUnmarshaller implements Unmarshaller<RequestPhoneNumberResult, JsonUnmarshallerContext> {

    public RequestPhoneNumberResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RequestPhoneNumberResult requestPhoneNumberResult = new RequestPhoneNumberResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return requestPhoneNumberResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("PhoneNumberArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setPhoneNumberArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumberId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setPhoneNumberId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsoCountryCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setIsoCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessageType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setMessageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberCapabilities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setNumberCapabilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("NumberType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setNumberType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonthlyLeasingPrice", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setMonthlyLeasingPrice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TwoWayEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setTwoWayEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TwoWayChannelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setTwoWayChannelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelfManagedOptOutsEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setSelfManagedOptOutsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OptOutListName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setOptOutListName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeletionProtectionEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setDeletionProtectionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PoolId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    requestPhoneNumberResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return requestPhoneNumberResult;
    }

    private static RequestPhoneNumberResultJsonUnmarshaller instance;

    public static RequestPhoneNumberResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RequestPhoneNumberResultJsonUnmarshaller();
        return instance;
    }
}
