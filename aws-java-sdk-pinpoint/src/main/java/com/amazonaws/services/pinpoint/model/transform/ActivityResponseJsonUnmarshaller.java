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
 * ActivityResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityResponseJsonUnmarshaller implements Unmarshaller<ActivityResponse, JsonUnmarshallerContext> {

    public ActivityResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActivityResponse activityResponse = new ActivityResponse();

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
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CampaignId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setCampaignId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("End", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setEnd(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Result", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduledStart", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setScheduledStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Start", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setStart(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SuccessfulEndpointCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setSuccessfulEndpointCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TimezonesCompletedCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setTimezonesCompletedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TimezonesTotalCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setTimezonesTotalCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TotalEndpointCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setTotalEndpointCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TreatmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setTreatmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionMetrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activityResponse.setExecutionMetrics(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

        return activityResponse;
    }

    private static ActivityResponseJsonUnmarshaller instance;

    public static ActivityResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActivityResponseJsonUnmarshaller();
        return instance;
    }
}
