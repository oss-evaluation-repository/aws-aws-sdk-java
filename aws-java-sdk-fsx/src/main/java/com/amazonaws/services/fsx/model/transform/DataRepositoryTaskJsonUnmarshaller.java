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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DataRepositoryTask JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataRepositoryTaskJsonUnmarshaller implements Unmarshaller<DataRepositoryTask, JsonUnmarshallerContext> {

    public DataRepositoryTask unmarshall(JsonUnmarshallerContext context) throws Exception {
        DataRepositoryTask dataRepositoryTask = new DataRepositoryTask();

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
                    dataRepositoryTask.setTaskId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Lifecycle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setLifecycle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResourceARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setResourceARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FileSystemId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setFileSystemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Paths", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setPaths(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("FailureDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setFailureDetails(DataRepositoryTaskFailureDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setStatus(DataRepositoryTaskStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Report", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setReport(CompletionReportJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CapacityToRelease", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setCapacityToRelease(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FileCacheId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setFileCacheId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReleaseConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dataRepositoryTask.setReleaseConfiguration(ReleaseConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return dataRepositoryTask;
    }

    private static DataRepositoryTaskJsonUnmarshaller instance;

    public static DataRepositoryTaskJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DataRepositoryTaskJsonUnmarshaller();
        return instance;
    }
}
