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
 * InstanceFleet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceFleetJsonUnmarshaller implements Unmarshaller<InstanceFleet, JsonUnmarshallerContext> {

    public InstanceFleet unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceFleet instanceFleet = new InstanceFleet();

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
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setStatus(InstanceFleetStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InstanceFleetType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setInstanceFleetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetOnDemandCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setTargetOnDemandCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TargetSpotCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setTargetSpotCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedOnDemandCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setProvisionedOnDemandCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedSpotCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setProvisionedSpotCapacity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InstanceTypeSpecifications", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setInstanceTypeSpecifications(new ListUnmarshaller<InstanceTypeSpecification>(InstanceTypeSpecificationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LaunchSpecifications", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setLaunchSpecifications(InstanceFleetProvisioningSpecificationsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResizeSpecifications", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceFleet.setResizeSpecifications(InstanceFleetResizingSpecificationsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return instanceFleet;
    }

    private static InstanceFleetJsonUnmarshaller instance;

    public static InstanceFleetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceFleetJsonUnmarshaller();
        return instance;
    }
}
