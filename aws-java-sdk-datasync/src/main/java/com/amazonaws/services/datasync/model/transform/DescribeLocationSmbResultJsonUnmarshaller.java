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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeLocationSmbResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeLocationSmbResultJsonUnmarshaller implements Unmarshaller<DescribeLocationSmbResult, JsonUnmarshallerContext> {

    public DescribeLocationSmbResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeLocationSmbResult describeLocationSmbResult = new DescribeLocationSmbResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeLocationSmbResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("LocationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeLocationSmbResult.setLocationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeLocationSmbResult.setLocationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AgentArns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeLocationSmbResult.setAgentArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("User", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeLocationSmbResult.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Domain", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeLocationSmbResult.setDomain(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MountOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeLocationSmbResult.setMountOptions(SmbMountOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeLocationSmbResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return describeLocationSmbResult;
    }

    private static DescribeLocationSmbResultJsonUnmarshaller instance;

    public static DescribeLocationSmbResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeLocationSmbResultJsonUnmarshaller();
        return instance;
    }
}
