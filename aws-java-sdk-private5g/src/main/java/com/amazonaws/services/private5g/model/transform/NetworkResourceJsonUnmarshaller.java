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
package com.amazonaws.services.private5g.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.private5g.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * NetworkResource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkResourceJsonUnmarshaller implements Unmarshaller<NetworkResource, JsonUnmarshallerContext> {

    public NetworkResource unmarshall(JsonUnmarshallerContext context) throws Exception {
        NetworkResource networkResource = new NetworkResource();

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
                if (context.testExpression("attributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setAttributes(new ListUnmarshaller<NameValuePair>(NameValuePairJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("commitmentInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setCommitmentInformation(CommitmentInformationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("health", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setHealth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("model", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setNetworkArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkResourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setNetworkResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networkSiteArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setNetworkSiteArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("orderArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setOrderArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("position", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setPosition(PositionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("returnInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setReturnInformation(ReturnInformationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serialNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vendor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    networkResource.setVendor(context.getUnmarshaller(String.class).unmarshall(context));
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

        return networkResource;
    }

    private static NetworkResourceJsonUnmarshaller instance;

    public static NetworkResourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new NetworkResourceJsonUnmarshaller();
        return instance;
    }
}
