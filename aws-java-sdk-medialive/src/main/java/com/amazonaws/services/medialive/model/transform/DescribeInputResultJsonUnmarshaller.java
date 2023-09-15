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
 * DescribeInputResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInputResultJsonUnmarshaller implements Unmarshaller<DescribeInputResult, JsonUnmarshallerContext> {

    public DescribeInputResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeInputResult describeInputResult = new DescribeInputResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeInputResult;
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
                    describeInputResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("attachedChannels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setAttachedChannels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("destinations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setDestinations(new ListUnmarshaller<InputDestination>(InputDestinationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputClass", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setInputClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inputDevices", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setInputDevices(new ListUnmarshaller<InputDeviceSettings>(InputDeviceSettingsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("inputPartnerIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setInputPartnerIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("inputSourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setInputSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mediaConnectFlows", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setMediaConnectFlows(new ListUnmarshaller<MediaConnectFlow>(MediaConnectFlowJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setSources(new ListUnmarshaller<InputSource>(InputSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeInputResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeInputResult;
    }

    private static DescribeInputResultJsonUnmarshaller instance;

    public static DescribeInputResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeInputResultJsonUnmarshaller();
        return instance;
    }
}
