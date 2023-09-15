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
package com.amazonaws.services.panorama.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.panorama.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeApplicationInstanceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationInstanceResultJsonUnmarshaller implements Unmarshaller<DescribeApplicationInstanceResult, JsonUnmarshallerContext> {

    public DescribeApplicationInstanceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeApplicationInstanceResult describeApplicationInstanceResult = new DescribeApplicationInstanceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeApplicationInstanceResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ApplicationInstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setApplicationInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ApplicationInstanceIdToReplace", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setApplicationInstanceIdToReplace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DefaultRuntimeContextDevice", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setDefaultRuntimeContextDevice(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultRuntimeContextDeviceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setDefaultRuntimeContextDeviceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setHealthStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RuntimeContextStates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setRuntimeContextStates(new ListUnmarshaller<ReportedRuntimeContextState>(
                            ReportedRuntimeContextStateJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RuntimeRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setRuntimeRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setStatusDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationInstanceResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return describeApplicationInstanceResult;
    }

    private static DescribeApplicationInstanceResultJsonUnmarshaller instance;

    public static DescribeApplicationInstanceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeApplicationInstanceResultJsonUnmarshaller();
        return instance;
    }
}
