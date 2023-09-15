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
package com.amazonaws.services.mediaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GatewayInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayInstanceJsonUnmarshaller implements Unmarshaller<GatewayInstance, JsonUnmarshallerContext> {

    public GatewayInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        GatewayInstance gatewayInstance = new GatewayInstance();

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
                if (context.testExpression("bridgePlacement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gatewayInstance.setBridgePlacement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gatewayInstance.setConnectionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gatewayArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gatewayInstance.setGatewayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gatewayInstanceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gatewayInstance.setGatewayInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gatewayInstance.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceMessages", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gatewayInstance.setInstanceMessages(new ListUnmarshaller<MessageDetail>(MessageDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("instanceState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gatewayInstance.setInstanceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runningBridgeCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gatewayInstance.setRunningBridgeCount(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return gatewayInstance;
    }

    private static GatewayInstanceJsonUnmarshaller instance;

    public static GatewayInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GatewayInstanceJsonUnmarshaller();
        return instance;
    }
}
