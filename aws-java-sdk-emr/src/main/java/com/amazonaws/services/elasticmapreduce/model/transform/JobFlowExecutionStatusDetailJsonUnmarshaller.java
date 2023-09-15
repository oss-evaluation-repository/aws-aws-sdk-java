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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobFlowExecutionStatusDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobFlowExecutionStatusDetailJsonUnmarshaller implements Unmarshaller<JobFlowExecutionStatusDetail, JsonUnmarshallerContext> {

    public JobFlowExecutionStatusDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobFlowExecutionStatusDetail jobFlowExecutionStatusDetail = new JobFlowExecutionStatusDetail();

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
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowExecutionStatusDetail.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowExecutionStatusDetail.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowExecutionStatusDetail.setStartDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ReadyDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowExecutionStatusDetail.setReadyDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowExecutionStatusDetail.setEndDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastStateChangeReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowExecutionStatusDetail.setLastStateChangeReason(context.getUnmarshaller(String.class).unmarshall(context));
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

        return jobFlowExecutionStatusDetail;
    }

    private static JobFlowExecutionStatusDetailJsonUnmarshaller instance;

    public static JobFlowExecutionStatusDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowExecutionStatusDetailJsonUnmarshaller();
        return instance;
    }
}
