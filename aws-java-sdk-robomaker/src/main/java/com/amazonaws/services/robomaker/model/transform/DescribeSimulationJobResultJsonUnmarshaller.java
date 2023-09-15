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
package com.amazonaws.services.robomaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeSimulationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSimulationJobResultJsonUnmarshaller implements Unmarshaller<DescribeSimulationJobResult, JsonUnmarshallerContext> {

    public DescribeSimulationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeSimulationJobResult describeSimulationJobResult = new DescribeSimulationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeSimulationJobResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastStartedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setLastStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("failureBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setFailureBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loggingConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setLoggingConfig(LoggingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("maxJobDurationInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setMaxJobDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("simulationTimeMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setSimulationTimeMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("iamRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("robotApplications", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setRobotApplications(new ListUnmarshaller<RobotApplicationConfig>(RobotApplicationConfigJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("simulationApplications", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setSimulationApplications(new ListUnmarshaller<SimulationApplicationConfig>(
                            SimulationApplicationConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dataSources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setDataSources(new ListUnmarshaller<DataSource>(DataSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setVpcConfig(VPCConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("networkInterface", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setNetworkInterface(NetworkInterfaceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("compute", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeSimulationJobResult.setCompute(ComputeResponseJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeSimulationJobResult;
    }

    private static DescribeSimulationJobResultJsonUnmarshaller instance;

    public static DescribeSimulationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeSimulationJobResultJsonUnmarshaller();
        return instance;
    }
}
