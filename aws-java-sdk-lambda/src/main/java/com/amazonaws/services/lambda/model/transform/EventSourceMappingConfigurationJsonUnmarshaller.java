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
 * EventSourceMappingConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventSourceMappingConfigurationJsonUnmarshaller implements Unmarshaller<EventSourceMappingConfiguration, JsonUnmarshallerContext> {

    public EventSourceMappingConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventSourceMappingConfiguration eventSourceMappingConfiguration = new EventSourceMappingConfiguration();

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
                if (context.testExpression("UUID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setUUID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setStartingPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPositionTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setStartingPositionTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("BatchSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setBatchSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaximumBatchingWindowInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setMaximumBatchingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ParallelizationFactor", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setParallelizationFactor(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EventSourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setEventSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FilterCriteria", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setFilterCriteria(FilterCriteriaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FunctionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setFunctionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModified", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setLastModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastProcessingResult", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setLastProcessingResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateTransitionReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setStateTransitionReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setDestinationConfig(DestinationConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Topics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setTopics(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Queues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setQueues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SourceAccessConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setSourceAccessConfigurations(new ListUnmarshaller<SourceAccessConfiguration>(
                            SourceAccessConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SelfManagedEventSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setSelfManagedEventSource(SelfManagedEventSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaximumRecordAgeInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setMaximumRecordAgeInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BisectBatchOnFunctionError", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setBisectBatchOnFunctionError(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaximumRetryAttempts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setMaximumRetryAttempts(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TumblingWindowInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setTumblingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("FunctionResponseTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setFunctionResponseTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AmazonManagedKafkaEventSourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setAmazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("SelfManagedKafkaEventSourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setSelfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ScalingConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setScalingConfig(ScalingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DocumentDBEventSourceConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventSourceMappingConfiguration.setDocumentDBEventSourceConfig(DocumentDBEventSourceConfigJsonUnmarshaller.getInstance()
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

        return eventSourceMappingConfiguration;
    }

    private static EventSourceMappingConfigurationJsonUnmarshaller instance;

    public static EventSourceMappingConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventSourceMappingConfigurationJsonUnmarshaller();
        return instance;
    }
}
