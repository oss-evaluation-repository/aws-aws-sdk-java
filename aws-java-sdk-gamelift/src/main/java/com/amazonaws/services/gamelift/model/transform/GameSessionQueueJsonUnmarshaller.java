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
 * GameSessionQueue JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSessionQueueJsonUnmarshaller implements Unmarshaller<GameSessionQueue, JsonUnmarshallerContext> {

    public GameSessionQueue unmarshall(JsonUnmarshallerContext context) throws Exception {
        GameSessionQueue gameSessionQueue = new GameSessionQueue();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gameSessionQueue.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GameSessionQueueArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gameSessionQueue.setGameSessionQueueArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeoutInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gameSessionQueue.setTimeoutInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("PlayerLatencyPolicies", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gameSessionQueue.setPlayerLatencyPolicies(new ListUnmarshaller<PlayerLatencyPolicy>(PlayerLatencyPolicyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Destinations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gameSessionQueue.setDestinations(new ListUnmarshaller<GameSessionQueueDestination>(GameSessionQueueDestinationJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FilterConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gameSessionQueue.setFilterConfiguration(FilterConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PriorityConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gameSessionQueue.setPriorityConfiguration(PriorityConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomEventData", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gameSessionQueue.setCustomEventData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NotificationTarget", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gameSessionQueue.setNotificationTarget(context.getUnmarshaller(String.class).unmarshall(context));
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

        return gameSessionQueue;
    }

    private static GameSessionQueueJsonUnmarshaller instance;

    public static GameSessionQueueJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GameSessionQueueJsonUnmarshaller();
        return instance;
    }
}
