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
package com.amazonaws.services.cloudtrail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Event JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventJsonUnmarshaller implements Unmarshaller<Event, JsonUnmarshallerContext> {

    public Event unmarshall(JsonUnmarshallerContext context) throws Exception {
        Event event = new Event();

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
                if (context.testExpression("EventId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    event.setEventId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    event.setEventName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReadOnly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    event.setReadOnly(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccessKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    event.setAccessKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    event.setEventTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EventSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    event.setEventSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Username", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    event.setUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Resources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    event.setResources(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CloudTrailEvent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    event.setCloudTrailEvent(context.getUnmarshaller(String.class).unmarshall(context));
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

        return event;
    }

    private static EventJsonUnmarshaller instance;

    public static EventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventJsonUnmarshaller();
        return instance;
    }
}
