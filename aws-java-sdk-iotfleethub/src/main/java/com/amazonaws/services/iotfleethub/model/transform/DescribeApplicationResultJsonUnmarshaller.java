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
package com.amazonaws.services.iotfleethub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleethub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeApplicationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeApplicationResultJsonUnmarshaller implements Unmarshaller<DescribeApplicationResult, JsonUnmarshallerContext> {

    public DescribeApplicationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeApplicationResult describeApplicationResult = new DescribeApplicationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeApplicationResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setApplicationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setApplicationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setApplicationDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setApplicationUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setApplicationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("applicationCreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setApplicationCreationDate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("applicationLastUpdateDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setApplicationLastUpdateDate(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ssoClientId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setSsoClientId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeApplicationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return describeApplicationResult;
    }

    private static DescribeApplicationResultJsonUnmarshaller instance;

    public static DescribeApplicationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeApplicationResultJsonUnmarshaller();
        return instance;
    }
}
