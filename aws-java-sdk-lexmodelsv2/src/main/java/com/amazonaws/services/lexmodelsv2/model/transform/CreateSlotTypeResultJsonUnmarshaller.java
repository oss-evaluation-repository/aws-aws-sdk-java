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
 * CreateSlotTypeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSlotTypeResultJsonUnmarshaller implements Unmarshaller<CreateSlotTypeResult, JsonUnmarshallerContext> {

    public CreateSlotTypeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateSlotTypeResult createSlotTypeResult = new CreateSlotTypeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createSlotTypeResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("slotTypeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setSlotTypeId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setSlotTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slotTypeValues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setSlotTypeValues(new ListUnmarshaller<SlotTypeValue>(SlotTypeValueJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("valueSelectionSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setValueSelectionSetting(SlotValueSelectionSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("parentSlotTypeSignature", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setParentSlotTypeSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("externalSourceSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setExternalSourceSetting(ExternalSourceSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("compositeSlotTypeSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createSlotTypeResult.setCompositeSlotTypeSetting(CompositeSlotTypeSettingJsonUnmarshaller.getInstance().unmarshall(context));
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

        return createSlotTypeResult;
    }

    private static CreateSlotTypeResultJsonUnmarshaller instance;

    public static CreateSlotTypeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateSlotTypeResultJsonUnmarshaller();
        return instance;
    }
}
