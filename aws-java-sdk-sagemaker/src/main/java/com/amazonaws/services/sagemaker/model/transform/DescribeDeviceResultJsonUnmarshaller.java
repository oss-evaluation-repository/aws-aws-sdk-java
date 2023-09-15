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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDeviceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceResultJsonUnmarshaller implements Unmarshaller<DescribeDeviceResult, JsonUnmarshallerContext> {

    public DescribeDeviceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDeviceResult describeDeviceResult = new DescribeDeviceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDeviceResult;
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
                    describeDeviceResult.setDeviceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeviceFleetName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setDeviceFleetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IotThingName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setIotThingName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setRegistrationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LatestHeartbeat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setLatestHeartbeat(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Models", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setModels(new ListUnmarshaller<EdgeModel>(EdgeModelJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MaxModels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setMaxModels(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NextToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setNextToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AgentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDeviceResult.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeDeviceResult;
    }

    private static DescribeDeviceResultJsonUnmarshaller instance;

    public static DescribeDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDeviceResultJsonUnmarshaller();
        return instance;
    }
}
