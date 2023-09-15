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
package com.amazonaws.services.account.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.account.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContactInformation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContactInformationJsonUnmarshaller implements Unmarshaller<ContactInformation, JsonUnmarshallerContext> {

    public ContactInformation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContactInformation contactInformation = new ContactInformation();

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
                if (context.testExpression("AddressLine1", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setAddressLine1(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddressLine2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setAddressLine2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddressLine3", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setAddressLine3(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("City", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setCity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompanyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setCompanyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CountryCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setCountryCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DistrictOrCounty", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setDistrictOrCounty(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FullName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setFullName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PhoneNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PostalCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setPostalCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateOrRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setStateOrRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WebsiteUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    contactInformation.setWebsiteUrl(context.getUnmarshaller(String.class).unmarshall(context));
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

        return contactInformation;
    }

    private static ContactInformationJsonUnmarshaller instance;

    public static ContactInformationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContactInformationJsonUnmarshaller();
        return instance;
    }
}
