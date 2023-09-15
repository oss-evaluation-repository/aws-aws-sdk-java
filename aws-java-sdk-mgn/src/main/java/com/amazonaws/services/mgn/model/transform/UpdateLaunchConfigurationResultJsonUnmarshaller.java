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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateLaunchConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLaunchConfigurationResultJsonUnmarshaller implements Unmarshaller<UpdateLaunchConfigurationResult, JsonUnmarshallerContext> {

    public UpdateLaunchConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateLaunchConfigurationResult updateLaunchConfigurationResult = new UpdateLaunchConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateLaunchConfigurationResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("bootMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setBootMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("copyPrivateIp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setCopyPrivateIp(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("copyTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setCopyTags(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ec2LaunchTemplateID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setEc2LaunchTemplateID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableMapAutoTagging", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setEnableMapAutoTagging(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("launchDisposition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setLaunchDisposition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("licensing", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setLicensing(LicensingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("mapAutoTaggingMpeID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setMapAutoTaggingMpeID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("postLaunchActions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setPostLaunchActions(PostLaunchActionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceServerID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setSourceServerID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetInstanceTypeRightSizingMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateLaunchConfigurationResult.setTargetInstanceTypeRightSizingMethod(context.getUnmarshaller(String.class).unmarshall(context));
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

        return updateLaunchConfigurationResult;
    }

    private static UpdateLaunchConfigurationResultJsonUnmarshaller instance;

    public static UpdateLaunchConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateLaunchConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
