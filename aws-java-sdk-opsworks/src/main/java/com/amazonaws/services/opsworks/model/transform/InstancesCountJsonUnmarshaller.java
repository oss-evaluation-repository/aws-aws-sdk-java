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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstancesCount JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstancesCountJsonUnmarshaller implements Unmarshaller<InstancesCount, JsonUnmarshallerContext> {

    public InstancesCount unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstancesCount instancesCount = new InstancesCount();

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
                if (context.testExpression("Assigning", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setAssigning(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Booting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setBooting(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionLost", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setConnectionLost(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Deregistering", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setDeregistering(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Online", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setOnline(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Pending", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setPending(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Rebooting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setRebooting(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Registered", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setRegistered(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Registering", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setRegistering(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Requested", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setRequested(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RunningSetup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setRunningSetup(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SetupFailed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setSetupFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ShuttingDown", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setShuttingDown(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StartFailed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setStartFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StopFailed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setStopFailed(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Stopped", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setStopped(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Stopping", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setStopping(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Terminated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setTerminated(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Terminating", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setTerminating(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Unassigning", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instancesCount.setUnassigning(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return instancesCount;
    }

    private static InstancesCountJsonUnmarshaller instance;

    public static InstancesCountJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstancesCountJsonUnmarshaller();
        return instance;
    }
}
