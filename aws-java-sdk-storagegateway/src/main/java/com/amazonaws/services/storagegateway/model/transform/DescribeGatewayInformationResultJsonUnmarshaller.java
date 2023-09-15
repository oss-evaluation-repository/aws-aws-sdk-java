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
package com.amazonaws.services.storagegateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeGatewayInformationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGatewayInformationResultJsonUnmarshaller implements Unmarshaller<DescribeGatewayInformationResult, JsonUnmarshallerContext> {

    public DescribeGatewayInformationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeGatewayInformationResult describeGatewayInformationResult = new DescribeGatewayInformationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeGatewayInformationResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("GatewayARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayTimezone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayTimezone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayNetworkInterfaces", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayNetworkInterfaces(new ListUnmarshaller<NetworkInterface>(NetworkInterfaceJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GatewayType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NextUpdateAvailabilityDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setNextUpdateAvailabilityDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastSoftwareUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setLastSoftwareUpdate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setEc2InstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Ec2InstanceRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setEc2InstanceRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VPCEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setVPCEndpoint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogGroupARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setCloudWatchLogGroupARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HostEnvironment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setHostEnvironment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EndpointType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setEndpointType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SoftwareUpdatesEndDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setSoftwareUpdatesEndDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeprecationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setDeprecationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setGatewayCapacity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupportedGatewayCapacities", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setSupportedGatewayCapacities(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("HostEnvironmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeGatewayInformationResult.setHostEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return describeGatewayInformationResult;
    }

    private static DescribeGatewayInformationResultJsonUnmarshaller instance;

    public static DescribeGatewayInformationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeGatewayInformationResultJsonUnmarshaller();
        return instance;
    }
}
