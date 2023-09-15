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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MonitoringJobDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringJobDefinitionJsonUnmarshaller implements Unmarshaller<MonitoringJobDefinition, JsonUnmarshallerContext> {

    public MonitoringJobDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        MonitoringJobDefinition monitoringJobDefinition = new MonitoringJobDefinition();

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
                if (context.testExpression("BaselineConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringJobDefinition.setBaselineConfig(MonitoringBaselineConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MonitoringInputs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringJobDefinition.setMonitoringInputs(new ListUnmarshaller<MonitoringInput>(MonitoringInputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MonitoringOutputConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringJobDefinition.setMonitoringOutputConfig(MonitoringOutputConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MonitoringResources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringJobDefinition.setMonitoringResources(MonitoringResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MonitoringAppSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringJobDefinition.setMonitoringAppSpecification(MonitoringAppSpecificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringJobDefinition.setStoppingCondition(MonitoringStoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringJobDefinition.setEnvironment(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("NetworkConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringJobDefinition.setNetworkConfig(NetworkConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    monitoringJobDefinition.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return monitoringJobDefinition;
    }

    private static MonitoringJobDefinitionJsonUnmarshaller instance;

    public static MonitoringJobDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MonitoringJobDefinitionJsonUnmarshaller();
        return instance;
    }
}
