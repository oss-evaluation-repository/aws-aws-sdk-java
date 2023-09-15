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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AutomationRulesFindingFilters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomationRulesFindingFiltersJsonUnmarshaller implements Unmarshaller<AutomationRulesFindingFilters, JsonUnmarshallerContext> {

    public AutomationRulesFindingFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutomationRulesFindingFilters automationRulesFindingFilters = new AutomationRulesFindingFilters();

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
                if (context.testExpression("ProductArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setProductArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setAwsAccountId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GeneratorId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setGeneratorId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FirstObservedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setFirstObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LastObservedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setLastObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setCreatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setUpdatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Confidence", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setConfidence(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Criticality", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setCriticality(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setTitle(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setDescription(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SourceUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setSourceUrl(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProductName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setProductName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CompanyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setCompanyName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SeverityLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setSeverityLabel(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setResourceType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setResourceId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourcePartition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setResourcePartition(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setResourceRegion(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setResourceTags(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceDetailsOther", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setResourceDetailsOther(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ComplianceStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setComplianceStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ComplianceSecurityControlId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setComplianceSecurityControlId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ComplianceAssociatedStandardsId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setComplianceAssociatedStandardsId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VerificationState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setVerificationState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("WorkflowStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setWorkflowStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RecordState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setRecordState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RelatedFindingsProductArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setRelatedFindingsProductArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RelatedFindingsId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setRelatedFindingsId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NoteText", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setNoteText(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NoteUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setNoteUpdatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NoteUpdatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setNoteUpdatedBy(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserDefinedFields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    automationRulesFindingFilters.setUserDefinedFields(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

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

        return automationRulesFindingFilters;
    }

    private static AutomationRulesFindingFiltersJsonUnmarshaller instance;

    public static AutomationRulesFindingFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutomationRulesFindingFiltersJsonUnmarshaller();
        return instance;
    }
}
