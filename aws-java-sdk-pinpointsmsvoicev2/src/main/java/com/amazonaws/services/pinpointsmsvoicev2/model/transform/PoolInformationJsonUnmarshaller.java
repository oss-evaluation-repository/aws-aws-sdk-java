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
 * PoolInformation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PoolInformationJsonUnmarshaller implements Unmarshaller<PoolInformation, JsonUnmarshallerContext> {

    public PoolInformation unmarshall(JsonUnmarshallerContext context) throws Exception {
        PoolInformation poolInformation = new PoolInformation();

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
                if (context.testExpression("PoolArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setPoolArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PoolId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setPoolId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MessageType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setMessageType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TwoWayEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setTwoWayEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TwoWayChannelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setTwoWayChannelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SelfManagedOptOutsEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setSelfManagedOptOutsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OptOutListName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setOptOutListName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SharedRoutesEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setSharedRoutesEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DeletionProtectionEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setDeletionProtectionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    poolInformation.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return poolInformation;
    }

    private static PoolInformationJsonUnmarshaller instance;

    public static PoolInformationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PoolInformationJsonUnmarshaller();
        return instance;
    }
}
