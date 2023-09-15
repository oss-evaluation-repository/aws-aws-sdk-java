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
 * AwsAmazonMqBrokerLdapServerMetadataDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAmazonMqBrokerLdapServerMetadataDetailsJsonUnmarshaller implements
        Unmarshaller<AwsAmazonMqBrokerLdapServerMetadataDetails, JsonUnmarshallerContext> {

    public AwsAmazonMqBrokerLdapServerMetadataDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsAmazonMqBrokerLdapServerMetadataDetails awsAmazonMqBrokerLdapServerMetadataDetails = new AwsAmazonMqBrokerLdapServerMetadataDetails();

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
                if (context.testExpression("Hosts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setHosts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("RoleBase", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setRoleBase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setRoleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleSearchMatching", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setRoleSearchMatching(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleSearchSubtree", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setRoleSearchSubtree(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ServiceAccountUsername", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setServiceAccountUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserBase", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setUserBase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserRoleName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setUserRoleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserSearchMatching", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setUserSearchMatching(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserSearchSubtree", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsAmazonMqBrokerLdapServerMetadataDetails.setUserSearchSubtree(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return awsAmazonMqBrokerLdapServerMetadataDetails;
    }

    private static AwsAmazonMqBrokerLdapServerMetadataDetailsJsonUnmarshaller instance;

    public static AwsAmazonMqBrokerLdapServerMetadataDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsAmazonMqBrokerLdapServerMetadataDetailsJsonUnmarshaller();
        return instance;
    }
}
