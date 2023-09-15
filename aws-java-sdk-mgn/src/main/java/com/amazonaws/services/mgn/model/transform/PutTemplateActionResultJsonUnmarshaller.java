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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PutTemplateActionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutTemplateActionResultJsonUnmarshaller implements Unmarshaller<PutTemplateActionResult, JsonUnmarshallerContext> {

    public PutTemplateActionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        PutTemplateActionResult putTemplateActionResult = new PutTemplateActionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return putTemplateActionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("actionID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setActionID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("actionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setActionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("active", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setActive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("category", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setCategory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("documentIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setDocumentIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("documentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setDocumentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setExternalParameters(new MapUnmarshaller<String, SsmExternalParameter>(context.getUnmarshaller(String.class),
                            SsmExternalParameterJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("mustSucceedForCutover", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setMustSucceedForCutover(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("operatingSystem", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setOperatingSystem(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("order", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setOrder(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setParameters(new MapUnmarshaller<String, java.util.List<SsmParameterStoreParameter>>(context
                            .getUnmarshaller(String.class), new ListUnmarshaller<SsmParameterStoreParameter>(SsmParameterStoreParameterJsonUnmarshaller
                            .getInstance())

                    ).unmarshall(context));
                }
                if (context.testExpression("timeoutSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    putTemplateActionResult.setTimeoutSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return putTemplateActionResult;
    }

    private static PutTemplateActionResultJsonUnmarshaller instance;

    public static PutTemplateActionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PutTemplateActionResultJsonUnmarshaller();
        return instance;
    }
}
