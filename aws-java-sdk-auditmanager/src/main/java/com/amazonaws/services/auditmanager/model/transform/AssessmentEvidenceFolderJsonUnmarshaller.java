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
package com.amazonaws.services.auditmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.auditmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssessmentEvidenceFolder JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentEvidenceFolderJsonUnmarshaller implements Unmarshaller<AssessmentEvidenceFolder, JsonUnmarshallerContext> {

    public AssessmentEvidenceFolder unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentEvidenceFolder assessmentEvidenceFolder = new AssessmentEvidenceFolder();

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
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("date", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("assessmentId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setAssessmentId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("controlSetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setControlSetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("controlId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setControlId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setDataSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("author", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setAuthor(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalEvidence", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setTotalEvidence(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("assessmentReportSelectionCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setAssessmentReportSelectionCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("controlName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setControlName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("evidenceResourcesIncludedCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setEvidenceResourcesIncludedCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("evidenceByTypeConfigurationDataCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setEvidenceByTypeConfigurationDataCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("evidenceByTypeManualCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setEvidenceByTypeManualCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("evidenceByTypeComplianceCheckCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setEvidenceByTypeComplianceCheckCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("evidenceByTypeComplianceCheckIssuesCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setEvidenceByTypeComplianceCheckIssuesCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("evidenceByTypeUserActivityCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setEvidenceByTypeUserActivityCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("evidenceAwsServiceSourceCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    assessmentEvidenceFolder.setEvidenceAwsServiceSourceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return assessmentEvidenceFolder;
    }

    private static AssessmentEvidenceFolderJsonUnmarshaller instance;

    public static AssessmentEvidenceFolderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentEvidenceFolderJsonUnmarshaller();
        return instance;
    }
}
