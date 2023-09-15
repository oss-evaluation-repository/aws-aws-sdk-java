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
package com.amazonaws.services.greengrassv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.greengrassv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDeploymentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDeploymentResultJsonUnmarshaller implements Unmarshaller<GetDeploymentResult, JsonUnmarshallerContext> {

    public GetDeploymentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDeploymentResult getDeploymentResult = new GetDeploymentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDeploymentResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("targetArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setTargetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("revisionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setDeploymentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setDeploymentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deploymentStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setDeploymentStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iotJobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setIotJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("iotJobArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setIotJobArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("components", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setComponents(new MapUnmarshaller<String, ComponentDeploymentSpecification>(context.getUnmarshaller(String.class),
                            ComponentDeploymentSpecificationJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("deploymentPolicies", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setDeploymentPolicies(DeploymentPoliciesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("iotJobConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setIotJobConfiguration(DeploymentIoTJobConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("isLatestForTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setIsLatestForTarget(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("parentTargetArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setParentTargetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDeploymentResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

        return getDeploymentResult;
    }

    private static GetDeploymentResultJsonUnmarshaller instance;

    public static GetDeploymentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDeploymentResultJsonUnmarshaller();
        return instance;
    }
}
