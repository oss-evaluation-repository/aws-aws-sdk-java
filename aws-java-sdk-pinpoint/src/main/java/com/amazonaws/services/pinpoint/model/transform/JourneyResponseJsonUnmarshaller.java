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
 * JourneyResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyResponseJsonUnmarshaller implements Unmarshaller<JourneyResponse, JsonUnmarshallerContext> {

    public JourneyResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        JourneyResponse journeyResponse = new JourneyResponse();

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
                if (context.testExpression("Activities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setActivities(new MapUnmarshaller<String, Activity>(context.getUnmarshaller(String.class), ActivityJsonUnmarshaller
                            .getInstance()).unmarshall(context));
                }
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Limits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setLimits(JourneyLimitsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LocalTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setLocalTime(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuietTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setQuietTime(QuietTimeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RefreshFrequency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setRefreshFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setSchedule(JourneyScheduleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartActivity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setStartActivity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartCondition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setStartCondition(StartConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("WaitForQuietTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setWaitForQuietTime(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RefreshOnSegmentUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setRefreshOnSegmentUpdate(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("JourneyChannelSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setJourneyChannelSettings(JourneyChannelSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SendingSchedule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setSendingSchedule(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OpenHours", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setOpenHours(OpenHoursJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ClosedDays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setClosedDays(ClosedDaysJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TimezoneEstimationMethods", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journeyResponse.setTimezoneEstimationMethods(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return journeyResponse;
    }

    private static JourneyResponseJsonUnmarshaller instance;

    public static JourneyResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JourneyResponseJsonUnmarshaller();
        return instance;
    }
}
