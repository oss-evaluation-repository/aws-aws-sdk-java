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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeClassificationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeClassificationJobResultJsonUnmarshaller implements Unmarshaller<DescribeClassificationJobResult, JsonUnmarshallerContext> {

    public DescribeClassificationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeClassificationJobResult describeClassificationJobResult = new DescribeClassificationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeClassificationJobResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("allowListIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setAllowListIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("clientToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("customDataIdentifierIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setCustomDataIdentifierIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("initialRun", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setInitialRun(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("jobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setJobType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastRunErrorStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setLastRunErrorStatus(LastRunErrorStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastRunTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setLastRunTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("managedDataIdentifierIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setManagedDataIdentifierIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("managedDataIdentifierSelector", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setManagedDataIdentifierSelector(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("s3JobDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setS3JobDefinition(S3JobDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("samplingPercentage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setSamplingPercentage(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scheduleFrequency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setScheduleFrequency(JobScheduleFrequencyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("statistics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setStatistics(StatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("userPausedDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeClassificationJobResult.setUserPausedDetails(UserPausedDetailsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeClassificationJobResult;
    }

    private static DescribeClassificationJobResultJsonUnmarshaller instance;

    public static DescribeClassificationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeClassificationJobResultJsonUnmarshaller();
        return instance;
    }
}
