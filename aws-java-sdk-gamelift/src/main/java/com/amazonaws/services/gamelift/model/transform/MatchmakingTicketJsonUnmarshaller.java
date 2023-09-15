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
package com.amazonaws.services.gamelift.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MatchmakingTicket JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MatchmakingTicketJsonUnmarshaller implements Unmarshaller<MatchmakingTicket, JsonUnmarshallerContext> {

    public MatchmakingTicket unmarshall(JsonUnmarshallerContext context) throws Exception {
        MatchmakingTicket matchmakingTicket = new MatchmakingTicket();

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
                if (context.testExpression("TicketId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setTicketId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setConfigurationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConfigurationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setConfigurationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Players", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setPlayers(new ListUnmarshaller<Player>(PlayerJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GameSessionConnectionInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setGameSessionConnectionInfo(GameSessionConnectionInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EstimatedWaitTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    matchmakingTicket.setEstimatedWaitTime(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return matchmakingTicket;
    }

    private static MatchmakingTicketJsonUnmarshaller instance;

    public static MatchmakingTicketJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MatchmakingTicketJsonUnmarshaller();
        return instance;
    }
}
