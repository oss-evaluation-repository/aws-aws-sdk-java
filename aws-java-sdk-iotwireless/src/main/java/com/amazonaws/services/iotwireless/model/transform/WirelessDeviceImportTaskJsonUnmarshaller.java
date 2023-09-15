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
 * WirelessDeviceImportTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WirelessDeviceImportTaskJsonUnmarshaller implements Unmarshaller<WirelessDeviceImportTask, JsonUnmarshallerContext> {

    public WirelessDeviceImportTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        WirelessDeviceImportTask wirelessDeviceImportTask = new WirelessDeviceImportTask();

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
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setDestinationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sidewalk", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setSidewalk(SidewalkGetStartImportInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitializedImportedDeviceCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setInitializedImportedDeviceCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("PendingImportedDeviceCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setPendingImportedDeviceCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("OnboardedImportedDeviceCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setOnboardedImportedDeviceCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FailedImportedDeviceCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    wirelessDeviceImportTask.setFailedImportedDeviceCount(context.getUnmarshaller(Long.class).unmarshall(context));
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

        return wirelessDeviceImportTask;
    }

    private static WirelessDeviceImportTaskJsonUnmarshaller instance;

    public static WirelessDeviceImportTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WirelessDeviceImportTaskJsonUnmarshaller();
        return instance;
    }
}
