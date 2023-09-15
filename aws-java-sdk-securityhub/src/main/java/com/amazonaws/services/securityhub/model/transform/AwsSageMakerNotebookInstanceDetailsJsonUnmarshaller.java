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
 * AwsSageMakerNotebookInstanceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSageMakerNotebookInstanceDetailsJsonUnmarshaller implements Unmarshaller<AwsSageMakerNotebookInstanceDetails, JsonUnmarshallerContext> {

    public AwsSageMakerNotebookInstanceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsSageMakerNotebookInstanceDetails awsSageMakerNotebookInstanceDetails = new AwsSageMakerNotebookInstanceDetails();

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
                if (context.testExpression("AcceleratorTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setAcceleratorTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AdditionalCodeRepositories", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setAdditionalCodeRepositories(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DefaultCodeRepository", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setDefaultCodeRepository(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DirectInternetAccess", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setDirectInternetAccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceMetadataServiceConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails
                            .setInstanceMetadataServiceConfiguration(AwsSageMakerNotebookInstanceMetadataServiceConfigurationDetailsJsonUnmarshaller
                                    .getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkInterfaceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNetworkInterfaceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNotebookInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceLifecycleConfigName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNotebookInstanceLifecycleConfigName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNotebookInstanceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotebookInstanceStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setNotebookInstanceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setPlatformIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RootAccess", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setRootAccess(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumeSizeInGB", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSageMakerNotebookInstanceDetails.setVolumeSizeInGB(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return awsSageMakerNotebookInstanceDetails;
    }

    private static AwsSageMakerNotebookInstanceDetailsJsonUnmarshaller instance;

    public static AwsSageMakerNotebookInstanceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsSageMakerNotebookInstanceDetailsJsonUnmarshaller();
        return instance;
    }
}
