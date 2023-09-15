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
package com.amazonaws.services.appstream.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Fleet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetJsonUnmarshaller implements Unmarshaller<Fleet, JsonUnmarshallerContext> {

    public Fleet unmarshall(JsonUnmarshallerContext context) throws Exception {
        Fleet fleet = new Fleet();

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
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setImageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setImageArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setInstanceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FleetType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setFleetType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputeCapacityStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setComputeCapacityStatus(ComputeCapacityStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxUserDurationInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setMaxUserDurationInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DisconnectTimeoutInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setDisconnectTimeoutInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FleetErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setFleetErrors(new ListUnmarshaller<FleetError>(FleetErrorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EnableDefaultInternetAccess", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setEnableDefaultInternetAccess(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DomainJoinInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setDomainJoinInfo(DomainJoinInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IdleDisconnectTimeoutInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setIdleDisconnectTimeoutInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StreamView", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setStreamView(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Platform", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setPlatform(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxConcurrentSessions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setMaxConcurrentSessions(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("UsbDeviceFilterStrings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setUsbDeviceFilterStrings(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SessionScriptS3Location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setSessionScriptS3Location(S3LocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxSessionsPerInstance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    fleet.setMaxSessionsPerInstance(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return fleet;
    }

    private static FleetJsonUnmarshaller instance;

    public static FleetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetJsonUnmarshaller();
        return instance;
    }
}
