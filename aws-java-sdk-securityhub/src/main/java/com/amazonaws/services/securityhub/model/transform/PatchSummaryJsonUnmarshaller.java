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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PatchSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchSummaryJsonUnmarshaller implements Unmarshaller<PatchSummary, JsonUnmarshallerContext> {

    public PatchSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        PatchSummary patchSummary = new PatchSummary();

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
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstalledCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setInstalledCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MissingCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setMissingCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FailedCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setFailedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstalledOtherCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setInstalledOtherCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstalledRejectedCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setInstalledRejectedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstalledPendingReboot", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setInstalledPendingReboot(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OperationStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setOperationStartTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OperationEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setOperationEndTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RebootOption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setRebootOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Operation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchSummary.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
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

        return patchSummary;
    }

    private static PatchSummaryJsonUnmarshaller instance;

    public static PatchSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PatchSummaryJsonUnmarshaller();
        return instance;
    }
}
