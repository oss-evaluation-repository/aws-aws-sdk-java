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
 * ReportJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportJobJsonUnmarshaller implements Unmarshaller<ReportJob, JsonUnmarshallerContext> {

    public ReportJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        ReportJob reportJob = new ReportJob();

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
                if (context.testExpression("ReportJobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportJob.setReportJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportPlanArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportJob.setReportPlanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportTemplate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportJob.setReportTemplate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportJob.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportJob.setCompletionTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportJob.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportJob.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportDestination", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    reportJob.setReportDestination(ReportDestinationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return reportJob;
    }

    private static ReportJobJsonUnmarshaller instance;

    public static ReportJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReportJobJsonUnmarshaller();
        return instance;
    }
}
