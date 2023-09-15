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
package com.amazonaws.services.wellarchitected.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.wellarchitected.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CheckDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CheckDetailJsonUnmarshaller implements Unmarshaller<CheckDetail, JsonUnmarshallerContext> {

    public CheckDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        CheckDetail checkDetail = new CheckDetail();

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
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Provider", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setProvider(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LensArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setLensArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PillarId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setPillarId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuestionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setQuestionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ChoiceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setChoiceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FlaggedResources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setFlaggedResources(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Reason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    checkDetail.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return checkDetail;
    }

    private static CheckDetailJsonUnmarshaller instance;

    public static CheckDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CheckDetailJsonUnmarshaller();
        return instance;
    }
}
