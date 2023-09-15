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
package com.amazonaws.services.lexmodelbuilding.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelbuilding.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Slot JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SlotJsonUnmarshaller implements Unmarshaller<Slot, JsonUnmarshallerContext> {

    public Slot unmarshall(JsonUnmarshallerContext context) throws Exception {
        Slot slot = new Slot();

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
                    slot.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotConstraint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setSlotConstraint(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setSlotType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setSlotTypeVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueElicitationPrompt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setValueElicitationPrompt(PromptJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("priority", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setPriority(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("sampleUtterances", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setSampleUtterances(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("responseCard", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setResponseCard(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("obfuscationSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setObfuscationSetting(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("defaultValueSpec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    slot.setDefaultValueSpec(SlotDefaultValueSpecJsonUnmarshaller.getInstance().unmarshall(context));
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

        return slot;
    }

    private static SlotJsonUnmarshaller instance;

    public static SlotJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SlotJsonUnmarshaller();
        return instance;
    }
}
