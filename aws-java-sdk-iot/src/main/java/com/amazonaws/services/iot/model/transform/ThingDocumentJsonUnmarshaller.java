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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ThingDocument JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThingDocumentJsonUnmarshaller implements Unmarshaller<ThingDocument, JsonUnmarshallerContext> {

    public ThingDocument unmarshall(JsonUnmarshallerContext context) throws Exception {
        ThingDocument thingDocument = new ThingDocument();

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
                if (context.testExpression("thingName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    thingDocument.setThingName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    thingDocument.setThingId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingTypeName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    thingDocument.setThingTypeName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("thingGroupNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    thingDocument.setThingGroupNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("attributes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    thingDocument.setAttributes(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("shadow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    thingDocument.setShadow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("deviceDefender", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    thingDocument.setDeviceDefender(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectivity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    thingDocument.setConnectivity(ThingConnectivityJsonUnmarshaller.getInstance().unmarshall(context));
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

        return thingDocument;
    }

    private static ThingDocumentJsonUnmarshaller instance;

    public static ThingDocumentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ThingDocumentJsonUnmarshaller();
        return instance;
    }
}
