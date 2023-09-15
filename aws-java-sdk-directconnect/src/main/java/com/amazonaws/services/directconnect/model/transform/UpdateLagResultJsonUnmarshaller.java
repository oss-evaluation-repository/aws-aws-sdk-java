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
 * UpdateLagResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLagResultJsonUnmarshaller implements Unmarshaller<UpdateLagResult, JsonUnmarshallerContext> {

    public UpdateLagResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateLagResult updateLagResult = new UpdateLagResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateLagResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("connectionsBandwidth", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setConnectionsBandwidth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("numberOfConnections", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setNumberOfConnections(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("lagId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setLagId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ownerAccount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lagName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setLagName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lagState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setLagState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("minimumLinks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setMinimumLinks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("awsDevice", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setAwsDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsDeviceV2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setAwsDeviceV2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsLogicalDeviceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setAwsLogicalDeviceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connections", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setConnections(new ListUnmarshaller<Connection>(ConnectionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("allowsHostedConnections", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setAllowsHostedConnections(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("jumboFrameCapable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setJumboFrameCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("hasLogicalRedundancy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setHasLogicalRedundancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("providerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setProviderName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macSecCapable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setMacSecCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("encryptionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setEncryptionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macSecKeys", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLagResult.setMacSecKeys(new ListUnmarshaller<MacSecKey>(MacSecKeyJsonUnmarshaller.getInstance())

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

        return updateLagResult;
    }

    private static UpdateLagResultJsonUnmarshaller instance;

    public static UpdateLagResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateLagResultJsonUnmarshaller();
        return instance;
    }
}
