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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsCloudTrailTrailDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudTrailTrailDetailsJsonUnmarshaller implements Unmarshaller<AwsCloudTrailTrailDetails, JsonUnmarshallerContext> {

    public AwsCloudTrailTrailDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsCloudTrailTrailDetails awsCloudTrailTrailDetails = new AwsCloudTrailTrailDetails();

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
                if (context.testExpression("CloudWatchLogsLogGroupArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setCloudWatchLogsLogGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogsRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setCloudWatchLogsRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HasCustomEventSelectors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setHasCustomEventSelectors(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HomeRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setHomeRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IncludeGlobalServiceEvents", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setIncludeGlobalServiceEvents(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IsMultiRegionTrail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setIsMultiRegionTrail(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("IsOrganizationTrail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setIsOrganizationTrail(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogFileValidationEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setLogFileValidationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3KeyPrefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setS3KeyPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setSnsTopicArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SnsTopicName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setSnsTopicName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TrailArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudTrailTrailDetails.setTrailArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return awsCloudTrailTrailDetails;
    }

    private static AwsCloudTrailTrailDetailsJsonUnmarshaller instance;

    public static AwsCloudTrailTrailDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudTrailTrailDetailsJsonUnmarshaller();
        return instance;
    }
}
