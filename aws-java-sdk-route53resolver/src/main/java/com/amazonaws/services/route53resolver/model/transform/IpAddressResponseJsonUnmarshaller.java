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
package com.amazonaws.services.route53resolver.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.route53resolver.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * IpAddressResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAddressResponseJsonUnmarshaller implements Unmarshaller<IpAddressResponse, JsonUnmarshallerContext> {

    public IpAddressResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        IpAddressResponse ipAddressResponse = new IpAddressResponse();

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
                if (context.testExpression("IpId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ipAddressResponse.setIpId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ipAddressResponse.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ip", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ipAddressResponse.setIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ipv6", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ipAddressResponse.setIpv6(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ipAddressResponse.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ipAddressResponse.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ipAddressResponse.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModificationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ipAddressResponse.setModificationTime(context.getUnmarshaller(String.class).unmarshall(context));
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

        return ipAddressResponse;
    }

    private static IpAddressResponseJsonUnmarshaller instance;

    public static IpAddressResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IpAddressResponseJsonUnmarshaller();
        return instance;
    }
}
