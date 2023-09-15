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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstancePatchState JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancePatchStateJsonUnmarshaller implements Unmarshaller<InstancePatchState, JsonUnmarshallerContext> {

    public InstancePatchState unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstancePatchState instancePatchState = new InstancePatchState();

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
                if (context.testExpression("InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PatchGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setPatchGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BaselineId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setBaselineId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnapshotId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setSnapshotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstallOverrideList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setInstallOverrideList(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setOwnerInformation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstalledCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setInstalledCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstalledOtherCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setInstalledOtherCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstalledPendingRebootCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setInstalledPendingRebootCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstalledRejectedCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setInstalledRejectedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MissingCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setMissingCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FailedCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setFailedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UnreportedNotApplicableCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setUnreportedNotApplicableCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NotApplicableCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setNotApplicableCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OperationStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setOperationStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("OperationEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setOperationEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Operation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setOperation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastNoRebootInstallOperationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setLastNoRebootInstallOperationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("RebootOption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setRebootOption(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CriticalNonCompliantCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setCriticalNonCompliantCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SecurityNonCompliantCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setSecurityNonCompliantCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("OtherNonCompliantCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancePatchState.setOtherNonCompliantCount(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return instancePatchState;
    }

    private static InstancePatchStateJsonUnmarshaller instance;

    public static InstancePatchStateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstancePatchStateJsonUnmarshaller();
        return instance;
    }
}
