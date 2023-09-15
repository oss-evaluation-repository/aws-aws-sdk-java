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
package com.amazonaws.services.customerprofiles.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.customerprofiles.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * FieldSourceProfileIds JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FieldSourceProfileIdsJsonUnmarshaller implements Unmarshaller<FieldSourceProfileIds, JsonUnmarshallerContext> {

    public FieldSourceProfileIds unmarshall(JsonUnmarshallerContext context) throws Exception {
        FieldSourceProfileIds fieldSourceProfileIds = new FieldSourceProfileIds();

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
                if (context.testExpression("AccountNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setAccountNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setAdditionalInformation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PartyType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setPartyType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BusinessName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setBusinessName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirstName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setFirstName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MiddleName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setMiddleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setLastName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BirthDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setBirthDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Gender", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setGender(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MobilePhoneNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setMobilePhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HomePhoneNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setHomePhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BusinessPhoneNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setBusinessPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmailAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PersonalEmailAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setPersonalEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BusinessEmailAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setBusinessEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Address", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ShippingAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setShippingAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MailingAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setMailingAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BillingAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setBillingAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fieldSourceProfileIds.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

        return fieldSourceProfileIds;
    }

    private static FieldSourceProfileIdsJsonUnmarshaller instance;

    public static FieldSourceProfileIdsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FieldSourceProfileIdsJsonUnmarshaller();
        return instance;
    }
}
