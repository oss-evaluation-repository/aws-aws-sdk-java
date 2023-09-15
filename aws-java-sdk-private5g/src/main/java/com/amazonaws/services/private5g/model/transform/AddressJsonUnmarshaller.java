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
package com.amazonaws.services.private5g.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.private5g.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Address JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddressJsonUnmarshaller implements Unmarshaller<Address, JsonUnmarshallerContext> {

    public Address unmarshall(JsonUnmarshallerContext context) throws Exception {
        Address address = new Address();

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
                if (context.testExpression("city", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setCity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("company", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setCompany(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("country", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setCountry(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("emailAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setEmailAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("phoneNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setPhoneNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("postalCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setPostalCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateOrProvince", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setStateOrProvince(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("street1", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setStreet1(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("street2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setStreet2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("street3", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    address.setStreet3(context.getUnmarshaller(String.class).unmarshall(context));
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

        return address;
    }

    private static AddressJsonUnmarshaller instance;

    public static AddressJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AddressJsonUnmarshaller();
        return instance;
    }
}
