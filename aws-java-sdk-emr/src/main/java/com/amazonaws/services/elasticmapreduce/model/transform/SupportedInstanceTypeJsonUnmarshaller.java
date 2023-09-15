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
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SupportedInstanceType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportedInstanceTypeJsonUnmarshaller implements Unmarshaller<SupportedInstanceType, JsonUnmarshallerContext> {

    public SupportedInstanceType unmarshall(JsonUnmarshallerContext context) throws Exception {
        SupportedInstanceType supportedInstanceType = new SupportedInstanceType();

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
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MemoryGB", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setMemoryGB(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("StorageGB", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setStorageGB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VCPU", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setVCPU(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Is64BitsOnly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setIs64BitsOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("InstanceFamilyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setInstanceFamilyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EbsOptimizedAvailable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setEbsOptimizedAvailable(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EbsOptimizedByDefault", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setEbsOptimizedByDefault(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfDisks", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setNumberOfDisks(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("EbsStorageOnly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setEbsStorageOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Architecture", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    supportedInstanceType.setArchitecture(context.getUnmarshaller(String.class).unmarshall(context));
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

        return supportedInstanceType;
    }

    private static SupportedInstanceTypeJsonUnmarshaller instance;

    public static SupportedInstanceTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SupportedInstanceTypeJsonUnmarshaller();
        return instance;
    }
}
