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
 * AmazonopensearchserviceDestinationUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonopensearchserviceDestinationUpdateJsonUnmarshaller implements
        Unmarshaller<AmazonopensearchserviceDestinationUpdate, JsonUnmarshallerContext> {

    public AmazonopensearchserviceDestinationUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AmazonopensearchserviceDestinationUpdate amazonopensearchserviceDestinationUpdate = new AmazonopensearchserviceDestinationUpdate();

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
                    amazonopensearchserviceDestinationUpdate.setRoleARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setDomainARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClusterEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setClusterEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setIndexName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TypeName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexRotationPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setIndexRotationPeriod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BufferingHints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setBufferingHints(AmazonopensearchserviceBufferingHintsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("RetryOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setRetryOptions(AmazonopensearchserviceRetryOptionsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("S3Update", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setS3Update(S3DestinationUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProcessingConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setProcessingConfiguration(ProcessingConfigurationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("CloudWatchLoggingOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setCloudWatchLoggingOptions(CloudWatchLoggingOptionsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("DocumentIdOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    amazonopensearchserviceDestinationUpdate.setDocumentIdOptions(DocumentIdOptionsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return amazonopensearchserviceDestinationUpdate;
    }

    private static AmazonopensearchserviceDestinationUpdateJsonUnmarshaller instance;

    public static AmazonopensearchserviceDestinationUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AmazonopensearchserviceDestinationUpdateJsonUnmarshaller();
        return instance;
    }
}
