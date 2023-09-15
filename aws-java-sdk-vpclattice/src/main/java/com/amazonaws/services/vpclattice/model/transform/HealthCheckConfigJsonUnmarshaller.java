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
package com.amazonaws.services.vpclattice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.vpclattice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HealthCheckConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HealthCheckConfigJsonUnmarshaller implements Unmarshaller<HealthCheckConfig, JsonUnmarshallerContext> {

    public HealthCheckConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        HealthCheckConfig healthCheckConfig = new HealthCheckConfig();

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
                if (context.testExpression("enabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("healthCheckIntervalSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setHealthCheckIntervalSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("healthCheckTimeoutSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setHealthCheckTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("healthyThresholdCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setHealthyThresholdCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("matcher", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setMatcher(MatcherJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("protocol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("protocolVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setProtocolVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("unhealthyThresholdCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    healthCheckConfig.setUnhealthyThresholdCount(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return healthCheckConfig;
    }

    private static HealthCheckConfigJsonUnmarshaller instance;

    public static HealthCheckConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HealthCheckConfigJsonUnmarshaller();
        return instance;
    }
}
