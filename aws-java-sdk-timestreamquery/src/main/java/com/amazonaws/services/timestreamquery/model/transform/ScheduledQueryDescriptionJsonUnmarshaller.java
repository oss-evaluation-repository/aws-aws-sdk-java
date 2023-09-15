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
package com.amazonaws.services.timestreamquery.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamquery.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScheduledQueryDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledQueryDescriptionJsonUnmarshaller implements Unmarshaller<ScheduledQueryDescription, JsonUnmarshallerContext> {

    public ScheduledQueryDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduledQueryDescription scheduledQueryDescription = new ScheduledQueryDescription();

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
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryString", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setQueryString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreviousInvocationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setPreviousInvocationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("NextInvocationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setNextInvocationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ScheduleConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setScheduleConfiguration(ScheduleConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NotificationConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setNotificationConfiguration(NotificationConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TargetConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setTargetConfiguration(TargetConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ScheduledQueryExecutionRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setScheduledQueryExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorReportConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setErrorReportConfiguration(ErrorReportConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastRunSummary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setLastRunSummary(ScheduledQueryRunSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RecentlyFailedRuns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    scheduledQueryDescription.setRecentlyFailedRuns(new ListUnmarshaller<ScheduledQueryRunSummary>(ScheduledQueryRunSummaryJsonUnmarshaller
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

        return scheduledQueryDescription;
    }

    private static ScheduledQueryDescriptionJsonUnmarshaller instance;

    public static ScheduledQueryDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledQueryDescriptionJsonUnmarshaller();
        return instance;
    }
}
