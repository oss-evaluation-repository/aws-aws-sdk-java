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
                if (context.testExpression("SessionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setSessionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Target", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setStartDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setEndDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DocumentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setDocumentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Owner", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Reason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Details", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setOutputUrl(SessionManagerOutputUrlJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxSessionDuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    session.setMaxSessionDuration(context.getUnmarshaller(String.class).unmarshall(context));
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
