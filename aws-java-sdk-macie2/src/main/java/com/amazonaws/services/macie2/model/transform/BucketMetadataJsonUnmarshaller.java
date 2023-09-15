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
 * BucketMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketMetadataJsonUnmarshaller implements Unmarshaller<BucketMetadata, JsonUnmarshallerContext> {

    public BucketMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        BucketMetadata bucketMetadata = new BucketMetadata();

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
                    bucketMetadata.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("allowsUnencryptedObjectUploads", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setAllowsUnencryptedObjectUploads(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bucketArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setBucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bucketCreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setBucketCreatedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("bucketName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setBucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("classifiableObjectCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setClassifiableObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("classifiableSizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setClassifiableSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("errorCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setErrorCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setJobDetails(JobDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastAutomatedDiscoveryTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setLastAutomatedDiscoveryTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("lastUpdated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("objectCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setObjectCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("objectCountByEncryptionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setObjectCountByEncryptionType(ObjectCountByEncryptionTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("publicAccess", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setPublicAccess(BucketPublicAccessJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setReplicationDetails(ReplicationDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sensitivityScore", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setSensitivityScore(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("serverSideEncryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setServerSideEncryption(BucketServerSideEncryptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sharedAccess", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setSharedAccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setSizeInBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("sizeInBytesCompressed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setSizeInBytesCompressed(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setTags(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setUnclassifiableObjectCount(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("unclassifiableObjectSizeInBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setUnclassifiableObjectSizeInBytes(ObjectLevelStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("versioning", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    bucketMetadata.setVersioning(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return bucketMetadata;
    }

    private static BucketMetadataJsonUnmarshaller instance;

    public static BucketMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BucketMetadataJsonUnmarshaller();
        return instance;
    }
}
