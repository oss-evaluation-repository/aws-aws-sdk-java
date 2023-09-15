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
package com.amazonaws.services.gamelift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Compute JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeJsonUnmarshaller implements Unmarshaller<Compute, JsonUnmarshallerContext> {

    public Compute unmarshall(JsonUnmarshallerContext context) throws Exception {
        Compute compute = new Compute();

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
                if (context.testExpression("FleetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setFleetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FleetArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setFleetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setComputeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setComputeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IpAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setIpAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setComputeStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OperatingSystem", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setOperatingSystem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameLiftServiceSdkEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    compute.setGameLiftServiceSdkEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
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

        return compute;
    }

    private static ComputeJsonUnmarshaller instance;

    public static ComputeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComputeJsonUnmarshaller();
        return instance;
    }
}
