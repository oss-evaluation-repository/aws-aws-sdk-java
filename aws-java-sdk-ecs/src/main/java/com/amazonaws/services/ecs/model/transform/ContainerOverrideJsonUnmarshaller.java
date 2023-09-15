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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContainerOverride JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerOverrideJsonUnmarshaller implements Unmarshaller<ContainerOverride, JsonUnmarshallerContext> {

    public ContainerOverride unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerOverride containerOverride = new ContainerOverride();

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
                    containerOverride.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("command", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerOverride.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerOverride.setEnvironment(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("environmentFiles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerOverride.setEnvironmentFiles(new ListUnmarshaller<EnvironmentFile>(EnvironmentFileJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("cpu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerOverride.setCpu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("memory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerOverride.setMemory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("memoryReservation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerOverride.setMemoryReservation(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("resourceRequirements", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerOverride.setResourceRequirements(new ListUnmarshaller<ResourceRequirement>(ResourceRequirementJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return containerOverride;
    }

    private static ContainerOverrideJsonUnmarshaller instance;

    public static ContainerOverrideJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerOverrideJsonUnmarshaller();
        return instance;
    }
}
