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
 * AwsEcsTaskDefinitionDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionDetailsJsonUnmarshaller implements Unmarshaller<AwsEcsTaskDefinitionDetails, JsonUnmarshallerContext> {

    public AwsEcsTaskDefinitionDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEcsTaskDefinitionDetails awsEcsTaskDefinitionDetails = new AwsEcsTaskDefinitionDetails();

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
                if (context.testExpression("ContainerDefinitions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setContainerDefinitions(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsDetails>(
                            AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Cpu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setCpu(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Family", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setFamily(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InferenceAccelerators", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setInferenceAccelerators(new ListUnmarshaller<AwsEcsTaskDefinitionInferenceAcceleratorsDetails>(
                            AwsEcsTaskDefinitionInferenceAcceleratorsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IpcMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setIpcMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Memory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setMemory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setNetworkMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PidMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setPidMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlacementConstraints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setPlacementConstraints(new ListUnmarshaller<AwsEcsTaskDefinitionPlacementConstraintsDetails>(
                            AwsEcsTaskDefinitionPlacementConstraintsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProxyConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setProxyConfiguration(AwsEcsTaskDefinitionProxyConfigurationDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("RequiresCompatibilities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setRequiresCompatibilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("TaskRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setTaskRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Volumes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionDetails.setVolumes(new ListUnmarshaller<AwsEcsTaskDefinitionVolumesDetails>(
                            AwsEcsTaskDefinitionVolumesDetailsJsonUnmarshaller.getInstance())

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

        return awsEcsTaskDefinitionDetails;
    }

    private static AwsEcsTaskDefinitionDetailsJsonUnmarshaller instance;

    public static AwsEcsTaskDefinitionDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEcsTaskDefinitionDetailsJsonUnmarshaller();
        return instance;
    }
}
