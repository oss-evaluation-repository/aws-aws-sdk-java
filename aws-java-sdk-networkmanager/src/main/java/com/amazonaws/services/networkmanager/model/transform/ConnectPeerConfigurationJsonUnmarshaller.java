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
 * ConnectPeerConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectPeerConfigurationJsonUnmarshaller implements Unmarshaller<ConnectPeerConfiguration, JsonUnmarshallerContext> {

    public ConnectPeerConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectPeerConfiguration connectPeerConfiguration = new ConnectPeerConfiguration();

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
                if (context.testExpression("CoreNetworkAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectPeerConfiguration.setCoreNetworkAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PeerAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectPeerConfiguration.setPeerAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InsideCidrBlocks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectPeerConfiguration.setInsideCidrBlocks(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Protocol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectPeerConfiguration.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BgpConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectPeerConfiguration.setBgpConfigurations(new ListUnmarshaller<ConnectPeerBgpConfiguration>(ConnectPeerBgpConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
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

        return connectPeerConfiguration;
    }

    private static ConnectPeerConfigurationJsonUnmarshaller instance;

    public static ConnectPeerConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectPeerConfigurationJsonUnmarshaller();
        return instance;
    }
}
