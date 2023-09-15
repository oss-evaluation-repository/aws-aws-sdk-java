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
package com.amazonaws.services.nimblestudio.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.nimblestudio.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EulaAcceptance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EulaAcceptanceJsonUnmarshaller implements Unmarshaller<EulaAcceptance, JsonUnmarshallerContext> {

    public EulaAcceptance unmarshall(JsonUnmarshallerContext context) throws Exception {
        EulaAcceptance eulaAcceptance = new EulaAcceptance();

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
                if (context.testExpression("acceptedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eulaAcceptance.setAcceptedAt(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("acceptedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eulaAcceptance.setAcceptedBy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accepteeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eulaAcceptance.setAccepteeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eulaAcceptanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eulaAcceptance.setEulaAcceptanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eulaId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eulaAcceptance.setEulaId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return eulaAcceptance;
    }

    private static EulaAcceptanceJsonUnmarshaller instance;

    public static EulaAcceptanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EulaAcceptanceJsonUnmarshaller();
        return instance;
    }
}
