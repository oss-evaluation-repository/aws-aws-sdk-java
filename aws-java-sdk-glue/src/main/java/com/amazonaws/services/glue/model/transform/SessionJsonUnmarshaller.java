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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Session JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionJsonUnmarshaller implements Unmarshaller<Session, JsonUnmarshallerContext> {

    public Session unmarshall(JsonUnmarshallerContext context) throws Exception {
        Session session = new Session();

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
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setCreatedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setErrorMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Command", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setCommand(SessionCommandJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultArguments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setDefaultArguments(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("Connections", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setConnections(ConnectionsListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Progress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setProgress(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setMaxCapacity(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("SecurityConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setSecurityConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlueVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setGlueVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfWorkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setNumberOfWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("WorkerType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setWorkerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CompletedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setCompletedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setExecutionTime(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("DPUSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setDPUSeconds(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("IdleTimeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setIdleTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return session;
    }

    private static SessionJsonUnmarshaller instance;

    public static SessionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SessionJsonUnmarshaller();
        return instance;
    }
}
