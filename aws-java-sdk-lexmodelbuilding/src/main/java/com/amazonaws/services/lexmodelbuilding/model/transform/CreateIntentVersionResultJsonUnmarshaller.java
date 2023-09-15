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
 * CreateIntentVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntentVersionResultJsonUnmarshaller implements Unmarshaller<CreateIntentVersionResult, JsonUnmarshallerContext> {

    public CreateIntentVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIntentVersionResult createIntentVersionResult = new CreateIntentVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createIntentVersionResult;
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
                    createIntentVersionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("slots", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setSlots(new ListUnmarshaller<Slot>(SlotJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("sampleUtterances", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setSampleUtterances(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("confirmationPrompt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setConfirmationPrompt(PromptJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rejectionStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setRejectionStatement(StatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("followUpPrompt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setFollowUpPrompt(FollowUpPromptJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("conclusionStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setConclusionStatement(StatementJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dialogCodeHook", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setDialogCodeHook(CodeHookJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fulfillmentActivity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setFulfillmentActivity(FulfillmentActivityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("parentIntentSignature", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setParentIntentSignature(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setLastUpdatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setCreatedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("checksum", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setChecksum(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("kendraConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setKendraConfiguration(KendraConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("inputContexts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setInputContexts(new ListUnmarshaller<InputContext>(InputContextJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("outputContexts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createIntentVersionResult.setOutputContexts(new ListUnmarshaller<OutputContext>(OutputContextJsonUnmarshaller.getInstance())

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

        return createIntentVersionResult;
    }

    private static CreateIntentVersionResultJsonUnmarshaller instance;

    public static CreateIntentVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIntentVersionResultJsonUnmarshaller();
        return instance;
    }
}
