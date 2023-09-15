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
package com.amazonaws.services.iotsecuretunneling.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsecuretunneling.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Tunnel JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TunnelJsonUnmarshaller implements Unmarshaller<Tunnel, JsonUnmarshallerContext> {

    public Tunnel unmarshall(JsonUnmarshallerContext context) throws Exception {
        Tunnel tunnel = new Tunnel();

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
                if (context.testExpression("tunnelId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setTunnelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tunnelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setTunnelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceConnectionState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setSourceConnectionState(ConnectionStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("destinationConnectionState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setDestinationConnectionState(ConnectionStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setDestinationConfig(DestinationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timeoutConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setTimeoutConfig(TimeoutConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tunnel.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return tunnel;
    }

    private static TunnelJsonUnmarshaller instance;

    public static TunnelJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TunnelJsonUnmarshaller();
        return instance;
    }
}
