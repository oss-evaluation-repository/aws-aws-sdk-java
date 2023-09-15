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
package com.amazonaws.services.medicalimaging.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medicalimaging.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DICOMImportJobSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DICOMImportJobSummaryJsonUnmarshaller implements Unmarshaller<DICOMImportJobSummary, JsonUnmarshallerContext> {

    public DICOMImportJobSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        DICOMImportJobSummary dICOMImportJobSummary = new DICOMImportJobSummary();

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
                if (context.testExpression("jobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dICOMImportJobSummary.setJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dICOMImportJobSummary.setJobName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("jobStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dICOMImportJobSummary.setJobStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datastoreId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dICOMImportJobSummary.setDatastoreId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dICOMImportJobSummary.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("endedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dICOMImportJobSummary.setEndedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("submittedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dICOMImportJobSummary.setSubmittedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dICOMImportJobSummary.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
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

        return dICOMImportJobSummary;
    }

    private static DICOMImportJobSummaryJsonUnmarshaller instance;

    public static DICOMImportJobSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DICOMImportJobSummaryJsonUnmarshaller();
        return instance;
    }
}
