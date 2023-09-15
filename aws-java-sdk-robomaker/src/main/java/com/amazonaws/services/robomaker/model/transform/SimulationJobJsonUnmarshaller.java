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
 * SimulationJob JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationJobJsonUnmarshaller implements Unmarshaller<SimulationJob, JsonUnmarshallerContext> {

    public SimulationJob unmarshall(JsonUnmarshallerContext context) throws Exception {
        SimulationJob simulationJob = new SimulationJob();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastStartedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setLastStartedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("failureBehavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setFailureBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputLocation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setOutputLocation(OutputLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("loggingConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setLoggingConfig(LoggingConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("maxJobDurationInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setMaxJobDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("simulationTimeMillis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setSimulationTimeMillis(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("iamRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("robotApplications", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setRobotApplications(new ListUnmarshaller<RobotApplicationConfig>(RobotApplicationConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("simulationApplications", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setSimulationApplications(new ListUnmarshaller<SimulationApplicationConfig>(SimulationApplicationConfigJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dataSources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setDataSources(new ListUnmarshaller<DataSource>(DataSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setVpcConfig(VPCConfigResponseJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("networkInterface", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setNetworkInterface(NetworkInterfaceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("compute", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    simulationJob.setCompute(ComputeResponseJsonUnmarshaller.getInstance().unmarshall(context));
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

        return simulationJob;
    }

    private static SimulationJobJsonUnmarshaller instance;

    public static SimulationJobJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SimulationJobJsonUnmarshaller();
        return instance;
    }
}
