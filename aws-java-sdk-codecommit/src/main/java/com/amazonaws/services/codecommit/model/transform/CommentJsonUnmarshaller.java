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
package com.amazonaws.services.codecommit.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codecommit.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Comment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CommentJsonUnmarshaller implements Unmarshaller<Comment, JsonUnmarshallerContext> {

    public Comment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Comment comment = new Comment();

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
                if (context.testExpression("commentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setCommentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("content", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("inReplyTo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setInReplyTo(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("authorArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setAuthorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deleted", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setDeleted(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("clientRequestToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setClientRequestToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("callerReactions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setCallerReactions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("reactionCounts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comment.setReactionCounts(new MapUnmarshaller<String, Integer>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Integer.class)).unmarshall(context));
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

        return comment;
    }

    private static CommentJsonUnmarshaller instance;

    public static CommentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CommentJsonUnmarshaller();
        return instance;
    }
}
