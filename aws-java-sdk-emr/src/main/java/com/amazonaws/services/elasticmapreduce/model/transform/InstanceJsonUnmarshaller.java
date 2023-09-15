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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
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
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setEc2InstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicDnsName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPublicDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PublicIpAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPublicIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateDnsName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPrivateDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PrivateIpAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setPrivateIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setStatus(InstanceStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInstanceGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceFleetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInstanceFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Market", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setMarket(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsVolumes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instance.setEbsVolumes(new ListUnmarshaller<EbsVolume>(EbsVolumeJsonUnmarshaller.getInstance())

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

        return instance;
    }

    private static InstanceJsonUnmarshaller instance;

    public static InstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceJsonUnmarshaller();
        return instance;
    }
}
