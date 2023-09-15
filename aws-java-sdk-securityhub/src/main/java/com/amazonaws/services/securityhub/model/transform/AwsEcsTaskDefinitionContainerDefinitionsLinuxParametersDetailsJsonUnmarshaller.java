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
 * AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails, JsonUnmarshallerContext> {

    public AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails = new AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails();

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
                if (context.testExpression("Capabilities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails
                            .setCapabilities(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersCapabilitiesDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("Devices", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails
                            .setDevices(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDevicesDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("InitProcessEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.setInitProcessEnabled(context.getUnmarshaller(Boolean.class).unmarshall(
                            context));
                }
                if (context.testExpression("MaxSwap", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.setMaxSwap(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SharedMemorySize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.setSharedMemorySize(context.getUnmarshaller(Integer.class).unmarshall(
                            context));
                }
                if (context.testExpression("Swappiness", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails.setSwappiness(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Tmpfs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails
                            .setTmpfs(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersTmpfsDetailsJsonUnmarshaller.getInstance())

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

        return awsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetails;
    }

    private static AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsJsonUnmarshaller instance;

    public static AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsJsonUnmarshaller();
        return instance;
    }
}
