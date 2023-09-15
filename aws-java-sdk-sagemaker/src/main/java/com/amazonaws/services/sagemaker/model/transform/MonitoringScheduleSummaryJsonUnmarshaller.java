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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MonitoringScheduleSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringScheduleSummaryJsonUnmarshaller implements Unmarshaller<MonitoringScheduleSummary, JsonUnmarshallerContext> {

    public MonitoringScheduleSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        MonitoringScheduleSummary monitoringScheduleSummary = new MonitoringScheduleSummary();

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
                if (context.testExpression("MonitoringScheduleName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringScheduleSummary.setMonitoringScheduleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonitoringScheduleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringScheduleSummary.setMonitoringScheduleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringScheduleSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringScheduleSummary.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MonitoringScheduleStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringScheduleSummary.setMonitoringScheduleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringScheduleSummary.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonitoringJobDefinitionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringScheduleSummary.setMonitoringJobDefinitionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonitoringType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringScheduleSummary.setMonitoringType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return monitoringScheduleSummary;
    }

    private static MonitoringScheduleSummaryJsonUnmarshaller instance;

    public static MonitoringScheduleSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringScheduleSummaryJsonUnmarshaller();
        return instance;
    }
}
