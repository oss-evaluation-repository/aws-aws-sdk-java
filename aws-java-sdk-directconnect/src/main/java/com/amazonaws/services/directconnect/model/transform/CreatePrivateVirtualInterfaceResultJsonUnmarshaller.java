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
 * CreatePrivateVirtualInterfaceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePrivateVirtualInterfaceResultJsonUnmarshaller implements Unmarshaller<CreatePrivateVirtualInterfaceResult, JsonUnmarshallerContext> {

    public CreatePrivateVirtualInterfaceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreatePrivateVirtualInterfaceResult createPrivateVirtualInterfaceResult = new CreatePrivateVirtualInterfaceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createPrivateVirtualInterfaceResult;
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
                    createPrivateVirtualInterfaceResult.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualInterfaceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualInterfaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vlan", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVlan(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("asn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAsn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("amazonSideAsn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAmazonSideAsn(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("authKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAuthKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("amazonAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAmazonAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customerAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setCustomerAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("addressFamily", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAddressFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualInterfaceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customerRouterConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setCustomerRouterConfig(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mtu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setMtu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("jumboFrameCapable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setJumboFrameCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("virtualGatewayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setVirtualGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("directConnectGatewayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setDirectConnectGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeFilterPrefixes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(RouteFilterPrefixJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("bgpPeers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setBgpPeers(new ListUnmarshaller<BGPPeer>(BGPPeerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsDeviceV2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAwsDeviceV2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsLogicalDeviceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setAwsLogicalDeviceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("siteLinkEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createPrivateVirtualInterfaceResult.setSiteLinkEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return createPrivateVirtualInterfaceResult;
    }

    private static CreatePrivateVirtualInterfaceResultJsonUnmarshaller instance;

    public static CreatePrivateVirtualInterfaceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreatePrivateVirtualInterfaceResultJsonUnmarshaller();
        return instance;
    }
}
