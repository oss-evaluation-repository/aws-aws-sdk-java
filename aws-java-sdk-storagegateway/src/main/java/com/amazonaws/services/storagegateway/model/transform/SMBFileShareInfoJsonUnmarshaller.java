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
 * SMBFileShareInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMBFileShareInfoJsonUnmarshaller implements Unmarshaller<SMBFileShareInfo, JsonUnmarshallerContext> {

    public SMBFileShareInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        SMBFileShareInfo sMBFileShareInfo = new SMBFileShareInfo();

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
                if (context.testExpression("FileShareARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setFileShareARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileShareId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setFileShareId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileShareStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setFileShareStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GatewayARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setGatewayARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KMSEncrypted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setKMSEncrypted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("KMSKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setKMSKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setLocationARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DefaultStorageClass", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setDefaultStorageClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ObjectACL", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setObjectACL(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReadOnly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setReadOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("GuessMIMETypeEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setGuessMIMETypeEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequesterPays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setRequesterPays(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SMBACLEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setSMBACLEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AccessBasedEnumeration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setAccessBasedEnumeration(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AdminUserList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setAdminUserList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ValidUserList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setValidUserList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("InvalidUserList", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setInvalidUserList(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AuditDestinationARN", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setAuditDestinationARN(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Authentication", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setAuthentication(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CaseSensitivity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setCaseSensitivity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FileShareName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setFileShareName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CacheAttributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setCacheAttributes(CacheAttributesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("NotificationPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setNotificationPolicy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VPCEndpointDNSName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setVPCEndpointDNSName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BucketRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setBucketRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OplocksEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sMBFileShareInfo.setOplocksEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return sMBFileShareInfo;
    }

    private static SMBFileShareInfoJsonUnmarshaller instance;

    public static SMBFileShareInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SMBFileShareInfoJsonUnmarshaller();
        return instance;
    }
}
