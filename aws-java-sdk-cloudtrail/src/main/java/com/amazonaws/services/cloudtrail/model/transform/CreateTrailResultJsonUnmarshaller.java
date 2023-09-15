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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateTrailResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTrailResultJsonUnmarshaller implements Unmarshaller<CreateTrailResult, JsonUnmarshallerContext> {

    public CreateTrailResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateTrailResult createTrailResult = new CreateTrailResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createTrailResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3KeyPrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setS3KeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setSnsTopicName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setSnsTopicARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IncludeGlobalServiceEvents", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setIncludeGlobalServiceEvents(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IsMultiRegionTrail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setIsMultiRegionTrail(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TrailARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setTrailARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogFileValidationEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setLogFileValidationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogsLogGroupArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setCloudWatchLogsLogGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogsRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setCloudWatchLogsRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsOrganizationTrail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createTrailResult.setIsOrganizationTrail(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return createTrailResult;
    }

    private static CreateTrailResultJsonUnmarshaller instance;

    public static CreateTrailResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateTrailResultJsonUnmarshaller();
        return instance;
    }
}
