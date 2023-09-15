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
 * Job JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobJsonUnmarshaller implements Unmarshaller<Job, JsonUnmarshallerContext> {

    public Job unmarshall(JsonUnmarshallerContext context) throws Exception {
        Job job = new Job();

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
                if (context.testExpression("AccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreateDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setCreateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DatasetName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setDatasetName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionKeyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setEncryptionKeyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setEncryptionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setLastModifiedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LogSubscription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setLogSubscription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setMaxCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxRetries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setMaxRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Outputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setOutputs(new ListUnmarshaller<Output>(OutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DataCatalogOutputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setDataCatalogOutputs(new ListUnmarshaller<DataCatalogOutput>(DataCatalogOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("DatabaseOutputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setDatabaseOutputs(new ListUnmarshaller<DatabaseOutput>(DatabaseOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProjectName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecipeReference", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setRecipeReference(RecipeReferenceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResourceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setResourceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("JobSample", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setJobSample(JobSampleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ValidationConfigurations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    job.setValidationConfigurations(new ListUnmarshaller<ValidationConfiguration>(ValidationConfigurationJsonUnmarshaller.getInstance())

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

        return job;
    }

    private static JobJsonUnmarshaller instance;

    public static JobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonUnmarshaller();
        return instance;
    }
}
