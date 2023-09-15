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
package com.amazonaws.services.appstream.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appstream.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ComputeCapacityStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComputeCapacityStatusJsonUnmarshaller implements Unmarshaller<ComputeCapacityStatus, JsonUnmarshallerContext> {

    public ComputeCapacityStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComputeCapacityStatus computeCapacityStatus = new ComputeCapacityStatus();

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
                if (context.testExpression("Desired", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    computeCapacityStatus.setDesired(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Running", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    computeCapacityStatus.setRunning(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("InUse", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    computeCapacityStatus.setInUse(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Available", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    computeCapacityStatus.setAvailable(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DesiredUserSessions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    computeCapacityStatus.setDesiredUserSessions(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AvailableUserSessions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    computeCapacityStatus.setAvailableUserSessions(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ActiveUserSessions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    computeCapacityStatus.setActiveUserSessions(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ActualUserSessions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    computeCapacityStatus.setActualUserSessions(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return computeCapacityStatus;
    }

    private static ComputeCapacityStatusJsonUnmarshaller instance;

    public static ComputeCapacityStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComputeCapacityStatusJsonUnmarshaller();
        return instance;
    }
}
