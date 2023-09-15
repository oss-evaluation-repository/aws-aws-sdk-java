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
package com.amazonaws.services.s3outposts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.s3outposts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Endpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointJsonUnmarshaller implements Unmarshaller<Endpoint, JsonUnmarshallerContext> {

    public Endpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        Endpoint endpoint = new Endpoint();

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
                if (context.testExpression("EndpointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutpostsId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setOutpostsId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CidrBlock", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaces", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setSecurityGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setAccessType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomerOwnedIpv4Pool", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setCustomerOwnedIpv4Pool(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailedReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpoint.setFailedReason(FailedReasonJsonUnmarshaller.getInstance().unmarshall(context));
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

        return endpoint;
    }

    private static EndpointJsonUnmarshaller instance;

    public static EndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointJsonUnmarshaller();
        return instance;
    }
}
