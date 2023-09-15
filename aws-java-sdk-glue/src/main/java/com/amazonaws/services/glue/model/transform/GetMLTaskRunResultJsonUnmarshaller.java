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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetMLTaskRunResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMLTaskRunResultJsonUnmarshaller implements Unmarshaller<GetMLTaskRunResult, JsonUnmarshallerContext> {

    public GetMLTaskRunResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetMLTaskRunResult getMLTaskRunResult = new GetMLTaskRunResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getMLTaskRunResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("TransformId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setTransformId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskRunId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setTaskRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setLogGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Properties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setProperties(TaskRunPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ErrorString", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setErrorString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setStartedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setLastModifiedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setCompletedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getMLTaskRunResult.setExecutionTime(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return getMLTaskRunResult;
    }

    private static GetMLTaskRunResultJsonUnmarshaller instance;

    public static GetMLTaskRunResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetMLTaskRunResultJsonUnmarshaller();
        return instance;
    }
}
