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
 * JobRun JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobRunJsonUnmarshaller implements Unmarshaller<JobRun, JsonUnmarshallerContext> {

    public JobRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobRun jobRun = new JobRun();

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
                    jobRun.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attempt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setAttempt(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PreviousRunId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setPreviousRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TriggerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setTriggerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setStartedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setLastModifiedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setCompletedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("JobRunState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setJobRunState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arguments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setArguments(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PredecessorRuns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setPredecessorRuns(new ListUnmarshaller<Predecessor>(PredecessorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AllocatedCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setAllocatedCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setExecutionTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setMaxCapacity(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("WorkerType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setWorkerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfWorkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setNumberOfWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SecurityConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setLogGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationProperty", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setNotificationProperty(NotificationPropertyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GlueVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setGlueVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DPUSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setDPUSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionClass", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobRun.setExecutionClass(context.getUnmarshaller(String.class).unmarshall(context));
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

        return jobRun;
    }

    private static JobRunJsonUnmarshaller instance;

    public static JobRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobRunJsonUnmarshaller();
        return instance;
    }
}
