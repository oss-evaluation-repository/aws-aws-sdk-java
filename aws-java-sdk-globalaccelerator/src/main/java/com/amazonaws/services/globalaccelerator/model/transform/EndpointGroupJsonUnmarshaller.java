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
package com.amazonaws.services.globalaccelerator.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.globalaccelerator.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EndpointGroup JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointGroupJsonUnmarshaller implements Unmarshaller<EndpointGroup, JsonUnmarshallerContext> {

    public EndpointGroup unmarshall(JsonUnmarshallerContext context) throws Exception {
        EndpointGroup endpointGroup = new EndpointGroup();

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
                if (context.testExpression("EndpointGroupArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setEndpointGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointGroupRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setEndpointGroupRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointDescriptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setEndpointDescriptions(new ListUnmarshaller<EndpointDescription>(EndpointDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TrafficDialPercentage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setTrafficDialPercentage(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("HealthCheckPort", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setHealthCheckPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("HealthCheckProtocol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setHealthCheckProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthCheckPath", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setHealthCheckPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthCheckIntervalSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setHealthCheckIntervalSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ThresholdCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setThresholdCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PortOverrides", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointGroup.setPortOverrides(new ListUnmarshaller<PortOverride>(PortOverrideJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return endpointGroup;
    }

    private static EndpointGroupJsonUnmarshaller instance;

    public static EndpointGroupJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointGroupJsonUnmarshaller();
        return instance;
    }
}
