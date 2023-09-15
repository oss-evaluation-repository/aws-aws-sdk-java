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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EventType JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventTypeJsonUnmarshaller implements Unmarshaller<EventType, JsonUnmarshallerContext> {

    public EventType unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventType eventType = new EventType();

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
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventVariables", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setEventVariables(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("labels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setLabels(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("entityTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setEntityTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("eventIngestion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setEventIngestion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ingestedEventStatistics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setIngestedEventStatistics(IngestedEventStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setLastUpdatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventOrchestration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventType.setEventOrchestration(EventOrchestrationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return eventType;
    }

    private static EventTypeJsonUnmarshaller instance;

    public static EventTypeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventTypeJsonUnmarshaller();
        return instance;
    }
}
