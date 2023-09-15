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
package com.amazonaws.services.qldb.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.qldb.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JournalS3ExportDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JournalS3ExportDescriptionJsonUnmarshaller implements Unmarshaller<JournalS3ExportDescription, JsonUnmarshallerContext> {

    public JournalS3ExportDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        JournalS3ExportDescription journalS3ExportDescription = new JournalS3ExportDescription();

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
                if (context.testExpression("LedgerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journalS3ExportDescription.setLedgerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journalS3ExportDescription.setExportId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExportCreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journalS3ExportDescription.setExportCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journalS3ExportDescription.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InclusiveStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journalS3ExportDescription.setInclusiveStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExclusiveEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journalS3ExportDescription.setExclusiveEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("S3ExportConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journalS3ExportDescription.setS3ExportConfiguration(S3ExportConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journalS3ExportDescription.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OutputFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    journalS3ExportDescription.setOutputFormat(context.getUnmarshaller(String.class).unmarshall(context));
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

        return journalS3ExportDescription;
    }

    private static JournalS3ExportDescriptionJsonUnmarshaller instance;

    public static JournalS3ExportDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JournalS3ExportDescriptionJsonUnmarshaller();
        return instance;
    }
}
