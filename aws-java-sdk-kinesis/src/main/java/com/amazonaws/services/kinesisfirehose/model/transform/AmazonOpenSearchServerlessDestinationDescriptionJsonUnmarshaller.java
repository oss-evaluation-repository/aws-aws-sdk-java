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
package com.amazonaws.services.kinesisfirehose.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AmazonOpenSearchServerlessDestinationDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonOpenSearchServerlessDestinationDescriptionJsonUnmarshaller implements
        Unmarshaller<AmazonOpenSearchServerlessDestinationDescription, JsonUnmarshallerContext> {

    public AmazonOpenSearchServerlessDestinationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AmazonOpenSearchServerlessDestinationDescription amazonOpenSearchServerlessDestinationDescription = new AmazonOpenSearchServerlessDestinationDescription();

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
                if (context.testExpression("RoleARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CollectionEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setCollectionEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setIndexName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BufferingHints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setBufferingHints(AmazonOpenSearchServerlessBufferingHintsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setRetryOptions(AmazonOpenSearchServerlessRetryOptionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("S3BackupMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setS3BackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3DestinationDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setS3DestinationDescription(S3DestinationDescriptionJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("VpcConfigurationDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonOpenSearchServerlessDestinationDescription.setVpcConfigurationDescription(VpcConfigurationDescriptionJsonUnmarshaller.getInstance()
                            .unmarshall(context));
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

        return amazonOpenSearchServerlessDestinationDescription;
    }

    private static AmazonOpenSearchServerlessDestinationDescriptionJsonUnmarshaller instance;

    public static AmazonOpenSearchServerlessDestinationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AmazonOpenSearchServerlessDestinationDescriptionJsonUnmarshaller();
        return instance;
    }
}
