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
package com.amazonaws.services.kinesisvideo.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeEdgeConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEdgeConfigurationResultJsonUnmarshaller implements Unmarshaller<DescribeEdgeConfigurationResult, JsonUnmarshallerContext> {

    public DescribeEdgeConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeEdgeConfigurationResult describeEdgeConfigurationResult = new DescribeEdgeConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeEdgeConfigurationResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("StreamName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEdgeConfigurationResult.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEdgeConfigurationResult.setStreamARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEdgeConfigurationResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEdgeConfigurationResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SyncStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEdgeConfigurationResult.setSyncStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailedStatusDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEdgeConfigurationResult.setFailedStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EdgeConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEdgeConfigurationResult.setEdgeConfig(EdgeConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EdgeAgentStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeEdgeConfigurationResult.setEdgeAgentStatus(EdgeAgentStatusJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeEdgeConfigurationResult;
    }

    private static DescribeEdgeConfigurationResultJsonUnmarshaller instance;

    public static DescribeEdgeConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeEdgeConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
