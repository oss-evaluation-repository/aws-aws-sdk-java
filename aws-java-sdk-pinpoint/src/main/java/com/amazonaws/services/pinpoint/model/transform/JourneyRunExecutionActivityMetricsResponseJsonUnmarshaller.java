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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JourneyRunExecutionActivityMetricsResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyRunExecutionActivityMetricsResponseJsonUnmarshaller implements
        Unmarshaller<JourneyRunExecutionActivityMetricsResponse, JsonUnmarshallerContext> {

    public JourneyRunExecutionActivityMetricsResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        JourneyRunExecutionActivityMetricsResponse journeyRunExecutionActivityMetricsResponse = new JourneyRunExecutionActivityMetricsResponse();

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
                if (context.testExpression("ActivityType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyRunExecutionActivityMetricsResponse.setActivityType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyRunExecutionActivityMetricsResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JourneyActivityId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyRunExecutionActivityMetricsResponse.setJourneyActivityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JourneyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyRunExecutionActivityMetricsResponse.setJourneyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastEvaluatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyRunExecutionActivityMetricsResponse.setLastEvaluatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Metrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyRunExecutionActivityMetricsResponse.setMetrics(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("RunId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyRunExecutionActivityMetricsResponse.setRunId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return journeyRunExecutionActivityMetricsResponse;
    }

    private static JourneyRunExecutionActivityMetricsResponseJsonUnmarshaller instance;

    public static JourneyRunExecutionActivityMetricsResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JourneyRunExecutionActivityMetricsResponseJsonUnmarshaller();
        return instance;
    }
}
