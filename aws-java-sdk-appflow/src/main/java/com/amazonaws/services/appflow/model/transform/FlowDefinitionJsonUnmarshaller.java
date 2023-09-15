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
 * FlowDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FlowDefinitionJsonUnmarshaller implements Unmarshaller<FlowDefinition, JsonUnmarshallerContext> {

    public FlowDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        FlowDefinition flowDefinition = new FlowDefinition();

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
                if (context.testExpression("flowArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setFlowArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flowName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setFlowName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("flowStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setFlowStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceConnectorType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setSourceConnectorType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceConnectorLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setSourceConnectorLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationConnectorType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setDestinationConnectorType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationConnectorLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setDestinationConnectorLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("triggerType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setTriggerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setCreatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setLastUpdatedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("lastRunExecutionDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    flowDefinition.setLastRunExecutionDetails(ExecutionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return flowDefinition;
    }

    private static FlowDefinitionJsonUnmarshaller instance;

    public static FlowDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FlowDefinitionJsonUnmarshaller();
        return instance;
    }
}
