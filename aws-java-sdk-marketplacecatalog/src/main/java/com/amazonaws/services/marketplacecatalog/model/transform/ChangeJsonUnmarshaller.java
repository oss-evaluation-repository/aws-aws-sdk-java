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
package com.amazonaws.services.marketplacecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.marketplacecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Change JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangeJsonUnmarshaller implements Unmarshaller<Change, JsonUnmarshallerContext> {

    public Change unmarshall(JsonUnmarshallerContext context) throws Exception {
        Change change = new Change();

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
                if (context.testExpression("ChangeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    change.setChangeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Entity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    change.setEntity(EntityJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EntityTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    change.setEntityTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Details", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    change.setDetails(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChangeName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    change.setChangeName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return change;
    }

    private static ChangeJsonUnmarshaller instance;

    public static ChangeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChangeJsonUnmarshaller();
        return instance;
    }
}
