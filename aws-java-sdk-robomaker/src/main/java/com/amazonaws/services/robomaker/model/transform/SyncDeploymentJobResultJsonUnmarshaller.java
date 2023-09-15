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
package com.amazonaws.services.robomaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SyncDeploymentJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncDeploymentJobResultJsonUnmarshaller implements Unmarshaller<SyncDeploymentJobResult, JsonUnmarshallerContext> {

    public SyncDeploymentJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SyncDeploymentJobResult syncDeploymentJobResult = new SyncDeploymentJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return syncDeploymentJobResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    syncDeploymentJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fleet", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    syncDeploymentJobResult.setFleet(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    syncDeploymentJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    syncDeploymentJobResult.setDeploymentConfig(DeploymentConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("deploymentApplicationConfigs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    syncDeploymentJobResult.setDeploymentApplicationConfigs(new ListUnmarshaller<DeploymentApplicationConfig>(
                            DeploymentApplicationConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    syncDeploymentJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    syncDeploymentJobResult.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    syncDeploymentJobResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return syncDeploymentJobResult;
    }

    private static SyncDeploymentJobResultJsonUnmarshaller instance;

    public static SyncDeploymentJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SyncDeploymentJobResultJsonUnmarshaller();
        return instance;
    }
}
