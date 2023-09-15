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
package com.amazonaws.services.connectparticipant.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.connectparticipant.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Item JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ItemJsonUnmarshaller implements Unmarshaller<Item, JsonUnmarshallerContext> {

    public Item unmarshall(JsonUnmarshallerContext context) throws Exception {
        Item item = new Item();

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
                if (context.testExpression("AbsoluteTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setAbsoluteTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Content", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContentType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setContentType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParticipantId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setParticipantId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ParticipantRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setParticipantRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Attachments", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setAttachments(new ListUnmarshaller<AttachmentItem>(AttachmentItemJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MessageMetadata", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setMessageMetadata(MessageMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RelatedContactId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setRelatedContactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ContactId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    item.setContactId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return item;
    }

    private static ItemJsonUnmarshaller instance;

    public static ItemJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ItemJsonUnmarshaller();
        return instance;
    }
}
