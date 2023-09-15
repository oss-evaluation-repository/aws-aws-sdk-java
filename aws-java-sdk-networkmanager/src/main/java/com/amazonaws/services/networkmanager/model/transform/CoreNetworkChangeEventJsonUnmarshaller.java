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
package com.amazonaws.services.networkmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CoreNetworkChangeEvent JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoreNetworkChangeEventJsonUnmarshaller implements Unmarshaller<CoreNetworkChangeEvent, JsonUnmarshallerContext> {

    public CoreNetworkChangeEvent unmarshall(JsonUnmarshallerContext context) throws Exception {
        CoreNetworkChangeEvent coreNetworkChangeEvent = new CoreNetworkChangeEvent();

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
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkChangeEvent.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Action", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkChangeEvent.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IdentifierPath", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkChangeEvent.setIdentifierPath(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EventTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkChangeEvent.setEventTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkChangeEvent.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Values", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    coreNetworkChangeEvent.setValues(CoreNetworkChangeEventValuesJsonUnmarshaller.getInstance().unmarshall(context));
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

        return coreNetworkChangeEvent;
    }

    private static CoreNetworkChangeEventJsonUnmarshaller instance;

    public static CoreNetworkChangeEventJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CoreNetworkChangeEventJsonUnmarshaller();
        return instance;
    }
}
