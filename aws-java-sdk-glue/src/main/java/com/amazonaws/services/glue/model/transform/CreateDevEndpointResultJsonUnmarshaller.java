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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateDevEndpointResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDevEndpointResultJsonUnmarshaller implements Unmarshaller<CreateDevEndpointResult, JsonUnmarshallerContext> {

    public CreateDevEndpointResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateDevEndpointResult createDevEndpointResult = new CreateDevEndpointResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createDevEndpointResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("EndpointName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setSecurityGroupIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("YarnEndpointAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setYarnEndpointAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ZeppelinRemoteSparkInterpreterPort", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setZeppelinRemoteSparkInterpreterPort(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfNodes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setNumberOfNodes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WorkerType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setWorkerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlueVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setGlueVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfWorkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setNumberOfWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraPythonLibsS3Path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setExtraPythonLibsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExtraJarsS3Path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setExtraJarsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Arguments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createDevEndpointResult.setArguments(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return createDevEndpointResult;
    }

    private static CreateDevEndpointResultJsonUnmarshaller instance;

    public static CreateDevEndpointResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateDevEndpointResultJsonUnmarshaller();
        return instance;
    }
}
