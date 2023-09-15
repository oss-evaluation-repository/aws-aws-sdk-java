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
 * DescribeDataSourceResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataSourceResultJsonUnmarshaller implements Unmarshaller<DescribeDataSourceResult, JsonUnmarshallerContext> {

    public DescribeDataSourceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDataSourceResult describeDataSourceResult = new DescribeDataSourceResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDataSourceResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IndexId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setIndexId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Configuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setConfiguration(DataSourceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LanguageCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setLanguageCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomDocumentEnrichmentConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataSourceResult.setCustomDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfigurationJsonUnmarshaller.getInstance()
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

        return describeDataSourceResult;
    }

    private static DescribeDataSourceResultJsonUnmarshaller instance;

    public static DescribeDataSourceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDataSourceResultJsonUnmarshaller();
        return instance;
    }
}
