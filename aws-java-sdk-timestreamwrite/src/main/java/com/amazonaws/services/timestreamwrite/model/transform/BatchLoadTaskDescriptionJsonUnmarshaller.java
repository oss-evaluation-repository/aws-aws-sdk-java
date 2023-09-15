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
package com.amazonaws.services.timestreamwrite.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.timestreamwrite.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BatchLoadTaskDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchLoadTaskDescriptionJsonUnmarshaller implements Unmarshaller<BatchLoadTaskDescription, JsonUnmarshallerContext> {

    public BatchLoadTaskDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        BatchLoadTaskDescription batchLoadTaskDescription = new BatchLoadTaskDescription();

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
                if (context.testExpression("TaskId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSourceConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setDataSourceConfiguration(DataSourceConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ProgressReport", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setProgressReport(BatchLoadProgressReportJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReportConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setReportConfiguration(ReportConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataModelConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setDataModelConfiguration(DataModelConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TargetDatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setTargetDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetTableName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setTargetTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TaskStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setTaskStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecordVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setRecordVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResumableUntil", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    batchLoadTaskDescription.setResumableUntil(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return batchLoadTaskDescription;
    }

    private static BatchLoadTaskDescriptionJsonUnmarshaller instance;

    public static BatchLoadTaskDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BatchLoadTaskDescriptionJsonUnmarshaller();
        return instance;
    }
}
