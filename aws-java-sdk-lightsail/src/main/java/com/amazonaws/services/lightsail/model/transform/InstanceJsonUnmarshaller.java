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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Instance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceJsonUnmarshaller implements Unmarshaller<Instance, JsonUnmarshallerContext> {

    public Instance unmarshall(JsonUnmarshallerContext context) throws Exception {
        Instance instance = new Instance();

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
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("blueprintId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("blueprintName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setBlueprintName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bundleId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("addOns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setAddOns(new ListUnmarshaller<AddOn>(AddOnJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("isStaticIp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setIsStaticIp(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("privateIpAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPrivateIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publicIpAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPublicIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipv6Addresses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setIpv6Addresses(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ipAddressType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setIpAddressType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hardware", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setHardware(InstanceHardwareJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("networking", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setNetworking(InstanceNetworkingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setState(InstanceStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("username", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sshKeyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setSshKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadataOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setMetadataOptions(InstanceMetadataOptionsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return instance;
    }

    private static InstanceJsonUnmarshaller instance;

    public static InstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonUnmarshaller();
        return instance;
    }
}
