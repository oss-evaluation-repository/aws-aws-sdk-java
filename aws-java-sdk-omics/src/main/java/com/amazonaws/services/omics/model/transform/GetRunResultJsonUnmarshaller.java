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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetRunResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRunResultJsonUnmarshaller implements Unmarshaller<GetRunResult, JsonUnmarshallerContext> {

    public GetRunResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRunResult getRunResult = new GetRunResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRunResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setWorkflowId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workflowType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setWorkflowType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setRunGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("priority", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("definition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setDefinition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("digest", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setDigest(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storageCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setStorageCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("outputUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setOutputUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setLogLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceDigests", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setResourceDigests(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("startedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setStartedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setStartTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("stopTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setStopTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("accelerators", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setAccelerators(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("retentionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getRunResult.setRetentionMode(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getRunResult;
    }

    private static GetRunResultJsonUnmarshaller instance;

    public static GetRunResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRunResultJsonUnmarshaller();
        return instance;
    }
}
