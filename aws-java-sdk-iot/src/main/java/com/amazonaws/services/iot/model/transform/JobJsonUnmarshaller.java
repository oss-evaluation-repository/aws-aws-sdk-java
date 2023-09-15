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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
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
                if (context.testExpression("jobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetSelection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setTargetSelection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("forceCanceled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setForceCanceled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("reasonCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setReasonCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("comment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setComment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setTargets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("presignedUrlConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setPresignedUrlConfig(PresignedUrlConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("jobExecutionsRolloutConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setJobExecutionsRolloutConfig(JobExecutionsRolloutConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("abortConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setAbortConfig(AbortConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("completedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setCompletedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("jobProcessDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setJobProcessDetails(JobProcessDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timeoutConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setTimeoutConfig(TimeoutConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("namespaceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setNamespaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobTemplateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setJobTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobExecutionsRetryConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setJobExecutionsRetryConfig(JobExecutionsRetryConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("documentParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setDocumentParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("isConcurrent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setIsConcurrent(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("schedulingConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setSchedulingConfig(SchedulingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scheduledJobRollouts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setScheduledJobRollouts(new ListUnmarshaller<ScheduledJobRollout>(ScheduledJobRolloutJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("destinationPackageVersions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setDestinationPackageVersions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
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
