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
package com.amazonaws.services.mq.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mq.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LdapServerMetadataOutput JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LdapServerMetadataOutputJsonUnmarshaller implements Unmarshaller<LdapServerMetadataOutput, JsonUnmarshallerContext> {

    public LdapServerMetadataOutput unmarshall(JsonUnmarshallerContext context) throws Exception {
        LdapServerMetadataOutput ldapServerMetadataOutput = new LdapServerMetadataOutput();

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
                if (context.testExpression("hosts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setHosts(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("roleBase", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setRoleBase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setRoleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleSearchMatching", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setRoleSearchMatching(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleSearchSubtree", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setRoleSearchSubtree(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("serviceAccountUsername", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setServiceAccountUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userBase", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setUserBase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userRoleName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setUserRoleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userSearchMatching", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setUserSearchMatching(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("userSearchSubtree", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    ldapServerMetadataOutput.setUserSearchSubtree(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return ldapServerMetadataOutput;
    }

    private static LdapServerMetadataOutputJsonUnmarshaller instance;

    public static LdapServerMetadataOutputJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LdapServerMetadataOutputJsonUnmarshaller();
        return instance;
    }
}
