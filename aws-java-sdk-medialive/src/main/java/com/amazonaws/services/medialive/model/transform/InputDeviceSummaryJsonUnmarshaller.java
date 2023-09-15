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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InputDeviceSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceSummaryJsonUnmarshaller implements Unmarshaller<InputDeviceSummary, JsonUnmarshallerContext> {

    public InputDeviceSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        InputDeviceSummary inputDeviceSummary = new InputDeviceSummary();

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
                    inputDeviceSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setConnectionState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceSettingsSyncState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setDeviceSettingsSyncState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceUpdateStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setDeviceUpdateStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hdDeviceSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setHdDeviceSettings(InputDeviceHdSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setMacAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setNetworkSettings(InputDeviceNetworkSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serialNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uhdDeviceSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setUhdDeviceSettings(InputDeviceUhdSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary
                            .setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("availabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("medialiveInputArns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setMedialiveInputArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("outputType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inputDeviceSummary.setOutputType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return inputDeviceSummary;
    }

    private static InputDeviceSummaryJsonUnmarshaller instance;

    public static InputDeviceSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InputDeviceSummaryJsonUnmarshaller();
        return instance;
    }
}
