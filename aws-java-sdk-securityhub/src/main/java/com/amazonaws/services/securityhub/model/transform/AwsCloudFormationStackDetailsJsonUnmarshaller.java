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
 * AwsCloudFormationStackDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFormationStackDetailsJsonUnmarshaller implements Unmarshaller<AwsCloudFormationStackDetails, JsonUnmarshallerContext> {

    public AwsCloudFormationStackDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsCloudFormationStackDetails awsCloudFormationStackDetails = new AwsCloudFormationStackDetails();

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
                    awsCloudFormationStackDetails.setCapabilities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setCreationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisableRollback", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setDisableRollback(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DriftInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setDriftInformation(AwsCloudFormationStackDriftInformationDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("EnableTerminationProtection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setEnableTerminationProtection(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setLastUpdatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationArns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setNotificationArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setOutputs(new ListUnmarshaller<AwsCloudFormationStackOutputsDetails>(
                            AwsCloudFormationStackOutputsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setStackId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setStackName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setStackStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StackStatusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setStackStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeoutInMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsCloudFormationStackDetails.setTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return awsCloudFormationStackDetails;
    }

    private static AwsCloudFormationStackDetailsJsonUnmarshaller instance;

    public static AwsCloudFormationStackDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudFormationStackDetailsJsonUnmarshaller();
        return instance;
    }
}
