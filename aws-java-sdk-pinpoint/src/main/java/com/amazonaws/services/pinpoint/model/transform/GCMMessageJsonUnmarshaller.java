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
 * GCMMessage JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GCMMessageJsonUnmarshaller implements Unmarshaller<GCMMessage, JsonUnmarshallerContext> {

    public GCMMessage unmarshall(JsonUnmarshallerContext context) throws Exception {
        GCMMessage gCMMessage = new GCMMessage();

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
                    gCMMessage.setAction(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Body", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setBody(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CollapseKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setCollapseKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Data", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setData(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("IconReference", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setIconReference(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageIconUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setImageIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImageUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setImageUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreferredAuthenticationMethod", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setPreferredAuthenticationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Priority", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setPriority(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RawContent", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setRawContent(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RestrictedPackageName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setRestrictedPackageName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SilentPush", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setSilentPush(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SmallImageIconUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setSmallImageIconUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Sound", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setSound(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Substitutions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setSubstitutions(new MapUnmarshaller<String, java.util.List<String>>(context.getUnmarshaller(String.class),
                            new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    ).unmarshall(context));
                }
                if (context.testExpression("TimeToLive", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setTimeToLive(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Url", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    gCMMessage.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
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

        return gCMMessage;
    }

    private static GCMMessageJsonUnmarshaller instance;

    public static GCMMessageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GCMMessageJsonUnmarshaller();
        return instance;
    }
}
