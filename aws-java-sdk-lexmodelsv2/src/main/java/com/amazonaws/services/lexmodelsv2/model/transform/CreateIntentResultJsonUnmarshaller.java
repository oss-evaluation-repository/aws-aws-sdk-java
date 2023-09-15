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
 * CreateIntentResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntentResultJsonUnmarshaller implements Unmarshaller<CreateIntentResult, JsonUnmarshallerContext> {

    public CreateIntentResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIntentResult createIntentResult = new CreateIntentResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createIntentResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("intentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setIntentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("intentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setIntentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parentIntentSignature", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setParentIntentSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleUtterances", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setSampleUtterances(new ListUnmarshaller<SampleUtterance>(SampleUtteranceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dialogCodeHook", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setDialogCodeHook(DialogCodeHookSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fulfillmentCodeHook", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setFulfillmentCodeHook(FulfillmentCodeHookSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("intentConfirmationSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setIntentConfirmationSetting(IntentConfirmationSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("intentClosingSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setIntentClosingSetting(IntentClosingSettingJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputContexts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setInputContexts(new ListUnmarshaller<InputContext>(InputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputContexts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setOutputContexts(new ListUnmarshaller<OutputContext>(OutputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("kendraConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setKendraConfiguration(KendraConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("botId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setBotId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("botVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setBotVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("localeId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setLocaleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("initialResponseSetting", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentResult.setInitialResponseSetting(InitialResponseSettingJsonUnmarshaller.getInstance().unmarshall(context));
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

        return createIntentResult;
    }

    private static CreateIntentResultJsonUnmarshaller instance;

    public static CreateIntentResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIntentResultJsonUnmarshaller();
        return instance;
    }
}
