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
 * AwsSecurityFindingFilters JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSecurityFindingFiltersJsonUnmarshaller implements Unmarshaller<AwsSecurityFindingFilters, JsonUnmarshallerContext> {

    public AwsSecurityFindingFilters unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsSecurityFindingFilters awsSecurityFindingFilters = new AwsSecurityFindingFilters();

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
                    awsSecurityFindingFilters.setProductArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("AwsAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setAwsAccountId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("GeneratorId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setGeneratorId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Region", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setRegion(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FirstObservedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setFirstObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LastObservedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setLastObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setCreatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setUpdatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SeverityProduct", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setSeverityProduct(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SeverityNormalized", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setSeverityNormalized(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SeverityLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setSeverityLabel(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Confidence", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setConfidence(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Criticality", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setCriticality(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setTitle(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setDescription(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RecommendationText", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setRecommendationText(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("SourceUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setSourceUrl(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProductFields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setProductFields(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProductName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setProductName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CompanyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setCompanyName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserDefinedFields", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setUserDefinedFields(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MalwareName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setMalwareName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MalwareType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setMalwareType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MalwarePath", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setMalwarePath(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("MalwareState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setMalwareState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkDirection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDirection(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkProtocol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkProtocol(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkSourceIpV4", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourceIpV4(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkSourceIpV6", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourceIpV6(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkSourcePort", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourcePort(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkSourceDomain", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourceDomain(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkSourceMac", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkSourceMac(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkDestinationIpV4", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDestinationIpV4(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkDestinationIpV6", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDestinationIpV6(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkDestinationPort", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDestinationPort(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NetworkDestinationDomain", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNetworkDestinationDomain(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProcessName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProcessPath", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessPath(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProcessPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessPid(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProcessParentPid", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessParentPid(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProcessLaunchedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessLaunchedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProcessTerminatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setProcessTerminatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorValue(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorCategory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorCategory(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorLastObservedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorLastObservedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorSource(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ThreatIntelIndicatorSourceUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setThreatIntelIndicatorSourceUrl(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourcePartition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourcePartition(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceRegion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceRegion(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceTags(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceType(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceImageId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceImageId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceIpV4Addresses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceIpV4Addresses(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceIpV6Addresses", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceIpV6Addresses(new ListUnmarshaller<IpFilter>(IpFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceKeyName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceKeyName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceIamInstanceProfileArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceIamInstanceProfileArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceVpcId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceVpcId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceSubnetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceSubnetId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsEc2InstanceLaunchedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsEc2InstanceLaunchedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsS3BucketOwnerId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsS3BucketOwnerId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsS3BucketOwnerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsS3BucketOwnerName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsIamAccessKeyUserName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsIamAccessKeyUserName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsIamAccessKeyPrincipalName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsIamAccessKeyPrincipalName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsIamAccessKeyStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsIamAccessKeyStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsIamAccessKeyCreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsIamAccessKeyCreatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceAwsIamUserUserName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceAwsIamUserUserName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceContainerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceContainerName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceContainerImageId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceContainerImageId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceContainerImageName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceContainerImageName(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceContainerLaunchedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceContainerLaunchedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ResourceDetailsOther", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setResourceDetailsOther(new ListUnmarshaller<MapFilter>(MapFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ComplianceStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setComplianceStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VerificationState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setVerificationState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("WorkflowState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setWorkflowState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("WorkflowStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setWorkflowStatus(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RecordState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setRecordState(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RelatedFindingsProductArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setRelatedFindingsProductArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RelatedFindingsId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setRelatedFindingsId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NoteText", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNoteText(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NoteUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNoteUpdatedAt(new ListUnmarshaller<DateFilter>(DateFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("NoteUpdatedBy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setNoteUpdatedBy(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Keyword", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setKeyword(new ListUnmarshaller<KeywordFilter>(KeywordFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FindingProviderFieldsConfidence", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setFindingProviderFieldsConfidence(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FindingProviderFieldsCriticality", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters
                            .setFindingProviderFieldsCriticality(new ListUnmarshaller<NumberFilter>(NumberFilterJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("FindingProviderFieldsRelatedFindingsId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setFindingProviderFieldsRelatedFindingsId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FindingProviderFieldsRelatedFindingsProductArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setFindingProviderFieldsRelatedFindingsProductArn(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FindingProviderFieldsSeverityLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setFindingProviderFieldsSeverityLabel(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FindingProviderFieldsSeverityOriginal", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setFindingProviderFieldsSeverityOriginal(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("FindingProviderFieldsTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setFindingProviderFieldsTypes(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("Sample", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setSample(new ListUnmarshaller<BooleanFilter>(BooleanFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ComplianceSecurityControlId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setComplianceSecurityControlId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ComplianceAssociatedStandardsId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsSecurityFindingFilters.setComplianceAssociatedStandardsId(new ListUnmarshaller<StringFilter>(StringFilterJsonUnmarshaller.getInstance())

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

        return awsSecurityFindingFilters;
    }

    private static AwsSecurityFindingFiltersJsonUnmarshaller instance;

    public static AwsSecurityFindingFiltersJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsSecurityFindingFiltersJsonUnmarshaller();
        return instance;
    }
}
