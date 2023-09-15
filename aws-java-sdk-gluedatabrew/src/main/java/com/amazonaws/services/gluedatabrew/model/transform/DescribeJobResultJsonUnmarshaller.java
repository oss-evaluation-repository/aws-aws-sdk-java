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
package com.amazonaws.services.gluedatabrew.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gluedatabrew.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobResultJsonUnmarshaller implements Unmarshaller<DescribeJobResult, JsonUnmarshallerContext> {

    public DescribeJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeJobResult describeJobResult = new DescribeJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeJobResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("CreateDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setCreateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setDatasetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setEncryptionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LogSubscription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setLogSubscription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setMaxCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxRetries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setMaxRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setOutputs(new ListUnmarshaller<Output>(OutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataCatalogOutputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setDataCatalogOutputs(new ListUnmarshaller<DataCatalogOutput>(DataCatalogOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DatabaseOutputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setDatabaseOutputs(new ListUnmarshaller<DatabaseOutput>(DatabaseOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProjectName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProfileConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setProfileConfiguration(ProfileConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ValidationConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setValidationConfigurations(new ListUnmarshaller<ValidationConfiguration>(ValidationConfigurationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RecipeReference", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setRecipeReference(RecipeReferenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("JobSample", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeJobResult.setJobSample(JobSampleJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeJobResult;
    }

    private static DescribeJobResultJsonUnmarshaller instance;

    public static DescribeJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeJobResultJsonUnmarshaller();
        return instance;
    }
}
