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
package com.amazonaws.services.pinpoint.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InAppTemplateResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppTemplateResponseJsonUnmarshaller implements Unmarshaller<InAppTemplateResponse, JsonUnmarshallerContext> {

    public InAppTemplateResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        InAppTemplateResponse inAppTemplateResponse = new InAppTemplateResponse();

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
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setContent(new ListUnmarshaller<InAppMessageContent>(InAppMessageContentJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setCustomConfig(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Layout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setLayout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TemplateDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setTemplateDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setTemplateType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    inAppTemplateResponse.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
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

        return inAppTemplateResponse;
    }

    private static InAppTemplateResponseJsonUnmarshaller instance;

    public static InAppTemplateResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InAppTemplateResponseJsonUnmarshaller();
        return instance;
    }
}
