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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PatchComplianceData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PatchComplianceDataJsonUnmarshaller implements Unmarshaller<PatchComplianceData, JsonUnmarshallerContext> {

    public PatchComplianceData unmarshall(JsonUnmarshallerContext context) throws Exception {
        PatchComplianceData patchComplianceData = new PatchComplianceData();

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
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchComplianceData.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KBId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchComplianceData.setKBId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Classification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchComplianceData.setClassification(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Severity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchComplianceData.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("State", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchComplianceData.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InstalledTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchComplianceData.setInstalledTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CVEIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    patchComplianceData.setCVEIds(context.getUnmarshaller(String.class).unmarshall(context));
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

        return patchComplianceData;
    }

    private static PatchComplianceDataJsonUnmarshaller instance;

    public static PatchComplianceDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PatchComplianceDataJsonUnmarshaller();
        return instance;
    }
}
