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
package com.amazonaws.services.dynamodbv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImportTableDescription JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTableDescriptionJsonUnmarshaller implements Unmarshaller<ImportTableDescription, JsonUnmarshallerContext> {

    public ImportTableDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImportTableDescription importTableDescription = new ImportTableDescription();

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
                if (context.testExpression("ImportArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setImportArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ImportStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setImportStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setTableArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setTableId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ClientToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setClientToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setS3BucketSource(S3BucketSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ErrorCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setErrorCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("CloudWatchLogGroupArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setCloudWatchLogGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setInputFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputFormatOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setInputFormatOptions(InputFormatOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InputCompressionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setInputCompressionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TableCreationParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setTableCreationParameters(TableCreationParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("EndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ProcessedSizeBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setProcessedSizeBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ProcessedItemCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setProcessedItemCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ImportedItemCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setImportedItemCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("FailureCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setFailureCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    importTableDescription.setFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
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

        return importTableDescription;
    }

    private static ImportTableDescriptionJsonUnmarshaller instance;

    public static ImportTableDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImportTableDescriptionJsonUnmarshaller();
        return instance;
    }
}
