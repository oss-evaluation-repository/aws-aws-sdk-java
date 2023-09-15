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
package com.amazonaws.services.applicationinsights.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.applicationinsights.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Observation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObservationJsonUnmarshaller implements Unmarshaller<Observation, JsonUnmarshallerContext> {

    public Observation unmarshall(JsonUnmarshallerContext context) throws Exception {
        Observation observation = new Observation();

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
                    observation.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("SourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setSourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setLogGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LineTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setLineTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LogText", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setLogText(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogFilter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setLogFilter(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricNamespace", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setMetricNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Value", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchEventId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setCloudWatchEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchEventSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setCloudWatchEventSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchEventDetailType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setCloudWatchEventDetailType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthEventArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setHealthEventArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthService", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setHealthService(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthEventTypeCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setHealthEventTypeCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthEventTypeCategory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setHealthEventTypeCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthEventDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setHealthEventDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeDeployDeploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setCodeDeployDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeDeployDeploymentGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setCodeDeployDeploymentGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeDeployState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setCodeDeployState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeDeployApplication", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setCodeDeployApplication(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CodeDeployInstanceGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setCodeDeployInstanceGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ec2State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setEc2State(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RdsEventCategories", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setRdsEventCategories(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RdsEventMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setRdsEventMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3EventName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setS3EventName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatesExecutionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setStatesExecutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatesArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setStatesArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatesStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setStatesStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatesInput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setStatesInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsEvent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setEbsEvent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsResult", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setEbsResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsCause", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setEbsCause(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsRequestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setEbsRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("XRayFaultPercent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setXRayFaultPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("XRayThrottlePercent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setXRayThrottlePercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("XRayErrorPercent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setXRayErrorPercent(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("XRayRequestCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setXRayRequestCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("XRayRequestAverageLatency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setXRayRequestAverageLatency(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("XRayNodeName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setXRayNodeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("XRayNodeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    observation.setXRayNodeType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return observation;
    }

    private static ObservationJsonUnmarshaller instance;

    public static ObservationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ObservationJsonUnmarshaller();
        return instance;
    }
}
