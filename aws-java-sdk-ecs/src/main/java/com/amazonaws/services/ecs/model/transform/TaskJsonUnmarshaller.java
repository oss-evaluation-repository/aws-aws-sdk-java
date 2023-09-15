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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Task JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TaskJsonUnmarshaller implements Unmarshaller<Task, JsonUnmarshallerContext> {

    public Task unmarshall(JsonUnmarshallerContext context) throws Exception {
        Task task = new Task();

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
                if (context.testExpression("attachments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setAttachments(new ListUnmarshaller<Attachment>(AttachmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("attributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setAttributes(new ListUnmarshaller<Attribute>(AttributeJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("availabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("capacityProviderName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setCapacityProviderName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setClusterArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectivity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setConnectivity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectivityAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setConnectivityAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("containerInstanceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setContainerInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("containers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setContainers(new ListUnmarshaller<Container>(ContainerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("cpu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setCpu(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("desiredStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setDesiredStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableExecuteCommand", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setEnableExecuteCommand(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("executionStoppedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setExecutionStoppedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("group", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("healthStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setHealthStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inferenceAccelerators", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setInferenceAccelerators(new ListUnmarshaller<InferenceAccelerator>(InferenceAcceleratorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lastStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setLastStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("memory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setMemory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("overrides", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setOverrides(TaskOverrideJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("platformVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("platformFamily", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setPlatformFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pullStartedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setPullStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("pullStoppedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setPullStoppedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("startedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stopCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setStopCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stoppedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setStoppedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("stoppedReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setStoppedReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stoppingAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setStoppingAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("taskArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setTaskArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskDefinitionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setTaskDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ephemeralStorage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    task.setEphemeralStorage(EphemeralStorageJsonUnmarshaller.getInstance().unmarshall(context));
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

        return task;
    }

    private static TaskJsonUnmarshaller instance;

    public static TaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TaskJsonUnmarshaller();
        return instance;
    }
}
