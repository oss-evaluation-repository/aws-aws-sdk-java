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
package com.amazonaws.services.devopsguru.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.devopsguru.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PerformanceInsightsMetricsDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceInsightsMetricsDetailJsonUnmarshaller implements Unmarshaller<PerformanceInsightsMetricsDetail, JsonUnmarshallerContext> {

    public PerformanceInsightsMetricsDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        PerformanceInsightsMetricsDetail performanceInsightsMetricsDetail = new PerformanceInsightsMetricsDetail();

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
                if (context.testExpression("MetricDisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    performanceInsightsMetricsDetail.setMetricDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    performanceInsightsMetricsDetail.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MetricQuery", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    performanceInsightsMetricsDetail.setMetricQuery(PerformanceInsightsMetricQueryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReferenceData", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    performanceInsightsMetricsDetail.setReferenceData(new ListUnmarshaller<PerformanceInsightsReferenceData>(
                            PerformanceInsightsReferenceDataJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StatsAtAnomaly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    performanceInsightsMetricsDetail.setStatsAtAnomaly(new ListUnmarshaller<PerformanceInsightsStat>(PerformanceInsightsStatJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StatsAtBaseline", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    performanceInsightsMetricsDetail.setStatsAtBaseline(new ListUnmarshaller<PerformanceInsightsStat>(PerformanceInsightsStatJsonUnmarshaller
                            .getInstance())

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

        return performanceInsightsMetricsDetail;
    }

    private static PerformanceInsightsMetricsDetailJsonUnmarshaller instance;

    public static PerformanceInsightsMetricsDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PerformanceInsightsMetricsDetailJsonUnmarshaller();
        return instance;
    }
}
