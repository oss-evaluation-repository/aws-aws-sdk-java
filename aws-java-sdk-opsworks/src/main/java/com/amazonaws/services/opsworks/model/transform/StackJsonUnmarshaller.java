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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Stack JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackJsonUnmarshaller implements Unmarshaller<Stack, JsonUnmarshallerContext> {

    public Stack unmarshall(JsonUnmarshallerContext context) throws Exception {
        Stack stack = new Stack();

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
                if (context.testExpression("StackId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setStackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("ServiceRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultInstanceProfileArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setDefaultInstanceProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultOs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setDefaultOs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HostnameTheme", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setHostnameTheme(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultAvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setDefaultAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultSubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setDefaultSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomJson", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setCustomJson(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationManager", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setConfigurationManager(StackConfigurationManagerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ChefConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setChefConfiguration(ChefConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UseCustomCookbooks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setUseCustomCookbooks(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseOpsworksSecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setUseOpsworksSecurityGroups(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CustomCookbooksSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setCustomCookbooksSource(SourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultSshKeyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setDefaultSshKeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultRootDeviceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setDefaultRootDeviceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AgentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stack.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
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

        return stack;
    }

    private static StackJsonUnmarshaller instance;

    public static StackJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StackJsonUnmarshaller();
        return instance;
    }
}
