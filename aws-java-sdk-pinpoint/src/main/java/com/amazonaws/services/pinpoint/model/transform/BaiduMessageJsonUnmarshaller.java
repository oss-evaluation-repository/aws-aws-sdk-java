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
 * BaiduMessage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BaiduMessageJsonUnmarshaller implements Unmarshaller<BaiduMessage, JsonUnmarshallerContext> {

    public BaiduMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        BaiduMessage baiduMessage = new BaiduMessage();

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
                if (context.testExpression("Action", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Body", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Data", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setData(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("IconReference", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setIconReference(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageIconUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setImageIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setImageUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RawContent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setRawContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SilentPush", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setSilentPush(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SmallImageIconUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setSmallImageIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sound", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setSound(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Substitutions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setSubstitutions(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("TimeToLive", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setTimeToLive(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    baiduMessage.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
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

        return baiduMessage;
    }

    private static BaiduMessageJsonUnmarshaller instance;

    public static BaiduMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BaiduMessageJsonUnmarshaller();
        return instance;
    }
}
