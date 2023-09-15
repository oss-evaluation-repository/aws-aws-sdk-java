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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RouteHasOutOfScopeEndpointViolation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteHasOutOfScopeEndpointViolationJsonUnmarshaller implements Unmarshaller<RouteHasOutOfScopeEndpointViolation, JsonUnmarshallerContext> {

    public RouteHasOutOfScopeEndpointViolation unmarshall(JsonUnmarshallerContext context) throws Exception {
        RouteHasOutOfScopeEndpointViolation routeHasOutOfScopeEndpointViolation = new RouteHasOutOfScopeEndpointViolation();

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
                if (context.testExpression("SubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RouteTableId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setRouteTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ViolatingRoutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setViolatingRoutes(new ListUnmarshaller<Route>(RouteJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SubnetAvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setSubnetAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetAvailabilityZoneId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setSubnetAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentFirewallSubnetRouteTable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setCurrentFirewallSubnetRouteTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallSubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setFirewallSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FirewallSubnetRoutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setFirewallSubnetRoutes(new ListUnmarshaller<Route>(RouteJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InternetGatewayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setInternetGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CurrentInternetGatewayRouteTable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setCurrentInternetGatewayRouteTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InternetGatewayRoutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    routeHasOutOfScopeEndpointViolation.setInternetGatewayRoutes(new ListUnmarshaller<Route>(RouteJsonUnmarshaller.getInstance())

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

        return routeHasOutOfScopeEndpointViolation;
    }

    private static RouteHasOutOfScopeEndpointViolationJsonUnmarshaller instance;

    public static RouteHasOutOfScopeEndpointViolationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouteHasOutOfScopeEndpointViolationJsonUnmarshaller();
        return instance;
    }
}
