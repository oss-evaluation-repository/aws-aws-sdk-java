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
package com.amazonaws.services.vpclattice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.vpclattice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TargetGroupSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetGroupSummaryJsonUnmarshaller implements Unmarshaller<TargetGroupSummary, JsonUnmarshallerContext> {

    public TargetGroupSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        TargetGroupSummary targetGroupSummary = new TargetGroupSummary();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ipAddressType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setIpAddressType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lambdaEventStructureVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setLambdaEventStructureVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("port", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("protocol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceArns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setServiceArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    targetGroupSummary.setVpcIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
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

        return targetGroupSummary;
    }

    private static TargetGroupSummaryJsonUnmarshaller instance;

    public static TargetGroupSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetGroupSummaryJsonUnmarshaller();
        return instance;
    }
}
