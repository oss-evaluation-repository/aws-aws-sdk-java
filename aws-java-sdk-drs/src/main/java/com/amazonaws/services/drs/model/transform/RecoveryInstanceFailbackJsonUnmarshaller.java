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
package com.amazonaws.services.drs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecoveryInstanceFailback JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstanceFailbackJsonUnmarshaller implements Unmarshaller<RecoveryInstanceFailback, JsonUnmarshallerContext> {

    public RecoveryInstanceFailback unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecoveryInstanceFailback recoveryInstanceFailback = new RecoveryInstanceFailback();

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
                if (context.testExpression("agentLastSeenByServiceDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setAgentLastSeenByServiceDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("elapsedReplicationDuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setElapsedReplicationDuration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackClientID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackClientID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackClientLastSeenByServiceDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackClientLastSeenByServiceDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackInitiationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackInitiationTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackJobID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackJobID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackLaunchType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackLaunchType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failbackToOriginalServer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setFailbackToOriginalServer(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("firstByteDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setFirstByteDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstanceFailback.setState(context.getUnmarshaller(String.class).unmarshall(context));
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

        return recoveryInstanceFailback;
    }

    private static RecoveryInstanceFailbackJsonUnmarshaller instance;

    public static RecoveryInstanceFailbackJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryInstanceFailbackJsonUnmarshaller();
        return instance;
    }
}
