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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeDomainResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainResultJsonUnmarshaller implements Unmarshaller<DescribeDomainResult, JsonUnmarshallerContext> {

    public DescribeDomainResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDomainResult describeDomainResult = new DescribeDomainResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeDomainResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DomainArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setDomainArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setDomainId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setDomainName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HomeEfsFileSystemId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setHomeEfsFileSystemId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SingleSignOnManagedApplicationInstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setSingleSignOnManagedApplicationInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AuthMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setAuthMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultUserSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setDefaultUserSettings(UserSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AppNetworkAccessType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setAppNetworkAccessType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HomeEfsFileSystemKmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setHomeEfsFileSystemKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SubnetIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setSubnetIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setVpcId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DomainSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setDomainSettings(DomainSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AppSecurityGroupManagement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setAppSecurityGroupManagement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityGroupIdForDomainBoundary", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setSecurityGroupIdForDomainBoundary(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultSpaceSettings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeDomainResult.setDefaultSpaceSettings(DefaultSpaceSettingsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeDomainResult;
    }

    private static DescribeDomainResultJsonUnmarshaller instance;

    public static DescribeDomainResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDomainResultJsonUnmarshaller();
        return instance;
    }
}
