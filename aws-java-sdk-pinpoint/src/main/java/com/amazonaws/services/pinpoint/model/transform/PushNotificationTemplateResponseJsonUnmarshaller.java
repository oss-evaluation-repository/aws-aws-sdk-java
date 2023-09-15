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
 * PushNotificationTemplateResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PushNotificationTemplateResponseJsonUnmarshaller implements Unmarshaller<PushNotificationTemplateResponse, JsonUnmarshallerContext> {

    public PushNotificationTemplateResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        PushNotificationTemplateResponse pushNotificationTemplateResponse = new PushNotificationTemplateResponse();

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
                if (context.testExpression("ADM", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setADM(AndroidPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("APNS", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setAPNS(APNSPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Baidu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setBaidu(AndroidPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Default", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setDefault(DefaultPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultSubstitutions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setDefaultSubstitutions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GCM", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setGCM(AndroidPushNotificationTemplateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setLastModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecommenderId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setRecommenderId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("TemplateDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setTemplateDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setTemplateName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TemplateType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setTemplateType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pushNotificationTemplateResponse.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
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

        return pushNotificationTemplateResponse;
    }

    private static PushNotificationTemplateResponseJsonUnmarshaller instance;

    public static PushNotificationTemplateResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PushNotificationTemplateResponseJsonUnmarshaller();
        return instance;
    }
}
