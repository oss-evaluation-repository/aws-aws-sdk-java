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
package com.amazonaws.services.ssmsap.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ssmsap.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Component JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComponentJsonUnmarshaller implements Unmarshaller<Component, JsonUnmarshallerContext> {

    public Component unmarshall(JsonUnmarshallerContext context) throws Exception {
        Component component = new Component();

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
                if (context.testExpression("ComponentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setComponentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParentComponent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setParentComponent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChildComponents", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setChildComponents(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ApplicationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setApplicationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComponentType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setComponentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SapHostname", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setSapHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SapKernelVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setSapKernelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HdbVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setHdbVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Resilience", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setResilience(ResilienceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AssociatedHost", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setAssociatedHost(AssociatedHostJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Databases", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setDatabases(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Hosts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setHosts(new ListUnmarshaller<Host>(HostJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PrimaryHost", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setPrimaryHost(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdated", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setLastUpdated(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    component.setArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return component;
    }

    private static ComponentJsonUnmarshaller instance;

    public static ComponentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComponentJsonUnmarshaller();
        return instance;
    }
}
