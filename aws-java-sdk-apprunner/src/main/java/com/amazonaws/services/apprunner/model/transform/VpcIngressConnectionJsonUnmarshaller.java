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
package com.amazonaws.services.apprunner.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apprunner.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VpcIngressConnection JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcIngressConnectionJsonUnmarshaller implements Unmarshaller<VpcIngressConnection, JsonUnmarshallerContext> {

    public VpcIngressConnection unmarshall(JsonUnmarshallerContext context) throws Exception {
        VpcIngressConnection vpcIngressConnection = new VpcIngressConnection();

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
                if (context.testExpression("VpcIngressConnectionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcIngressConnection.setVpcIngressConnectionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcIngressConnectionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcIngressConnection.setVpcIngressConnectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcIngressConnection.setServiceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcIngressConnection.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcIngressConnection.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcIngressConnection.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IngressVpcConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcIngressConnection.setIngressVpcConfiguration(IngressVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcIngressConnection.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DeletedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcIngressConnection.setDeletedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return vpcIngressConnection;
    }

    private static VpcIngressConnectionJsonUnmarshaller instance;

    public static VpcIngressConnectionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcIngressConnectionJsonUnmarshaller();
        return instance;
    }
}
