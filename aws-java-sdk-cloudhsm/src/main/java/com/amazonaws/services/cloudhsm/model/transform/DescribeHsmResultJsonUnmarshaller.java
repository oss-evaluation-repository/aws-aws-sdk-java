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
package com.amazonaws.services.cloudhsm.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudhsm.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeHsmResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeHsmResultJsonUnmarshaller implements Unmarshaller<DescribeHsmResult, JsonUnmarshallerContext> {

    public DescribeHsmResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeHsmResult describeHsmResult = new DescribeHsmResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeHsmResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("HsmArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setHsmArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setStatusDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EniId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setEniId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EniIp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setEniIp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setSubscriptionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionStartDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setSubscriptionStartDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubscriptionEndDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setSubscriptionEndDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setSubnetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setIamRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SerialNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setSerialNumber(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VendorName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setVendorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HsmType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setHsmType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SoftwareVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setSoftwareVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshPublicKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setSshPublicKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SshKeyLastUpdated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setSshKeyLastUpdated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerCertUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setServerCertUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServerCertLastUpdated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setServerCertLastUpdated(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Partitions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeHsmResult.setPartitions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return describeHsmResult;
    }

    private static DescribeHsmResultJsonUnmarshaller instance;

    public static DescribeHsmResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeHsmResultJsonUnmarshaller();
        return instance;
    }
}
