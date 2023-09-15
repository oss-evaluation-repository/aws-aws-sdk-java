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
 * Transport JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransportJsonUnmarshaller implements Unmarshaller<Transport, JsonUnmarshallerContext> {

    public Transport unmarshall(JsonUnmarshallerContext context) throws Exception {
        Transport transport = new Transport();

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
                if (context.testExpression("cidrAllowList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setCidrAllowList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("maxBitrate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setMaxBitrate(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxLatency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setMaxLatency(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maxSyncBuffer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setMaxSyncBuffer(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("minLatency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setMinLatency(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("protocol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remoteId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setRemoteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("senderControlPort", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setSenderControlPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("senderIpAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setSenderIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("smoothingLatency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setSmoothingLatency(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("sourceListenerAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setSourceListenerAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceListenerPort", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setSourceListenerPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("streamId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    transport.setStreamId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return transport;
    }

    private static TransportJsonUnmarshaller instance;

    public static TransportJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransportJsonUnmarshaller();
        return instance;
    }
}
