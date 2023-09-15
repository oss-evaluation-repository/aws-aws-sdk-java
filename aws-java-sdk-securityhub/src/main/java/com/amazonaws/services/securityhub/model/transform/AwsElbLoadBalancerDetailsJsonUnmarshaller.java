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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsElbLoadBalancerDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerDetailsJsonUnmarshaller implements Unmarshaller<AwsElbLoadBalancerDetails, JsonUnmarshallerContext> {

    public AwsElbLoadBalancerDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsElbLoadBalancerDetails awsElbLoadBalancerDetails = new AwsElbLoadBalancerDetails();

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
                if (context.testExpression("AvailabilityZones", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setAvailabilityZones(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("BackendServerDescriptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setBackendServerDescriptions(new ListUnmarshaller<AwsElbLoadBalancerBackendServerDescription>(
                            AwsElbLoadBalancerBackendServerDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CanonicalHostedZoneName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setCanonicalHostedZoneName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CanonicalHostedZoneNameID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setCanonicalHostedZoneNameID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DnsName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setDnsName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HealthCheck", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setHealthCheck(AwsElbLoadBalancerHealthCheckJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Instances", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setInstances(new ListUnmarshaller<AwsElbLoadBalancerInstance>(AwsElbLoadBalancerInstanceJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ListenerDescriptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setListenerDescriptions(new ListUnmarshaller<AwsElbLoadBalancerListenerDescription>(
                            AwsElbLoadBalancerListenerDescriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LoadBalancerAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setLoadBalancerAttributes(AwsElbLoadBalancerAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LoadBalancerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setLoadBalancerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Policies", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setPolicies(AwsElbLoadBalancerPoliciesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Scheme", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setScheme(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setSecurityGroups(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SourceSecurityGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setSourceSecurityGroup(AwsElbLoadBalancerSourceSecurityGroupJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Subnets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setSubnets(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsElbLoadBalancerDetails.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return awsElbLoadBalancerDetails;
    }

    private static AwsElbLoadBalancerDetailsJsonUnmarshaller instance;

    public static AwsElbLoadBalancerDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsElbLoadBalancerDetailsJsonUnmarshaller();
        return instance;
    }
}
