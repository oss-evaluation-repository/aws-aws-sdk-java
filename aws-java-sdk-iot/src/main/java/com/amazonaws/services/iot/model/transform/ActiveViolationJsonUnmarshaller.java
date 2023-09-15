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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ActiveViolation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActiveViolationJsonUnmarshaller implements Unmarshaller<ActiveViolation, JsonUnmarshallerContext> {

    public ActiveViolation unmarshall(JsonUnmarshallerContext context) throws Exception {
        ActiveViolation activeViolation = new ActiveViolation();

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
                if (context.testExpression("violationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setViolationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setThingName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityProfileName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setSecurityProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("behavior", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setBehavior(BehaviorJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastViolationValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setLastViolationValue(MetricValueJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("violationEventAdditionalInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setViolationEventAdditionalInfo(ViolationEventAdditionalInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("verificationState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setVerificationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("verificationStateDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setVerificationStateDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastViolationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setLastViolationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("violationStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    activeViolation.setViolationStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return activeViolation;
    }

    private static ActiveViolationJsonUnmarshaller instance;

    public static ActiveViolationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ActiveViolationJsonUnmarshaller();
        return instance;
    }
}
