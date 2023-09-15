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
package com.amazonaws.services.datasync.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.datasync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Options JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OptionsJsonUnmarshaller implements Unmarshaller<Options, JsonUnmarshallerContext> {

    public Options unmarshall(JsonUnmarshallerContext context) throws Exception {
        Options options = new Options();

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
                if (context.testExpression("VerifyMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setVerifyMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OverwriteMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setOverwriteMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Atime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setAtime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Mtime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setMtime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Uid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setUid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Gid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setGid(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreserveDeletedFiles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setPreserveDeletedFiles(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PreserveDevices", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setPreserveDevices(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PosixPermissions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setPosixPermissions(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("BytesPerSecond", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setBytesPerSecond(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("TaskQueueing", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setTaskQueueing(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LogLevel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setLogLevel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TransferMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setTransferMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecurityDescriptorCopyFlags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setSecurityDescriptorCopyFlags(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ObjectTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    options.setObjectTags(context.getUnmarshaller(String.class).unmarshall(context));
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

        return options;
    }

    private static OptionsJsonUnmarshaller instance;

    public static OptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OptionsJsonUnmarshaller();
        return instance;
    }
}
