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
 * AndroidPushNotificationTemplate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AndroidPushNotificationTemplateJsonUnmarshaller implements Unmarshaller<AndroidPushNotificationTemplate, JsonUnmarshallerContext> {

    public AndroidPushNotificationTemplate unmarshall(JsonUnmarshallerContext context) throws Exception {
        AndroidPushNotificationTemplate androidPushNotificationTemplate = new AndroidPushNotificationTemplate();

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
                    androidPushNotificationTemplate.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Body", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    androidPushNotificationTemplate.setBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageIconUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    androidPushNotificationTemplate.setImageIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    androidPushNotificationTemplate.setImageUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RawContent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    androidPushNotificationTemplate.setRawContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SmallImageIconUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    androidPushNotificationTemplate.setSmallImageIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sound", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    androidPushNotificationTemplate.setSound(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    androidPushNotificationTemplate.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    androidPushNotificationTemplate.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
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

        return androidPushNotificationTemplate;
    }

    private static AndroidPushNotificationTemplateJsonUnmarshaller instance;

    public static AndroidPushNotificationTemplateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AndroidPushNotificationTemplateJsonUnmarshaller();
        return instance;
    }
}
