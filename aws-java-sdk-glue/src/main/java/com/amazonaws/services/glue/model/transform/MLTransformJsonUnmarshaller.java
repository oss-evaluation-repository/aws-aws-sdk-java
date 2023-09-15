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
 * MLTransform JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MLTransformJsonUnmarshaller implements Unmarshaller<MLTransform, JsonUnmarshallerContext> {

    public MLTransform unmarshall(JsonUnmarshallerContext context) throws Exception {
        MLTransform mLTransform = new MLTransform();

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
                if (context.testExpression("TransformId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setTransformId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setCreatedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setLastModifiedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("InputRecordTables", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setInputRecordTables(new ListUnmarshaller<GlueTable>(GlueTableJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setParameters(TransformParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EvaluationMetrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setEvaluationMetrics(EvaluationMetricsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LabelCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setLabelCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Schema", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setSchema(new ListUnmarshaller<SchemaColumn>(SchemaColumnJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GlueVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setGlueVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaxCapacity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setMaxCapacity(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("WorkerType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setWorkerType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfWorkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setNumberOfWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MaxRetries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setMaxRetries(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("TransformEncryption", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    mLTransform.setTransformEncryption(TransformEncryptionJsonUnmarshaller.getInstance().unmarshall(context));
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

        return mLTransform;
    }

    private static MLTransformJsonUnmarshaller instance;

    public static MLTransformJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MLTransformJsonUnmarshaller();
        return instance;
    }
}
