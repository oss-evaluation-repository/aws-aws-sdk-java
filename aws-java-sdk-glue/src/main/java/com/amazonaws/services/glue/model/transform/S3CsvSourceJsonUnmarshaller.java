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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * S3CsvSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3CsvSourceJsonUnmarshaller implements Unmarshaller<S3CsvSource, JsonUnmarshallerContext> {

    public S3CsvSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        S3CsvSource s3CsvSource = new S3CsvSource();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Paths", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setPaths(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("CompressionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setCompressionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Exclusions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setExclusions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("GroupSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setGroupSize(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupFiles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setGroupFiles(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Recurse", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setRecurse(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MaxBand", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setMaxBand(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxFilesInBand", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setMaxFilesInBand(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setAdditionalOptions(S3DirectSourceAdditionalOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Separator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setSeparator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Escaper", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setEscaper(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QuoteChar", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setQuoteChar(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Multiline", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setMultiline(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("WithHeader", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setWithHeader(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("WriteHeader", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setWriteHeader(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("SkipFirst", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setSkipFirst(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OptimizePerformance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setOptimizePerformance(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("OutputSchemas", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    s3CsvSource.setOutputSchemas(new ListUnmarshaller<GlueSchema>(GlueSchemaJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return s3CsvSource;
    }

    private static S3CsvSourceJsonUnmarshaller instance;

    public static S3CsvSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new S3CsvSourceJsonUnmarshaller();
        return instance;
    }
}
