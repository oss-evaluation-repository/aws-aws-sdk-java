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
package com.amazonaws.services.xray.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.xray.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Insight JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightJsonUnmarshaller implements Unmarshaller<Insight, JsonUnmarshallerContext> {

    public Insight unmarshall(JsonUnmarshallerContext context) throws Exception {
        Insight insight = new Insight();

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
                if (context.testExpression("InsightId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setInsightId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setGroupARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RootCauseServiceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setRootCauseServiceId(ServiceIdJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Categories", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setCategories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Summary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setSummary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientRequestImpactStatistics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setClientRequestImpactStatistics(RequestImpactStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RootCauseServiceRequestImpactStatistics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setRootCauseServiceRequestImpactStatistics(RequestImpactStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TopAnomalousServices", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    insight.setTopAnomalousServices(new ListUnmarshaller<AnomalousService>(AnomalousServiceJsonUnmarshaller.getInstance())

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

        return insight;
    }

    private static InsightJsonUnmarshaller instance;

    public static InsightJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsightJsonUnmarshaller();
        return instance;
    }
}
