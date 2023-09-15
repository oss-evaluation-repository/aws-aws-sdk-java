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
package com.amazonaws.services.iotfleetwise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotfleetwise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ObdSignal JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObdSignalJsonUnmarshaller implements Unmarshaller<ObdSignal, JsonUnmarshallerContext> {

    public ObdSignal unmarshall(JsonUnmarshallerContext context) throws Exception {
        ObdSignal obdSignal = new ObdSignal();

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
                if (context.testExpression("pidResponseLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    obdSignal.setPidResponseLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("serviceMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    obdSignal.setServiceMode(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    obdSignal.setPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scaling", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    obdSignal.setScaling(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("offset", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    obdSignal.setOffset(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("startByte", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    obdSignal.setStartByte(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("byteLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    obdSignal.setByteLength(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bitRightShift", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    obdSignal.setBitRightShift(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("bitMaskLength", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    obdSignal.setBitMaskLength(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return obdSignal;
    }

    private static ObdSignalJsonUnmarshaller instance;

    public static ObdSignalJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ObdSignalJsonUnmarshaller();
        return instance;
    }
}
