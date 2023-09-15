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
package com.amazonaws.services.eventbridge.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.eventbridge.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointResultJsonUnmarshaller implements Unmarshaller<DescribeEndpointResult, JsonUnmarshallerContext> {

    public DescribeEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeEndpointResult describeEndpointResult = new DescribeEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeEndpointResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoutingConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setRoutingConfig(RoutingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReplicationConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setReplicationConfig(ReplicationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EventBuses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setEventBuses(new ListUnmarshaller<EndpointEventBus>(EndpointEventBusJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setEndpointId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setEndpointUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEndpointResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return describeEndpointResult;
    }

    private static DescribeEndpointResultJsonUnmarshaller instance;

    public static DescribeEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEndpointResultJsonUnmarshaller();
        return instance;
    }
}
