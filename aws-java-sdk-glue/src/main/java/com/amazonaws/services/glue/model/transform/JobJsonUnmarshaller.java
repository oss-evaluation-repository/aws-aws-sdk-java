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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Job JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobJsonUnmarshaller implements Unmarshaller<Job, JsonUnmarshallerContext> {

    public Job unmarshall(JsonUnmarshallerContext context) throws Exception {
        Job job = new Job();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setLogUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setCreatedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setLastModifiedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutionProperty", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setExecutionProperty(ExecutionPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Command", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setCommand(JobCommandJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultArguments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setDefaultArguments(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("NonOverridableArguments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setNonOverridableArguments(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Connections", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setConnections(ConnectionsListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxRetries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setMaxRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AllocatedCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setAllocatedCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setMaxCapacity(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("WorkerType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setWorkerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfWorkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setNumberOfWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SecurityConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationProperty", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setNotificationProperty(NotificationPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GlueVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setGlueVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeGenConfigurationNodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setCodeGenConfigurationNodes(new MapUnmarshaller<String, CodeGenConfigurationNode>(context.getUnmarshaller(String.class),
                            CodeGenConfigurationNodeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("ExecutionClass", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setExecutionClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceControlDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setSourceControlDetails(SourceControlDetailsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return job;
    }

    private static JobJsonUnmarshaller instance;

    public static JobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonUnmarshaller();
        return instance;
    }
}
