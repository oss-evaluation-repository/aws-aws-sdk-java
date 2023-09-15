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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevidently.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Experiment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentJsonUnmarshaller implements Unmarshaller<Experiment, JsonUnmarshallerContext> {

    public Experiment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Experiment experiment = new Experiment();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("execution", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setExecution(ExperimentExecutionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("metricGoals", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setMetricGoals(new ListUnmarshaller<MetricGoal>(MetricGoalJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("onlineAbDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setOnlineAbDefinition(OnlineAbDefinitionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("project", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setProject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("randomizationSalt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setRandomizationSalt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("samplingRate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setSamplingRate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("schedule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setSchedule(ExperimentScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("segment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setSegment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("treatments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setTreatments(new ListUnmarshaller<Treatment>(TreatmentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    experiment.setType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return experiment;
    }

    private static ExperimentJsonUnmarshaller instance;

    public static ExperimentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExperimentJsonUnmarshaller();
        return instance;
    }
}
