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
package com.amazonaws.services.identitystore.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.identitystore.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeUserResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUserResultJsonUnmarshaller implements Unmarshaller<DescribeUserResult, JsonUnmarshallerContext> {

    public DescribeUserResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeUserResult describeUserResult = new DescribeUserResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeUserResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UserName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setUserName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setUserId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setExternalIds(new ListUnmarshaller<ExternalId>(ExternalIdJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setName(NameJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NickName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setNickName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProfileUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setProfileUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Emails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setEmails(new ListUnmarshaller<Email>(EmailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Addresses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setAddresses(new ListUnmarshaller<Address>(AddressJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PhoneNumbers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setPhoneNumbers(new ListUnmarshaller<PhoneNumber>(PhoneNumberJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setUserType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredLanguage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setPreferredLanguage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Locale", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setLocale(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timezone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityStoreId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeUserResult.setIdentityStoreId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeUserResult;
    }

    private static DescribeUserResultJsonUnmarshaller instance;

    public static DescribeUserResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeUserResultJsonUnmarshaller();
        return instance;
    }
}
