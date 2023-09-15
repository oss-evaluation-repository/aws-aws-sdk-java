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
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * MultiplexProgramPacketIdentifiersMap JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiplexProgramPacketIdentifiersMapJsonUnmarshaller implements Unmarshaller<MultiplexProgramPacketIdentifiersMap, JsonUnmarshallerContext> {

    public MultiplexProgramPacketIdentifiersMap unmarshall(JsonUnmarshallerContext context) throws Exception {
        MultiplexProgramPacketIdentifiersMap multiplexProgramPacketIdentifiersMap = new MultiplexProgramPacketIdentifiersMap();

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
                if (context.testExpression("audioPids", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setAudioPids(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("dvbSubPids", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setDvbSubPids(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("dvbTeletextPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setDvbTeletextPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("etvPlatformPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setEtvPlatformPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("etvSignalPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setEtvSignalPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("klvDataPids", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setKlvDataPids(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("pcrPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setPcrPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("pmtPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setPmtPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("privateMetadataPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setPrivateMetadataPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("scte27Pids", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setScte27Pids(new ListUnmarshaller<Integer>(context.getUnmarshaller(Integer.class))

                    .unmarshall(context));
                }
                if (context.testExpression("scte35Pid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setScte35Pid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("timedMetadataPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setTimedMetadataPid(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("videoPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    multiplexProgramPacketIdentifiersMap.setVideoPid(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return multiplexProgramPacketIdentifiersMap;
    }

    private static MultiplexProgramPacketIdentifiersMapJsonUnmarshaller instance;

    public static MultiplexProgramPacketIdentifiersMapJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MultiplexProgramPacketIdentifiersMapJsonUnmarshaller();
        return instance;
    }
}
