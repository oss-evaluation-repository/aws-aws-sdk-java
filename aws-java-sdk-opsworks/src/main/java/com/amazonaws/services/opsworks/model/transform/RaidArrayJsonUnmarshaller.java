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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RaidArray JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RaidArrayJsonUnmarshaller implements Unmarshaller<RaidArray, JsonUnmarshallerContext> {

    public RaidArray unmarshall(JsonUnmarshallerContext context) throws Exception {
        RaidArray raidArray = new RaidArray();

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
                if (context.testExpression("RaidArrayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setRaidArrayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RaidLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setRaidLevel(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfDisks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setNumberOfDisks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Size", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Device", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MountPoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setMountPoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setStackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setVolumeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Iops", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    raidArray.setIops(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return raidArray;
    }

    private static RaidArrayJsonUnmarshaller instance;

    public static RaidArrayJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RaidArrayJsonUnmarshaller();
        return instance;
    }
}
