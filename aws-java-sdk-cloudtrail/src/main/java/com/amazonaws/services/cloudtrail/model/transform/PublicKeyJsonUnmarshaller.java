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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;
import java.nio.ByteBuffer;
import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PublicKey JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PublicKeyJsonUnmarshaller implements Unmarshaller<PublicKey, JsonUnmarshallerContext> {

    public PublicKey unmarshall(JsonUnmarshallerContext context) throws Exception {
        PublicKey publicKey = new PublicKey();

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
                if (context.testExpression("Value", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    publicKey.setValue(context.getUnmarshaller(java.nio.ByteBuffer.class).unmarshall(context));
                }
                if (context.testExpression("ValidityStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    publicKey.setValidityStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ValidityEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    publicKey.setValidityEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Fingerprint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    publicKey.setFingerprint(context.getUnmarshaller(String.class).unmarshall(context));
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

        return publicKey;
    }

    private static PublicKeyJsonUnmarshaller instance;

    public static PublicKeyJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PublicKeyJsonUnmarshaller();
        return instance;
    }
}
