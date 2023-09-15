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
 * DescribeGroupResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGroupResultJsonUnmarshaller implements Unmarshaller<DescribeGroupResult, JsonUnmarshallerContext> {

    public DescribeGroupResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeGroupResult describeGroupResult = new DescribeGroupResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeGroupResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("GroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGroupResult.setGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGroupResult.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExternalIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGroupResult.setExternalIds(new ListUnmarshaller<ExternalId>(ExternalIdJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGroupResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentityStoreId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGroupResult.setIdentityStoreId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeGroupResult;
    }

    private static DescribeGroupResultJsonUnmarshaller instance;

    public static DescribeGroupResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGroupResultJsonUnmarshaller();
        return instance;
    }
}
