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
package com.amazonaws.services.iotwireless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotwireless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WirelessDeviceStatistics JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WirelessDeviceStatisticsJsonUnmarshaller implements Unmarshaller<WirelessDeviceStatistics, JsonUnmarshallerContext> {

    public WirelessDeviceStatistics unmarshall(JsonUnmarshallerContext context) throws Exception {
        WirelessDeviceStatistics wirelessDeviceStatistics = new WirelessDeviceStatistics();

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
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setDestinationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUplinkReceivedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setLastUplinkReceivedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LoRaWAN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setLoRaWAN(LoRaWANListDeviceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Sidewalk", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setSidewalk(SidewalkListDeviceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FuotaDeviceStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setFuotaDeviceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MulticastDeviceStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setMulticastDeviceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("McGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceStatistics.setMcGroupId(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return wirelessDeviceStatistics;
    }

    private static WirelessDeviceStatisticsJsonUnmarshaller instance;

    public static WirelessDeviceStatisticsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WirelessDeviceStatisticsJsonUnmarshaller();
        return instance;
    }
}
