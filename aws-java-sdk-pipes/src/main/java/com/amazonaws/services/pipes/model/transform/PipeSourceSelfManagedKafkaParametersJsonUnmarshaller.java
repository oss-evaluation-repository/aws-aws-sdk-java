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
package com.amazonaws.services.pipes.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PipeSourceSelfManagedKafkaParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeSourceSelfManagedKafkaParametersJsonUnmarshaller implements Unmarshaller<PipeSourceSelfManagedKafkaParameters, JsonUnmarshallerContext> {

    public PipeSourceSelfManagedKafkaParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipeSourceSelfManagedKafkaParameters pipeSourceSelfManagedKafkaParameters = new PipeSourceSelfManagedKafkaParameters();

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
                if (context.testExpression("AdditionalBootstrapServers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceSelfManagedKafkaParameters.setAdditionalBootstrapServers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("BatchSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceSelfManagedKafkaParameters.setBatchSize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ConsumerGroupID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceSelfManagedKafkaParameters.setConsumerGroupID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Credentials", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceSelfManagedKafkaParameters.setCredentials(SelfManagedKafkaAccessConfigurationCredentialsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("MaximumBatchingWindowInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceSelfManagedKafkaParameters.setMaximumBatchingWindowInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServerRootCaCertificate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceSelfManagedKafkaParameters.setServerRootCaCertificate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartingPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceSelfManagedKafkaParameters.setStartingPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TopicName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceSelfManagedKafkaParameters.setTopicName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Vpc", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pipeSourceSelfManagedKafkaParameters.setVpc(SelfManagedKafkaAccessConfigurationVpcJsonUnmarshaller.getInstance().unmarshall(context));
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

        return pipeSourceSelfManagedKafkaParameters;
    }

    private static PipeSourceSelfManagedKafkaParametersJsonUnmarshaller instance;

    public static PipeSourceSelfManagedKafkaParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipeSourceSelfManagedKafkaParametersJsonUnmarshaller();
        return instance;
    }
}
