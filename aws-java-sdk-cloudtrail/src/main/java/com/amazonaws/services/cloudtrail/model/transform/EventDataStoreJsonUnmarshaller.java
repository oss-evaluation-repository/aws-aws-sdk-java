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
 * EventDataStore JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventDataStoreJsonUnmarshaller implements Unmarshaller<EventDataStore, JsonUnmarshallerContext> {

    public EventDataStore unmarshall(JsonUnmarshallerContext context) throws Exception {
        EventDataStore eventDataStore = new EventDataStore();

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
                if (context.testExpression("EventDataStoreArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setEventDataStoreArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TerminationProtectionEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setTerminationProtectionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AdvancedEventSelectors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setAdvancedEventSelectors(new ListUnmarshaller<AdvancedEventSelector>(AdvancedEventSelectorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MultiRegionEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setMultiRegionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OrganizationEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setOrganizationEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RetentionPeriod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setRetentionPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eventDataStore.setUpdatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return eventDataStore;
    }

    private static EventDataStoreJsonUnmarshaller instance;

    public static EventDataStoreJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EventDataStoreJsonUnmarshaller();
        return instance;
    }
}
