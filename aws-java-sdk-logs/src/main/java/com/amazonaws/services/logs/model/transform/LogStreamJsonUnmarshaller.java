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
package com.amazonaws.services.logs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * LogStream JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LogStreamJsonUnmarshaller implements Unmarshaller<LogStream, JsonUnmarshallerContext> {

    public LogStream unmarshall(JsonUnmarshallerContext context) throws Exception {
        LogStream logStream = new LogStream();

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
                if (context.testExpression("logStreamName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    logStream.setLogStreamName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    logStream.setCreationTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("firstEventTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    logStream.setFirstEventTimestamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastEventTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    logStream.setLastEventTimestamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("lastIngestionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    logStream.setLastIngestionTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("uploadSequenceToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    logStream.setUploadSequenceToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    logStream.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("storedBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    logStream.setStoredBytes(context.getUnmarshaller(Long.class).unmarshall(context));
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

        return logStream;
    }

    private static LogStreamJsonUnmarshaller instance;

    public static LogStreamJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LogStreamJsonUnmarshaller();
        return instance;
    }
}
