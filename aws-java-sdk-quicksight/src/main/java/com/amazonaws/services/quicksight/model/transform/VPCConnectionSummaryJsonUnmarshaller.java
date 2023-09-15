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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VPCConnectionSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VPCConnectionSummaryJsonUnmarshaller implements Unmarshaller<VPCConnectionSummary, JsonUnmarshallerContext> {

    public VPCConnectionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        VPCConnectionSummary vPCConnectionSummary = new VPCConnectionSummary();

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
                if (context.testExpression("VPCConnectionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setVPCConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VPCId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setVPCId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DnsResolvers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setDnsResolvers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setAvailabilityStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaces", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vPCConnectionSummary.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return vPCConnectionSummary;
    }

    private static VPCConnectionSummaryJsonUnmarshaller instance;

    public static VPCConnectionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VPCConnectionSummaryJsonUnmarshaller();
        return instance;
    }
}
