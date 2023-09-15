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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAuditTaskResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAuditTaskResultJsonUnmarshaller implements Unmarshaller<DescribeAuditTaskResult, JsonUnmarshallerContext> {

    public DescribeAuditTaskResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAuditTaskResult describeAuditTaskResult = new DescribeAuditTaskResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAuditTaskResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("taskStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAuditTaskResult.setTaskStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAuditTaskResult.setTaskType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAuditTaskResult.setTaskStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("taskStatistics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAuditTaskResult.setTaskStatistics(TaskStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scheduledAuditName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAuditTaskResult.setScheduledAuditName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("auditDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAuditTaskResult.setAuditDetails(new MapUnmarshaller<String, AuditCheckDetails>(context.getUnmarshaller(String.class),
                            AuditCheckDetailsJsonUnmarshaller.getInstance()).unmarshall(context));
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

        return describeAuditTaskResult;
    }

    private static DescribeAuditTaskResultJsonUnmarshaller instance;

    public static DescribeAuditTaskResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAuditTaskResultJsonUnmarshaller();
        return instance;
    }
}
