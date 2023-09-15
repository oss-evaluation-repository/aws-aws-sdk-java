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
package com.amazonaws.services.backup.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ReportPlan JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportPlanJsonUnmarshaller implements Unmarshaller<ReportPlan, JsonUnmarshallerContext> {

    public ReportPlan unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReportPlan reportPlan = new ReportPlan();

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
                if (context.testExpression("ReportPlanArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportPlan.setReportPlanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportPlanName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportPlan.setReportPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportPlanDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportPlan.setReportPlanDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportPlan.setReportSetting(ReportSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReportDeliveryChannel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportPlan.setReportDeliveryChannel(ReportDeliveryChannelJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DeploymentStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportPlan.setDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportPlan.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastAttemptedExecutionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportPlan.setLastAttemptedExecutionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulExecutionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportPlan.setLastSuccessfulExecutionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return reportPlan;
    }

    private static ReportPlanJsonUnmarshaller instance;

    public static ReportPlanJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportPlanJsonUnmarshaller();
        return instance;
    }
}
