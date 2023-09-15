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
package com.amazonaws.services.lexmodelsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lexmodelsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateSlotResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSlotResultJsonUnmarshaller implements Unmarshaller<CreateSlotResult, JsonUnmarshallerContext> {

    public CreateSlotResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSlotResult createSlotResult = new CreateSlotResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createSlotResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("slotId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setSlotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setSlotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setSlotTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("valueElicitationSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setValueElicitationSetting(SlotValueElicitationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("obfuscationSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setObfuscationSetting(ObfuscationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("multipleValuesSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setMultipleValuesSetting(MultipleValuesSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("subSlotSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotResult.setSubSlotSetting(SubSlotSettingJsonUnmarshaller.getInstance().unmarshall(context));
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

        return createSlotResult;
    }

    private static CreateSlotResultJsonUnmarshaller instance;

    public static CreateSlotResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSlotResultJsonUnmarshaller();
        return instance;
    }
}
