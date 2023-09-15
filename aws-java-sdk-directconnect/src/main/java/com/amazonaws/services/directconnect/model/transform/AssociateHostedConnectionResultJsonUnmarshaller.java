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
 * AssociateHostedConnectionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateHostedConnectionResultJsonUnmarshaller implements Unmarshaller<AssociateHostedConnectionResult, JsonUnmarshallerContext> {

    public AssociateHostedConnectionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssociateHostedConnectionResult associateHostedConnectionResult = new AssociateHostedConnectionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return associateHostedConnectionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ownerAccount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setConnectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setConnectionState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setLocation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bandwidth", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setBandwidth(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vlan", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setVlan(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("partnerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setPartnerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loaIssueTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setLoaIssueTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lagId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setLagId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsDevice", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setAwsDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jumboFrameCapable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setJumboFrameCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("awsDeviceV2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setAwsDeviceV2(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsLogicalDeviceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setAwsLogicalDeviceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hasLogicalRedundancy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setHasLogicalRedundancy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("providerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setProviderName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macSecCapable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setMacSecCapable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("portEncryptionStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setPortEncryptionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("encryptionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setEncryptionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("macSecKeys", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    associateHostedConnectionResult.setMacSecKeys(new ListUnmarshaller<MacSecKey>(MacSecKeyJsonUnmarshaller.getInstance())

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

        return associateHostedConnectionResult;
    }

    private static AssociateHostedConnectionResultJsonUnmarshaller instance;

    public static AssociateHostedConnectionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssociateHostedConnectionResultJsonUnmarshaller();
        return instance;
    }
}
