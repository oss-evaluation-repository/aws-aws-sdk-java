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
package com.amazonaws.services.ssmcontacts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssmcontacts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetContactChannelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactChannelResultJsonUnmarshaller implements Unmarshaller<GetContactChannelResult, JsonUnmarshallerContext> {

    public GetContactChannelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetContactChannelResult getContactChannelResult = new GetContactChannelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getContactChannelResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ContactArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getContactChannelResult.setContactArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContactChannelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getContactChannelResult.setContactChannelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getContactChannelResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getContactChannelResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeliveryAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getContactChannelResult.setDeliveryAddress(ContactChannelAddressJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ActivationStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getContactChannelResult.setActivationStatus(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getContactChannelResult;
    }

    private static GetContactChannelResultJsonUnmarshaller instance;

    public static GetContactChannelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetContactChannelResultJsonUnmarshaller();
        return instance;
    }
}
