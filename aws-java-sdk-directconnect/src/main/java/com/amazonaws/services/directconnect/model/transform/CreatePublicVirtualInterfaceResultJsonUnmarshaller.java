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
package com.amazonaws.services.directconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreatePublicVirtualInterfaceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePublicVirtualInterfaceResultJsonUnmarshaller implements Unmarshaller<CreatePublicVirtualInterfaceResult, JsonUnmarshallerContext> {

    public CreatePublicVirtualInterfaceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePublicVirtualInterfaceResult createPublicVirtualInterfaceResult = new CreatePublicVirtualInterfaceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createPublicVirtualInterfaceResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ownerAccount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualInterfaceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualInterfaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vlan", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVlan(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("asn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAsn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("amazonSideAsn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAmazonSideAsn(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("authKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAuthKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("amazonAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAmazonAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customerAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setCustomerAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("addressFamily", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAddressFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualInterfaceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customerRouterConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setCustomerRouterConfig(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mtu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setMtu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("jumboFrameCapable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setJumboFrameCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("virtualGatewayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setVirtualGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("directConnectGatewayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setDirectConnectGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeFilterPrefixes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(RouteFilterPrefixJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("bgpPeers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setBgpPeers(new ListUnmarshaller<BGPPeer>(BGPPeerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsDeviceV2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAwsDeviceV2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsLogicalDeviceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setAwsLogicalDeviceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("siteLinkEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPublicVirtualInterfaceResult.setSiteLinkEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return createPublicVirtualInterfaceResult;
    }

    private static CreatePublicVirtualInterfaceResultJsonUnmarshaller instance;

    public static CreatePublicVirtualInterfaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePublicVirtualInterfaceResultJsonUnmarshaller();
        return instance;
    }
}
