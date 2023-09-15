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
package com.amazonaws.services.networkmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CoreNetworkPolicyVersion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkPolicyVersionJsonUnmarshaller implements Unmarshaller<CoreNetworkPolicyVersion, JsonUnmarshallerContext> {

    public CoreNetworkPolicyVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        CoreNetworkPolicyVersion coreNetworkPolicyVersion = new CoreNetworkPolicyVersion();

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
                if (context.testExpression("CoreNetworkId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkPolicyVersion.setCoreNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PolicyVersionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkPolicyVersion.setPolicyVersionId(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Alias", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkPolicyVersion.setAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkPolicyVersion.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkPolicyVersion.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ChangeSetState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkPolicyVersion.setChangeSetState(context.getUnmarshaller(String.class).unmarshall(context));
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

        return coreNetworkPolicyVersion;
    }

    private static CoreNetworkPolicyVersionJsonUnmarshaller instance;

    public static CoreNetworkPolicyVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoreNetworkPolicyVersionJsonUnmarshaller();
        return instance;
    }
}
