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
package com.amazonaws.services.directconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Lag JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LagJsonUnmarshaller implements Unmarshaller<Lag, JsonUnmarshallerContext> {

    public Lag unmarshall(JsonUnmarshallerContext context) throws Exception {
        Lag lag = new Lag();

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
                if (context.testExpression("connectionsBandwidth", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setConnectionsBandwidth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfConnections", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setNumberOfConnections(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("lagId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setLagId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownerAccount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lagName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setLagName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lagState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setLagState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minimumLinks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setMinimumLinks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("awsDevice", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setAwsDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsDeviceV2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setAwsDeviceV2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsLogicalDeviceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setAwsLogicalDeviceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connections", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setConnections(new ListUnmarshaller<Connection>(ConnectionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("allowsHostedConnections", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setAllowsHostedConnections(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("jumboFrameCapable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setJumboFrameCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("hasLogicalRedundancy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setHasLogicalRedundancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("providerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setProviderName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macSecCapable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setMacSecCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("encryptionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setEncryptionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macSecKeys", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    lag.setMacSecKeys(new ListUnmarshaller<MacSecKey>(MacSecKeyJsonUnmarshaller.getInstance())

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

        return lag;
    }

    private static LagJsonUnmarshaller instance;

    public static LagJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LagJsonUnmarshaller();
        return instance;
    }
}
