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
package com.amazonaws.services.lambda.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetEventSourceMappingResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventSourceMappingResultJsonUnmarshaller implements Unmarshaller<GetEventSourceMappingResult, JsonUnmarshallerContext> {

    public GetEventSourceMappingResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetEventSourceMappingResult getEventSourceMappingResult = new GetEventSourceMappingResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getEventSourceMappingResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("UUID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setUUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setStartingPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPositionTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setStartingPositionTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BatchSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setBatchSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaximumBatchingWindowInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setMaximumBatchingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParallelizationFactor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setParallelizationFactor(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EventSourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setEventSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterCriteria", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setFilterCriteria(FilterCriteriaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setLastModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastProcessingResult", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setLastProcessingResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateTransitionReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setStateTransitionReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setDestinationConfig(DestinationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Topics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setTopics(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Queues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setQueues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SourceAccessConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setSourceAccessConfigurations(new ListUnmarshaller<SourceAccessConfiguration>(
                            SourceAccessConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SelfManagedEventSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setSelfManagedEventSource(SelfManagedEventSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumRecordAgeInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setMaximumRecordAgeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BisectBatchOnFunctionError", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setBisectBatchOnFunctionError(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaximumRetryAttempts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setMaximumRetryAttempts(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TumblingWindowInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setTumblingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FunctionResponseTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setFunctionResponseTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AmazonManagedKafkaEventSourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setAmazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("SelfManagedKafkaEventSourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setSelfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ScalingConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setScalingConfig(ScalingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DocumentDBEventSourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getEventSourceMappingResult.setDocumentDBEventSourceConfig(DocumentDBEventSourceConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return getEventSourceMappingResult;
    }

    private static GetEventSourceMappingResultJsonUnmarshaller instance;

    public static GetEventSourceMappingResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetEventSourceMappingResultJsonUnmarshaller();
        return instance;
    }
}
