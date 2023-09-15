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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JobFlowInstancesConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobFlowInstancesConfigJsonUnmarshaller implements Unmarshaller<JobFlowInstancesConfig, JsonUnmarshallerContext> {

    public JobFlowInstancesConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        JobFlowInstancesConfig jobFlowInstancesConfig = new JobFlowInstancesConfig();

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
                if (context.testExpression("MasterInstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setMasterInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SlaveInstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setSlaveInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstanceGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setInstanceGroups(new ListUnmarshaller<InstanceGroupConfig>(InstanceGroupConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InstanceFleets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setInstanceFleets(new ListUnmarshaller<InstanceFleetConfig>(InstanceFleetConfigJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Ec2KeyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setEc2KeyName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Placement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setPlacement(PlacementTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KeepJobFlowAliveWhenNoSteps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setKeepJobFlowAliveWhenNoSteps(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("TerminationProtected", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setTerminationProtected(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("HadoopVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setHadoopVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ec2SubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setEc2SubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ec2SubnetIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setEc2SubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("EmrManagedMasterSecurityGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setEmrManagedMasterSecurityGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EmrManagedSlaveSecurityGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setEmrManagedSlaveSecurityGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceAccessSecurityGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setServiceAccessSecurityGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalMasterSecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setAdditionalMasterSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AdditionalSlaveSecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jobFlowInstancesConfig.setAdditionalSlaveSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return jobFlowInstancesConfig;
    }

    private static JobFlowInstancesConfigJsonUnmarshaller instance;

    public static JobFlowInstancesConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobFlowInstancesConfigJsonUnmarshaller();
        return instance;
    }
}
