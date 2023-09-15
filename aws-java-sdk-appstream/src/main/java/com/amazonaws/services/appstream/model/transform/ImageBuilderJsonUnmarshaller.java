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
package com.amazonaws.services.appstream.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImageBuilder JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageBuilderJsonUnmarshaller implements Unmarshaller<ImageBuilder, JsonUnmarshallerContext> {

    public ImageBuilder unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImageBuilder imageBuilder = new ImageBuilder();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setImageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Platform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateChangeReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setStateChangeReason(ImageBuilderStateChangeReasonJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EnableDefaultInternetAccess", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setEnableDefaultInternetAccess(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DomainJoinInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setDomainJoinInfo(DomainJoinInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkAccessConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setNetworkAccessConfiguration(NetworkAccessConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ImageBuilderErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setImageBuilderErrors(new ListUnmarshaller<ResourceError>(ResourceErrorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AppstreamAgentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setAppstreamAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessEndpoints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageBuilder.setAccessEndpoints(new ListUnmarshaller<AccessEndpoint>(AccessEndpointJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return imageBuilder;
    }

    private static ImageBuilderJsonUnmarshaller instance;

    public static ImageBuilderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageBuilderJsonUnmarshaller();
        return instance;
    }
}
