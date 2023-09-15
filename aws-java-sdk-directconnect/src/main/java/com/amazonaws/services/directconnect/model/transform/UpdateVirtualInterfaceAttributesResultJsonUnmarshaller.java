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
 * UpdateVirtualInterfaceAttributesResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVirtualInterfaceAttributesResultJsonUnmarshaller implements Unmarshaller<UpdateVirtualInterfaceAttributesResult, JsonUnmarshallerContext> {

    public UpdateVirtualInterfaceAttributesResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateVirtualInterfaceAttributesResult updateVirtualInterfaceAttributesResult = new UpdateVirtualInterfaceAttributesResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateVirtualInterfaceAttributesResult;
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
                    updateVirtualInterfaceAttributesResult.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setVirtualInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setVirtualInterfaceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setVirtualInterfaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vlan", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setVlan(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("asn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setAsn(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("amazonSideAsn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setAmazonSideAsn(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("authKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setAuthKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("amazonAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setAmazonAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customerAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setCustomerAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("addressFamily", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setAddressFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualInterfaceState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setVirtualInterfaceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("customerRouterConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setCustomerRouterConfig(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mtu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setMtu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("jumboFrameCapable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setJumboFrameCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("virtualGatewayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setVirtualGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("directConnectGatewayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setDirectConnectGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeFilterPrefixes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setRouteFilterPrefixes(new ListUnmarshaller<RouteFilterPrefix>(RouteFilterPrefixJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("bgpPeers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setBgpPeers(new ListUnmarshaller<BGPPeer>(BGPPeerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsDeviceV2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setAwsDeviceV2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsLogicalDeviceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setAwsLogicalDeviceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("siteLinkEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateVirtualInterfaceAttributesResult.setSiteLinkEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return updateVirtualInterfaceAttributesResult;
    }

    private static UpdateVirtualInterfaceAttributesResultJsonUnmarshaller instance;

    public static UpdateVirtualInterfaceAttributesResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateVirtualInterfaceAttributesResultJsonUnmarshaller();
        return instance;
    }
}
