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
package com.amazonaws.services.oam.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.oam.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ListLinksItem JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListLinksItemJsonUnmarshaller implements Unmarshaller<ListLinksItem, JsonUnmarshallerContext> {

    public ListLinksItem unmarshall(JsonUnmarshallerContext context) throws Exception {
        ListLinksItem listLinksItem = new ListLinksItem();

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
                    listLinksItem.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listLinksItem.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Label", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listLinksItem.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResourceTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listLinksItem.setResourceTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SinkArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    listLinksItem.setSinkArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return listLinksItem;
    }

    private static ListLinksItemJsonUnmarshaller instance;

    public static ListLinksItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ListLinksItemJsonUnmarshaller();
        return instance;
    }
}
