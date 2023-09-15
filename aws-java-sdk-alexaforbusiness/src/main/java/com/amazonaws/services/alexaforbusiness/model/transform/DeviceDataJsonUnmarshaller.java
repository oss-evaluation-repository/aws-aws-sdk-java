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
package com.amazonaws.services.alexaforbusiness.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.alexaforbusiness.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DeviceData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceDataJsonUnmarshaller implements Unmarshaller<DeviceData, JsonUnmarshallerContext> {

    public DeviceData unmarshall(JsonUnmarshallerContext context) throws Exception {
        DeviceData deviceData = new DeviceData();

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
                if (context.testExpression("DeviceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setDeviceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceSerialNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setDeviceSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setDeviceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SoftwareVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setSoftwareVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MacAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setMacAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setDeviceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkProfileArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setNetworkProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkProfileName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setNetworkProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoomArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setRoomArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoomName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setRoomName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceStatusInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setDeviceStatusInfo(DeviceStatusInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    deviceData.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return deviceData;
    }

    private static DeviceDataJsonUnmarshaller instance;

    public static DeviceDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceDataJsonUnmarshaller();
        return instance;
    }
}
