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
 * ResourceDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetailsJsonUnmarshaller implements Unmarshaller<ResourceDetails, JsonUnmarshallerContext> {

    public ResourceDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceDetails resourceDetails = new ResourceDetails();

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
                if (context.testExpression("AwsAutoScalingAutoScalingGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsAutoScalingAutoScalingGroup(AwsAutoScalingAutoScalingGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsCodeBuildProject", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsCodeBuildProject(AwsCodeBuildProjectDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsCloudFrontDistribution", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsCloudFrontDistribution(AwsCloudFrontDistributionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2Instance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2Instance(AwsEc2InstanceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2NetworkInterface", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2NetworkInterface(AwsEc2NetworkInterfaceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2SecurityGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2SecurityGroup(AwsEc2SecurityGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2Volume", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2Volume(AwsEc2VolumeDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2Vpc", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2Vpc(AwsEc2VpcDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2Eip", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2Eip(AwsEc2EipDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2Subnet", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2Subnet(AwsEc2SubnetDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2NetworkAcl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2NetworkAcl(AwsEc2NetworkAclDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsElbv2LoadBalancer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsElbv2LoadBalancer(AwsElbv2LoadBalancerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsElasticBeanstalkEnvironment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsElasticBeanstalkEnvironment(AwsElasticBeanstalkEnvironmentDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsElasticsearchDomain", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsElasticsearchDomain(AwsElasticsearchDomainDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsS3Bucket", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsS3Bucket(AwsS3BucketDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsS3AccountPublicAccessBlock", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsS3AccountPublicAccessBlock(AwsS3AccountPublicAccessBlockDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsS3Object", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsS3Object(AwsS3ObjectDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsSecretsManagerSecret", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsSecretsManagerSecret(AwsSecretsManagerSecretDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsIamAccessKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsIamAccessKey(AwsIamAccessKeyDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsIamUser", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsIamUser(AwsIamUserDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsIamPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsIamPolicy(AwsIamPolicyDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsApiGatewayV2Stage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsApiGatewayV2Stage(AwsApiGatewayV2StageDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsApiGatewayV2Api", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsApiGatewayV2Api(AwsApiGatewayV2ApiDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsDynamoDbTable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsDynamoDbTable(AwsDynamoDbTableDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsApiGatewayStage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsApiGatewayStage(AwsApiGatewayStageDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsApiGatewayRestApi", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsApiGatewayRestApi(AwsApiGatewayRestApiDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsCloudTrailTrail", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsCloudTrailTrail(AwsCloudTrailTrailDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsSsmPatchCompliance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsSsmPatchCompliance(AwsSsmPatchComplianceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsCertificateManagerCertificate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsCertificateManagerCertificate(AwsCertificateManagerCertificateDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("AwsRedshiftCluster", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsRedshiftCluster(AwsRedshiftClusterDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsElbLoadBalancer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsElbLoadBalancer(AwsElbLoadBalancerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsIamGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsIamGroup(AwsIamGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsIamRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsIamRole(AwsIamRoleDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsKmsKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsKmsKey(AwsKmsKeyDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsLambdaFunction", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsLambdaFunction(AwsLambdaFunctionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsLambdaLayerVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsLambdaLayerVersion(AwsLambdaLayerVersionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsRdsDbInstance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsRdsDbInstance(AwsRdsDbInstanceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsSnsTopic", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsSnsTopic(AwsSnsTopicDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsSqsQueue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsSqsQueue(AwsSqsQueueDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafWebAcl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafWebAcl(AwsWafWebAclDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsRdsDbSnapshot", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsRdsDbSnapshot(AwsRdsDbSnapshotDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsRdsDbClusterSnapshot", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsRdsDbClusterSnapshot(AwsRdsDbClusterSnapshotDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsRdsDbCluster", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsRdsDbCluster(AwsRdsDbClusterDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEcsCluster", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEcsCluster(AwsEcsClusterDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEcsContainer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEcsContainer(AwsEcsContainerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEcsTaskDefinition", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEcsTaskDefinition(AwsEcsTaskDefinitionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Container", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setContainer(ContainerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Other", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setOther(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("AwsRdsEventSubscription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsRdsEventSubscription(AwsRdsEventSubscriptionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEcsService", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEcsService(AwsEcsServiceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsAutoScalingLaunchConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsAutoScalingLaunchConfiguration(AwsAutoScalingLaunchConfigurationDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("AwsEc2VpnConnection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2VpnConnection(AwsEc2VpnConnectionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEcrContainerImage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEcrContainerImage(AwsEcrContainerImageDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsOpenSearchServiceDomain", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsOpenSearchServiceDomain(AwsOpenSearchServiceDomainDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2VpcEndpointService", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2VpcEndpointService(AwsEc2VpcEndpointServiceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsXrayEncryptionConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsXrayEncryptionConfig(AwsXrayEncryptionConfigDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafRateBasedRule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafRateBasedRule(AwsWafRateBasedRuleDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafRegionalRateBasedRule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafRegionalRateBasedRule(AwsWafRegionalRateBasedRuleDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEcrRepository", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEcrRepository(AwsEcrRepositoryDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEksCluster", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEksCluster(AwsEksClusterDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsNetworkFirewallFirewallPolicy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsNetworkFirewallFirewallPolicy(AwsNetworkFirewallFirewallPolicyDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("AwsNetworkFirewallFirewall", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsNetworkFirewallFirewall(AwsNetworkFirewallFirewallDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsNetworkFirewallRuleGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsNetworkFirewallRuleGroup(AwsNetworkFirewallRuleGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsRdsDbSecurityGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsRdsDbSecurityGroup(AwsRdsDbSecurityGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsKinesisStream", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsKinesisStream(AwsKinesisStreamDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2TransitGateway", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2TransitGateway(AwsEc2TransitGatewayDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEfsAccessPoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEfsAccessPoint(AwsEfsAccessPointDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsCloudFormationStack", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsCloudFormationStack(AwsCloudFormationStackDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsCloudWatchAlarm", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsCloudWatchAlarm(AwsCloudWatchAlarmDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2VpcPeeringConnection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2VpcPeeringConnection(AwsEc2VpcPeeringConnectionDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafRegionalRuleGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafRegionalRuleGroup(AwsWafRegionalRuleGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafRegionalRule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafRegionalRule(AwsWafRegionalRuleDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafRegionalWebAcl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafRegionalWebAcl(AwsWafRegionalWebAclDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafRule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafRule(AwsWafRuleDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafRuleGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafRuleGroup(AwsWafRuleGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEcsTask", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEcsTask(AwsEcsTaskDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsBackupBackupVault", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsBackupBackupVault(AwsBackupBackupVaultDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsBackupBackupPlan", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsBackupBackupPlan(AwsBackupBackupPlanDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsBackupRecoveryPoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsBackupRecoveryPoint(AwsBackupRecoveryPointDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2LaunchTemplate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2LaunchTemplate(AwsEc2LaunchTemplateDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsSageMakerNotebookInstance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsSageMakerNotebookInstance(AwsSageMakerNotebookInstanceDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafv2WebAcl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafv2WebAcl(AwsWafv2WebAclDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsWafv2RuleGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsWafv2RuleGroup(AwsWafv2RuleGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEc2RouteTable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEc2RouteTable(AwsEc2RouteTableDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsAmazonMqBroker", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsAmazonMqBroker(AwsAmazonMqBrokerDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsAppSyncGraphQlApi", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsAppSyncGraphQlApi(AwsAppSyncGraphQlApiDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsEventSchemasRegistry", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsEventSchemasRegistry(AwsEventSchemasRegistryDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsGuardDutyDetector", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsGuardDutyDetector(AwsGuardDutyDetectorDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsStepFunctionStateMachine", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsStepFunctionStateMachine(AwsStepFunctionStateMachineDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AwsAthenaWorkGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDetails.setAwsAthenaWorkGroup(AwsAthenaWorkGroupDetailsJsonUnmarshaller.getInstance().unmarshall(context));
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

        return resourceDetails;
    }

    private static ResourceDetailsJsonUnmarshaller instance;

    public static ResourceDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDetailsJsonUnmarshaller();
        return instance;
    }
}
