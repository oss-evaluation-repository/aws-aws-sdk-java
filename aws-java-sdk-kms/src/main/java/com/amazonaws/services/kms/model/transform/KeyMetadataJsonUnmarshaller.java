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
package com.amazonaws.services.kms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KeyMetadata JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyMetadataJsonUnmarshaller implements Unmarshaller<KeyMetadata, JsonUnmarshallerContext> {

    public KeyMetadata unmarshall(JsonUnmarshallerContext context) throws Exception {
        KeyMetadata keyMetadata = new KeyMetadata();

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
                if (context.testExpression("AWSAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setAWSAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyUsage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setKeyUsage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setKeyState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeletionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setDeletionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ValidTo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setValidTo(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Origin", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setOrigin(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomKeyStoreId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setCustomKeyStoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CloudHsmClusterId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setCloudHsmClusterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExpirationModel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setExpirationModel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeyManager", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setKeyManager(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomerMasterKeySpec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setCustomerMasterKeySpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KeySpec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setKeySpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EncryptionAlgorithms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setEncryptionAlgorithms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SigningAlgorithms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setSigningAlgorithms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MultiRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setMultiRegion(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MultiRegionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setMultiRegionConfiguration(MultiRegionConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PendingDeletionWindowInDays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setPendingDeletionWindowInDays(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MacAlgorithms", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setMacAlgorithms(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("XksKeyConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    keyMetadata.setXksKeyConfiguration(XksKeyConfigurationTypeJsonUnmarshaller.getInstance().unmarshall(context));
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

        return keyMetadata;
    }

    private static KeyMetadataJsonUnmarshaller instance;

    public static KeyMetadataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KeyMetadataJsonUnmarshaller();
        return instance;
    }
}
