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
package com.amazonaws.services.batch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobDetailJsonUnmarshaller implements Unmarshaller<JobDetail, JsonUnmarshallerContext> {

    public JobDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobDetail jobDetail = new JobDetail();

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
                    jobDetail.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobQueue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setJobQueue(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("shareIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setShareIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("schedulingPriority", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setSchedulingPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("attempts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setAttempts(new ListUnmarshaller<AttemptDetail>(AttemptDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setCreatedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("retryStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setRetryStrategy(RetryStrategyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setStartedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("stoppedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setStoppedAt(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("dependsOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setDependsOn(new ListUnmarshaller<JobDependency>(JobDependencyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("jobDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setJobDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("container", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setContainer(ContainerDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nodeDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setNodeDetails(NodeDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("nodeProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setNodeProperties(NodePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("arrayProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setArrayProperties(ArrayPropertiesDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setTimeout(JobTimeoutJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("propagateTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setPropagateTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("platformCapabilities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setPlatformCapabilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("eksProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setEksProperties(EksPropertiesDetailJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("eksAttempts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setEksAttempts(new ListUnmarshaller<EksAttemptDetail>(EksAttemptDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("isCancelled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setIsCancelled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("isTerminated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobDetail.setIsTerminated(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return jobDetail;
    }

    private static JobDetailJsonUnmarshaller instance;

    public static JobDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobDetailJsonUnmarshaller();
        return instance;
    }
}
