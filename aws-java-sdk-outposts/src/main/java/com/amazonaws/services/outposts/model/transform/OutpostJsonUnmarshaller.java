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
package com.amazonaws.services.outposts.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.outposts.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Outpost JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutpostJsonUnmarshaller implements Unmarshaller<Outpost, JsonUnmarshallerContext> {

    public Outpost unmarshall(JsonUnmarshallerContext context) throws Exception {
        Outpost outpost = new Outpost();

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
                if (context.testExpression("OutpostId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setOutpostId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setOwnerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutpostArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setOutpostArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SiteId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setSiteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LifeCycleStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setLifeCycleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AvailabilityZoneId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("SiteArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setSiteArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SupportedHardwareType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    outpost.setSupportedHardwareType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return outpost;
    }

    private static OutpostJsonUnmarshaller instance;

    public static OutpostJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OutpostJsonUnmarshaller();
        return instance;
    }
}
