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
package com.amazonaws.services.snowdevicemanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.snowdevicemanagement.model.*;
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
                if (context.testExpression("amiLaunchIndex", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setAmiLaunchIndex(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("blockDeviceMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setBlockDeviceMappings(new ListUnmarshaller<InstanceBlockDeviceMapping>(InstanceBlockDeviceMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("cpuOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setCpuOptions(CpuOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("imageId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setImageId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
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
                if (context.testExpression("rootDeviceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setRootDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setSecurityGroups(new ListUnmarshaller<SecurityGroupIdentifier>(SecurityGroupIdentifierJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setState(InstanceStateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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
