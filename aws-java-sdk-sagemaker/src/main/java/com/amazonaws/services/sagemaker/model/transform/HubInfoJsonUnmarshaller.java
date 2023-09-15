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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * HubInfo JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HubInfoJsonUnmarshaller implements Unmarshaller<HubInfo, JsonUnmarshallerContext> {

    public HubInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        HubInfo hubInfo = new HubInfo();

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
                if (context.testExpression("HubName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hubInfo.setHubName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hubInfo.setHubArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubDisplayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hubInfo.setHubDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hubInfo.setHubDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("HubSearchKeywords", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hubInfo.setHubSearchKeywords(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("HubStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hubInfo.setHubStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hubInfo.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    hubInfo.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return hubInfo;
    }

    private static HubInfoJsonUnmarshaller instance;

    public static HubInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HubInfoJsonUnmarshaller();
        return instance;
    }
}
