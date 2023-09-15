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
package com.amazonaws.services.networkmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NetworkTelemetry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkTelemetryJsonUnmarshaller implements Unmarshaller<NetworkTelemetry, JsonUnmarshallerContext> {

    public NetworkTelemetry unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetworkTelemetry networkTelemetry = new NetworkTelemetry();

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
                if (context.testExpression("RegisteredGatewayArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkTelemetry.setRegisteredGatewayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CoreNetworkId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkTelemetry.setCoreNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AwsRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkTelemetry.setAwsRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkTelemetry.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkTelemetry.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkTelemetry.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkTelemetry.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Address", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkTelemetry.setAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Health", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkTelemetry.setHealth(ConnectionHealthJsonUnmarshaller.getInstance().unmarshall(context));
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

        return networkTelemetry;
    }

    private static NetworkTelemetryJsonUnmarshaller instance;

    public static NetworkTelemetryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkTelemetryJsonUnmarshaller();
        return instance;
    }
}
