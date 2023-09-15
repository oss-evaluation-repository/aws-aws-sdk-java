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
package com.amazonaws.services.connect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AgentContactReference JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentContactReferenceJsonUnmarshaller implements Unmarshaller<AgentContactReference, JsonUnmarshallerContext> {

    public AgentContactReference unmarshall(JsonUnmarshallerContext context) throws Exception {
        AgentContactReference agentContactReference = new AgentContactReference();

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
                if (context.testExpression("ContactId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    agentContactReference.setContactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Channel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    agentContactReference.setChannel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitiationMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    agentContactReference.setInitiationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AgentContactState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    agentContactReference.setAgentContactState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StateStartTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    agentContactReference.setStateStartTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ConnectedToAgentTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    agentContactReference.setConnectedToAgentTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Queue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    agentContactReference.setQueue(QueueReferenceJsonUnmarshaller.getInstance().unmarshall(context));
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

        return agentContactReference;
    }

    private static AgentContactReferenceJsonUnmarshaller instance;

    public static AgentContactReferenceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AgentContactReferenceJsonUnmarshaller();
        return instance;
    }
}
