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
package com.amazonaws.services.appflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeFlowResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFlowResultJsonUnmarshaller implements Unmarshaller<DescribeFlowResult, JsonUnmarshallerContext> {

    public DescribeFlowResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeFlowResult describeFlowResult = new DescribeFlowResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeFlowResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("flowArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setFlowArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flowName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setFlowName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setKmsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flowStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setFlowStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flowStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setFlowStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceFlowConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setSourceFlowConfig(SourceFlowConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("destinationFlowConfigList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setDestinationFlowConfigList(new ListUnmarshaller<DestinationFlowConfig>(DestinationFlowConfigJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lastRunExecutionDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setLastRunExecutionDetails(ExecutionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("triggerConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setTriggerConfig(TriggerConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tasks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setTasks(new ListUnmarshaller<Task>(TaskJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setLastUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult
                            .setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("metadataCatalogConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setMetadataCatalogConfig(MetadataCatalogConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastRunMetadataCatalogDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setLastRunMetadataCatalogDetails(new ListUnmarshaller<MetadataCatalogDetail>(MetadataCatalogDetailJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("schemaVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeFlowResult.setSchemaVersion(context.getUnmarshaller(Long.class).unmarshall(context));
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

        return describeFlowResult;
    }

    private static DescribeFlowResultJsonUnmarshaller instance;

    public static DescribeFlowResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeFlowResultJsonUnmarshaller();
        return instance;
    }
}
