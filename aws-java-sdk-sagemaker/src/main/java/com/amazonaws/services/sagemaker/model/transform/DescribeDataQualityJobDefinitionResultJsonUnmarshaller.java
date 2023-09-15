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
 * DescribeDataQualityJobDefinitionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDataQualityJobDefinitionResultJsonUnmarshaller implements Unmarshaller<DescribeDataQualityJobDefinitionResult, JsonUnmarshallerContext> {

    public DescribeDataQualityJobDefinitionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDataQualityJobDefinitionResult describeDataQualityJobDefinitionResult = new DescribeDataQualityJobDefinitionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDataQualityJobDefinitionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("JobDefinitionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setJobDefinitionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("JobDefinitionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setJobDefinitionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DataQualityBaselineConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setDataQualityBaselineConfig(DataQualityBaselineConfigJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("DataQualityAppSpecification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setDataQualityAppSpecification(DataQualityAppSpecificationJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("DataQualityJobInput", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setDataQualityJobInput(DataQualityJobInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataQualityJobOutputConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setDataQualityJobOutputConfig(MonitoringOutputConfigJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("JobResources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setJobResources(MonitoringResourcesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NetworkConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setNetworkConfig(MonitoringNetworkConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StoppingCondition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDataQualityJobDefinitionResult.setStoppingCondition(MonitoringStoppingConditionJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeDataQualityJobDefinitionResult;
    }

    private static DescribeDataQualityJobDefinitionResultJsonUnmarshaller instance;

    public static DescribeDataQualityJobDefinitionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDataQualityJobDefinitionResultJsonUnmarshaller();
        return instance;
    }
}
