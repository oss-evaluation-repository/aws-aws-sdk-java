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
package com.amazonaws.services.mainframemodernization.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mainframemodernization.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VsamDetailAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VsamDetailAttributesJsonUnmarshaller implements Unmarshaller<VsamDetailAttributes, JsonUnmarshallerContext> {

    public VsamDetailAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        VsamDetailAttributes vsamDetailAttributes = new VsamDetailAttributes();

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
                if (context.testExpression("alternateKeys", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vsamDetailAttributes.setAlternateKeys(new ListUnmarshaller<AlternateKey>(AlternateKeyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("cacheAtStartup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vsamDetailAttributes.setCacheAtStartup(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("compressed", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vsamDetailAttributes.setCompressed(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("encoding", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vsamDetailAttributes.setEncoding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("primaryKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vsamDetailAttributes.setPrimaryKey(PrimaryKeyJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recordFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    vsamDetailAttributes.setRecordFormat(context.getUnmarshaller(String.class).unmarshall(context));
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

        return vsamDetailAttributes;
    }

    private static VsamDetailAttributesJsonUnmarshaller instance;

    public static VsamDetailAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VsamDetailAttributesJsonUnmarshaller();
        return instance;
    }
}
