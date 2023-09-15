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
package com.amazonaws.services.devicefarm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devicefarm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RemoteAccessSession JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoteAccessSessionJsonUnmarshaller implements Unmarshaller<RemoteAccessSession, JsonUnmarshallerContext> {

    public RemoteAccessSession unmarshall(JsonUnmarshallerContext context) throws Exception {
        RemoteAccessSession remoteAccessSession = new RemoteAccessSession();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setCreated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("result", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("started", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setStarted(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("stopped", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setStopped(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("device", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setDevice(DeviceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("instanceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remoteDebugEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setRemoteDebugEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("remoteRecordEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setRemoteRecordEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("remoteRecordAppArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setRemoteRecordAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hostAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setHostAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("billingMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setBillingMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setDeviceMinutes(DeviceMinutesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("endpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceUdid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setDeviceUdid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("interactionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setInteractionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("skipAppResign", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setSkipAppResign(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    remoteAccessSession.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return remoteAccessSession;
    }

    private static RemoteAccessSessionJsonUnmarshaller instance;

    public static RemoteAccessSessionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RemoteAccessSessionJsonUnmarshaller();
        return instance;
    }
}
