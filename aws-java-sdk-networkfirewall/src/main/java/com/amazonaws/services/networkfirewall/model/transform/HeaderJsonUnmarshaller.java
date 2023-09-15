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
package com.amazonaws.services.networkfirewall.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkfirewall.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Header JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HeaderJsonUnmarshaller implements Unmarshaller<Header, JsonUnmarshallerContext> {

    public Header unmarshall(JsonUnmarshallerContext context) throws Exception {
        Header header = new Header();

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
                if (context.testExpression("Protocol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    header.setProtocol(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    header.setSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourcePort", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    header.setSourcePort(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Direction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    header.setDirection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Destination", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    header.setDestination(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationPort", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    header.setDestinationPort(context.getUnmarshaller(String.class).unmarshall(context));
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

        return header;
    }

    private static HeaderJsonUnmarshaller instance;

    public static HeaderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HeaderJsonUnmarshaller();
        return instance;
    }
}
