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
package com.amazonaws.services.mq.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeConfigurationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeConfigurationResultJsonUnmarshaller implements Unmarshaller<DescribeConfigurationResult, JsonUnmarshallerContext> {

    public DescribeConfigurationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeConfigurationResult describeConfigurationResult = new DescribeConfigurationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeConfigurationResult;
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
                    describeConfigurationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authenticationStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeConfigurationResult.setAuthenticationStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("created", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeConfigurationResult.setCreated(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeConfigurationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeConfigurationResult.setEngineType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeConfigurationResult.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeConfigurationResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestRevision", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeConfigurationResult.setLatestRevision(ConfigurationRevisionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeConfigurationResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeConfigurationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return describeConfigurationResult;
    }

    private static DescribeConfigurationResultJsonUnmarshaller instance;

    public static DescribeConfigurationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeConfigurationResultJsonUnmarshaller();
        return instance;
    }
}
