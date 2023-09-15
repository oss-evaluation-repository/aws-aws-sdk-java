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
package com.amazonaws.services.simpleemailv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleemailv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetAccountResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountResultJsonUnmarshaller implements Unmarshaller<GetAccountResult, JsonUnmarshallerContext> {

    public GetAccountResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetAccountResult getAccountResult = new GetAccountResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getAccountResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DedicatedIpAutoWarmupEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getAccountResult.setDedicatedIpAutoWarmupEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnforcementStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getAccountResult.setEnforcementStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductionAccessEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getAccountResult.setProductionAccessEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SendQuota", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getAccountResult.setSendQuota(SendQuotaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SendingEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getAccountResult.setSendingEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SuppressionAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getAccountResult.setSuppressionAttributes(SuppressionAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Details", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getAccountResult.setDetails(AccountDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VdmAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getAccountResult.setVdmAttributes(VdmAttributesJsonUnmarshaller.getInstance().unmarshall(context));
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

        return getAccountResult;
    }

    private static GetAccountResultJsonUnmarshaller instance;

    public static GetAccountResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAccountResultJsonUnmarshaller();
        return instance;
    }
}
