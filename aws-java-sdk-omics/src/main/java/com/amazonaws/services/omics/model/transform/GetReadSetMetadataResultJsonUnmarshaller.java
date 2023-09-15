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
package com.amazonaws.services.omics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.omics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetReadSetMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReadSetMetadataResultJsonUnmarshaller implements Unmarshaller<GetReadSetMetadataResult, JsonUnmarshallerContext> {

    public GetReadSetMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetReadSetMetadataResult getReadSetMetadataResult = new GetReadSetMetadataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getReadSetMetadataResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sequenceStoreId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setSequenceStoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("subjectId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setSubjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sampleId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setSampleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("fileType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setFileType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("sequenceInformation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setSequenceInformation(SequenceInformationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("referenceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setReferenceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("files", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setFiles(ReadSetFilesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getReadSetMetadataResult.setCreationType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getReadSetMetadataResult;
    }

    private static GetReadSetMetadataResultJsonUnmarshaller instance;

    public static GetReadSetMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetReadSetMetadataResultJsonUnmarshaller();
        return instance;
    }
}
