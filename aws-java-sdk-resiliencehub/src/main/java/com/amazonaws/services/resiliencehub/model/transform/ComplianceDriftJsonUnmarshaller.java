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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ComplianceDrift JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComplianceDriftJsonUnmarshaller implements Unmarshaller<ComplianceDrift, JsonUnmarshallerContext> {

    public ComplianceDrift unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComplianceDrift complianceDrift = new ComplianceDrift();

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
                if (context.testExpression("actualReferenceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setActualReferenceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actualValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setActualValue(new MapUnmarshaller<String, DisruptionCompliance>(context.getUnmarshaller(String.class),
                            DisruptionComplianceJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("appId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setAppId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("appVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setAppVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("diffType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setDiffType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("driftType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setDriftType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setEntityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setEntityType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expectedReferenceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setExpectedReferenceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("expectedValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    complianceDrift.setExpectedValue(new MapUnmarshaller<String, DisruptionCompliance>(context.getUnmarshaller(String.class),
                            DisruptionComplianceJsonUnmarshaller.getInstance()).unmarshall(context));
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

        return complianceDrift;
    }

    private static ComplianceDriftJsonUnmarshaller instance;

    public static ComplianceDriftJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComplianceDriftJsonUnmarshaller();
        return instance;
    }
}
