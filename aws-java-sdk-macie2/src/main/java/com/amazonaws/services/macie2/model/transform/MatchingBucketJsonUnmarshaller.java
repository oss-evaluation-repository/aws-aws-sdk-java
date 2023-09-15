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
package com.amazonaws.services.macie2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MatchingBucket JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchingBucketJsonUnmarshaller implements Unmarshaller<MatchingBucket, JsonUnmarshallerContext> {

    public MatchingBucket unmarshall(JsonUnmarshallerContext context) throws Exception {
        MatchingBucket matchingBucket = new MatchingBucket();

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
                if (context.testExpression("accountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bucketName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("classifiableObjectCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setClassifiableObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("classifiableSizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setClassifiableSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("errorCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setJobDetails(JobDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastAutomatedDiscoveryTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setLastAutomatedDiscoveryTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("objectCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("objectCountByEncryptionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setObjectCountByEncryptionType(ObjectCountByEncryptionTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sensitivityScore", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setSensitivityScore(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("sizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("sizeInBytesCompressed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setSizeInBytesCompressed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setUnclassifiableObjectCount(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectSizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchingBucket.setUnclassifiableObjectSizeInBytes(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return matchingBucket;
    }

    private static MatchingBucketJsonUnmarshaller instance;

    public static MatchingBucketJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MatchingBucketJsonUnmarshaller();
        return instance;
    }
}
