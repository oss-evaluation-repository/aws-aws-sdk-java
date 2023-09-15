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
package com.amazonaws.services.mediatailor.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediatailor.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScheduleEntry JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleEntryJsonUnmarshaller implements Unmarshaller<ScheduleEntry, JsonUnmarshallerContext> {

    public ScheduleEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduleEntry scheduleEntry = new ScheduleEntry();

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
                if (context.testExpression("ApproximateDurationSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setApproximateDurationSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ApproximateStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setApproximateStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChannelName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setChannelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LiveSourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setLiveSourceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProgramName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setProgramName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ScheduleAdBreaks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setScheduleAdBreaks(new ListUnmarshaller<ScheduleAdBreak>(ScheduleAdBreakJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ScheduleEntryType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setScheduleEntryType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceLocationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setSourceLocationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VodSourceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduleEntry.setVodSourceName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return scheduleEntry;
    }

    private static ScheduleEntryJsonUnmarshaller instance;

    public static ScheduleEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleEntryJsonUnmarshaller();
        return instance;
    }
}
