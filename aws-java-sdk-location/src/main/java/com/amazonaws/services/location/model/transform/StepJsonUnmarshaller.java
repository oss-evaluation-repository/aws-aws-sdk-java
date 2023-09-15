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
package com.amazonaws.services.location.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.location.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Step JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StepJsonUnmarshaller implements Unmarshaller<Step, JsonUnmarshallerContext> {

    public Step unmarshall(JsonUnmarshallerContext context) throws Exception {
        Step step = new Step();

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
                if (context.testExpression("Distance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    step.setDistance(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("DurationSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    step.setDurationSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("EndPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    step.setEndPosition(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
                }
                if (context.testExpression("GeometryOffset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    step.setGeometryOffset(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StartPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    step.setStartPosition(new ListUnmarshaller<Double>(context.getUnmarshaller(Double.class))

                    .unmarshall(context));
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

        return step;
    }

    private static StepJsonUnmarshaller instance;

    public static StepJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StepJsonUnmarshaller();
        return instance;
    }
}
