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
 * KinesisStreamingSourceOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisStreamingSourceOptionsJsonUnmarshaller implements Unmarshaller<KinesisStreamingSourceOptions, JsonUnmarshallerContext> {

    public KinesisStreamingSourceOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        KinesisStreamingSourceOptions kinesisStreamingSourceOptions = new KinesisStreamingSourceOptions();

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
                if (context.testExpression("EndpointUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setEndpointUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Classification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setClassification(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Delimiter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setDelimiter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setStartingPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxFetchTimeInMs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setMaxFetchTimeInMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MaxFetchRecordsPerShard", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setMaxFetchRecordsPerShard(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MaxRecordPerRead", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setMaxRecordPerRead(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("AddIdleTimeBetweenReads", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setAddIdleTimeBetweenReads(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IdleTimeBetweenReadsInMs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setIdleTimeBetweenReadsInMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("DescribeShardInterval", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setDescribeShardInterval(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("NumRetries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setNumRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RetryIntervalMs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setRetryIntervalMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("MaxRetryIntervalMs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setMaxRetryIntervalMs(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("AvoidEmptyBatches", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setAvoidEmptyBatches(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("StreamArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setStreamArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleSessionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setRoleSessionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AddRecordTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setAddRecordTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmitConsumerLagMetrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setEmitConsumerLagMetrics(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kinesisStreamingSourceOptions.setStartingTimestamp(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
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

        return kinesisStreamingSourceOptions;
    }

    private static KinesisStreamingSourceOptionsJsonUnmarshaller instance;

    public static KinesisStreamingSourceOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KinesisStreamingSourceOptionsJsonUnmarshaller();
        return instance;
    }
}
