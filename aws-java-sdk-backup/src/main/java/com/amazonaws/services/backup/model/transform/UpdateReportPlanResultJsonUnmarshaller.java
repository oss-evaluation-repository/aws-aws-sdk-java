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
 * UpdateReportPlanResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateReportPlanResultJsonUnmarshaller implements Unmarshaller<UpdateReportPlanResult, JsonUnmarshallerContext> {

    public UpdateReportPlanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateReportPlanResult updateReportPlanResult = new UpdateReportPlanResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateReportPlanResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ReportPlanName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReportPlanResult.setReportPlanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReportPlanArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReportPlanResult.setReportPlanArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateReportPlanResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return updateReportPlanResult;
    }

    private static UpdateReportPlanResultJsonUnmarshaller instance;

    public static UpdateReportPlanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateReportPlanResultJsonUnmarshaller();
        return instance;
    }
}
