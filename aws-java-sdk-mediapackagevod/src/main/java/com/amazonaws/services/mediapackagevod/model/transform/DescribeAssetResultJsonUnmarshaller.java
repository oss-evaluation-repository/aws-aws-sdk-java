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
package com.amazonaws.services.mediapackagevod.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackagevod.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAssetResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAssetResultJsonUnmarshaller implements Unmarshaller<DescribeAssetResult, JsonUnmarshallerContext> {

    public DescribeAssetResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAssetResult describeAssetResult = new DescribeAssetResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAssetResult;
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
                    describeAssetResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAssetResult.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("egressEndpoints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAssetResult.setEgressEndpoints(new ListUnmarshaller<EgressEndpoint>(EgressEndpointJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAssetResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("packagingGroupId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAssetResult.setPackagingGroupId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAssetResult.setResourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAssetResult.setSourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAssetResult.setSourceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeAssetResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
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

        return describeAssetResult;
    }

    private static DescribeAssetResultJsonUnmarshaller instance;

    public static DescribeAssetResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAssetResultJsonUnmarshaller();
        return instance;
    }
}
