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
 * Device JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeviceJsonUnmarshaller implements Unmarshaller<Device, JsonUnmarshallerContext> {

    public Device unmarshall(JsonUnmarshallerContext context) throws Exception {
        Device device = new Device();

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
                    device.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manufacturer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setManufacturer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setModelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("formFactor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setFormFactor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("os", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setOs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cpu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setCpu(CPUJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resolution", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setResolution(ResolutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("heapSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setHeapSize(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("memory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setMemory(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("carrier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setCarrier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("radio", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setRadio(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remoteAccessEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setRemoteAccessEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("remoteDebugEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setRemoteDebugEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("fleetType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setFleetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fleetName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setFleetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instances", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setInstances(new ListUnmarshaller<DeviceInstance>(DeviceInstanceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("availability", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    device.setAvailability(context.getUnmarshaller(String.class).unmarshall(context));
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

        return device;
    }

    private static DeviceJsonUnmarshaller instance;

    public static DeviceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DeviceJsonUnmarshaller();
        return instance;
    }
}
