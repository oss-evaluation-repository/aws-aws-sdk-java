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
package com.amazonaws.services.batch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LinuxParameters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LinuxParametersJsonUnmarshaller implements Unmarshaller<LinuxParameters, JsonUnmarshallerContext> {

    public LinuxParameters unmarshall(JsonUnmarshallerContext context) throws Exception {
        LinuxParameters linuxParameters = new LinuxParameters();

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
                if (context.testExpression("devices", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    linuxParameters.setDevices(new ListUnmarshaller<Device>(DeviceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("initProcessEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    linuxParameters.setInitProcessEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("sharedMemorySize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    linuxParameters.setSharedMemorySize(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tmpfs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    linuxParameters.setTmpfs(new ListUnmarshaller<Tmpfs>(TmpfsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("maxSwap", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    linuxParameters.setMaxSwap(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("swappiness", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    linuxParameters.setSwappiness(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return linuxParameters;
    }

    private static LinuxParametersJsonUnmarshaller instance;

    public static LinuxParametersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LinuxParametersJsonUnmarshaller();
        return instance;
    }
}
