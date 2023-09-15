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
package com.amazonaws.services.ivschat.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ivschat.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateRoomResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRoomResultJsonUnmarshaller implements Unmarshaller<UpdateRoomResult, JsonUnmarshallerContext> {

    public UpdateRoomResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateRoomResult updateRoomResult = new UpdateRoomResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateRoomResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setCreateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("loggingConfigurationIdentifiers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setLoggingConfigurationIdentifiers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("maximumMessageLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setMaximumMessageLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("maximumMessageRatePerSecond", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setMaximumMessageRatePerSecond(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("messageReviewHandler", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setMessageReviewHandler(MessageReviewHandlerJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateRoomResult.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
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

        return updateRoomResult;
    }

    private static UpdateRoomResultJsonUnmarshaller instance;

    public static UpdateRoomResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateRoomResultJsonUnmarshaller();
        return instance;
    }
}
