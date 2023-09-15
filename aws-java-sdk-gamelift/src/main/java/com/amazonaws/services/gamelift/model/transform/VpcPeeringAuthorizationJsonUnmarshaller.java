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
 * VpcPeeringAuthorization JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VpcPeeringAuthorizationJsonUnmarshaller implements Unmarshaller<VpcPeeringAuthorization, JsonUnmarshallerContext> {

    public VpcPeeringAuthorization unmarshall(JsonUnmarshallerContext context) throws Exception {
        VpcPeeringAuthorization vpcPeeringAuthorization = new VpcPeeringAuthorization();

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
                if (context.testExpression("GameLiftAwsAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcPeeringAuthorization.setGameLiftAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PeerVpcAwsAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcPeeringAuthorization.setPeerVpcAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PeerVpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcPeeringAuthorization.setPeerVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcPeeringAuthorization.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExpirationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vpcPeeringAuthorization.setExpirationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return vpcPeeringAuthorization;
    }

    private static VpcPeeringAuthorizationJsonUnmarshaller instance;

    public static VpcPeeringAuthorizationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpcPeeringAuthorizationJsonUnmarshaller();
        return instance;
    }
}
