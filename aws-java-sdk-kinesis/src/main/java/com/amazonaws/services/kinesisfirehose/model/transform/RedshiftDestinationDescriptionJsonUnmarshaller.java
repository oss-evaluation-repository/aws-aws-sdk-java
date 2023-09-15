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
 * RedshiftDestinationDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedshiftDestinationDescriptionJsonUnmarshaller implements Unmarshaller<RedshiftDestinationDescription, JsonUnmarshallerContext> {

    public RedshiftDestinationDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        RedshiftDestinationDescription redshiftDestinationDescription = new RedshiftDestinationDescription();

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
                    redshiftDestinationDescription.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterJDBCURL", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redshiftDestinationDescription.setClusterJDBCURL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CopyCommand", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redshiftDestinationDescription.setCopyCommand(CopyCommandJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redshiftDestinationDescription.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redshiftDestinationDescription.setRetryOptions(RedshiftRetryOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3DestinationDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redshiftDestinationDescription.setS3DestinationDescription(S3DestinationDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redshiftDestinationDescription.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("S3BackupMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redshiftDestinationDescription.setS3BackupMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BackupDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redshiftDestinationDescription.setS3BackupDescription(S3DestinationDescriptionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    redshiftDestinationDescription.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return redshiftDestinationDescription;
    }

    private static RedshiftDestinationDescriptionJsonUnmarshaller instance;

    public static RedshiftDestinationDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RedshiftDestinationDescriptionJsonUnmarshaller();
        return instance;
    }
}
