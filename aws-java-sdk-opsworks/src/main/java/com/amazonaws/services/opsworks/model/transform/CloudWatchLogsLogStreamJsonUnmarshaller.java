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
package com.amazonaws.services.opsworks.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opsworks.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CloudWatchLogsLogStream JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchLogsLogStreamJsonUnmarshaller implements Unmarshaller<CloudWatchLogsLogStream, JsonUnmarshallerContext> {

    public CloudWatchLogsLogStream unmarshall(JsonUnmarshallerContext context) throws Exception {
        CloudWatchLogsLogStream cloudWatchLogsLogStream = new CloudWatchLogsLogStream();

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
                if (context.testExpression("LogGroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setLogGroupName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatetimeFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setDatetimeFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TimeZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setTimeZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("File", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setFile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FileFingerprintLines", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setFileFingerprintLines(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MultiLineStartPattern", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setMultiLineStartPattern(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InitialPosition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setInitialPosition(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Encoding", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setEncoding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BufferDuration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setBufferDuration(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BatchCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setBatchCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("BatchSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    cloudWatchLogsLogStream.setBatchSize(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return cloudWatchLogsLogStream;
    }

    private static CloudWatchLogsLogStreamJsonUnmarshaller instance;

    public static CloudWatchLogsLogStreamJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchLogsLogStreamJsonUnmarshaller();
        return instance;
    }
}
