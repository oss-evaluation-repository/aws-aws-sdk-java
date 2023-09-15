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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeIndexResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeIndexResultJsonUnmarshaller implements Unmarshaller<DescribeIndexResult, JsonUnmarshallerContext> {

    public DescribeIndexResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeIndexResult describeIndexResult = new DescribeIndexResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeIndexResult;
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
                    describeIndexResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Edition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setEdition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerSideEncryptionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setServerSideEncryptionConfiguration(ServerSideEncryptionConfigurationJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DocumentMetadataConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setDocumentMetadataConfigurations(new ListUnmarshaller<DocumentMetadataConfiguration>(
                            DocumentMetadataConfigurationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IndexStatistics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setIndexStatistics(IndexStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CapacityUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setCapacityUnits(CapacityUnitsConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("UserTokenConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setUserTokenConfigurations(new ListUnmarshaller<UserTokenConfiguration>(UserTokenConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserContextPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setUserContextPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserGroupResolutionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeIndexResult.setUserGroupResolutionConfiguration(UserGroupResolutionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeIndexResult;
    }

    private static DescribeIndexResultJsonUnmarshaller instance;

    public static DescribeIndexResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeIndexResultJsonUnmarshaller();
        return instance;
    }
}
