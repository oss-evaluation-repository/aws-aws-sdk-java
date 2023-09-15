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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateDomainNameResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainNameResultJsonUnmarshaller implements Unmarshaller<UpdateDomainNameResult, JsonUnmarshallerContext> {

    public UpdateDomainNameResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateDomainNameResult updateDomainNameResult = new UpdateDomainNameResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateDomainNameResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("domainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setCertificateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("certificateUploadDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setCertificateUploadDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("regionalDomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setRegionalDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionalHostedZoneId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setRegionalHostedZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionalCertificateName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setRegionalCertificateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("regionalCertificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setRegionalCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("distributionDomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setDistributionDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("distributionHostedZoneId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setDistributionHostedZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endpointConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setEndpointConfiguration(EndpointConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("domainNameStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setDomainNameStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("domainNameStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setDomainNameStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setSecurityPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("mutualTlsAuthentication", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setMutualTlsAuthentication(MutualTlsAuthenticationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ownershipVerificationCertificateArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateDomainNameResult.setOwnershipVerificationCertificateArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return updateDomainNameResult;
    }

    private static UpdateDomainNameResultJsonUnmarshaller instance;

    public static UpdateDomainNameResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateDomainNameResultJsonUnmarshaller();
        return instance;
    }
}
