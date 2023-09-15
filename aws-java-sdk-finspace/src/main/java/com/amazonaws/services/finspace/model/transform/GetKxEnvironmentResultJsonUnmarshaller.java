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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetKxEnvironmentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKxEnvironmentResultJsonUnmarshaller implements Unmarshaller<GetKxEnvironmentResult, JsonUnmarshallerContext> {

    public GetKxEnvironmentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetKxEnvironmentResult getKxEnvironmentResult = new GetKxEnvironmentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getKxEnvironmentResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setEnvironmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("awsAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tgwStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setTgwStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dnsStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setDnsStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environmentArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setEnvironmentArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dedicatedServiceAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setDedicatedServiceAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("transitGatewayConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setTransitGatewayConfiguration(TransitGatewayConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("customDNSConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setCustomDNSConfiguration(new ListUnmarshaller<CustomDNSServer>(CustomDNSServerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("creationTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setCreationTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setUpdateTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("availabilityZoneIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setAvailabilityZoneIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("certificateAuthorityArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getKxEnvironmentResult.setCertificateAuthorityArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getKxEnvironmentResult;
    }

    private static GetKxEnvironmentResultJsonUnmarshaller instance;

    public static GetKxEnvironmentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetKxEnvironmentResultJsonUnmarshaller();
        return instance;
    }
}
