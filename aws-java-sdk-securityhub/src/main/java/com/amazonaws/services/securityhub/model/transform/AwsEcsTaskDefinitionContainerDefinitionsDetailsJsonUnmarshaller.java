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
 * AwsEcsTaskDefinitionContainerDefinitionsDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller implements
        Unmarshaller<AwsEcsTaskDefinitionContainerDefinitionsDetails, JsonUnmarshallerContext> {

    public AwsEcsTaskDefinitionContainerDefinitionsDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsEcsTaskDefinitionContainerDefinitionsDetails awsEcsTaskDefinitionContainerDefinitionsDetails = new AwsEcsTaskDefinitionContainerDefinitionsDetails();

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
                if (context.testExpression("Command", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Cpu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setCpu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DependsOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setDependsOn(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsDependsOnDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("DisableNetworking", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setDisableNetworking(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("DnsSearchDomains", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setDnsSearchDomains(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DnsServers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setDnsServers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("DockerLabels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setDockerLabels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class),
                            context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("DockerSecurityOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setDockerSecurityOptions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                            .unmarshall(context));
                }
                if (context.testExpression("EntryPoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setEntryPoint(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setEnvironment(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsEnvironmentDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("EnvironmentFiles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setEnvironmentFiles(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsEnvironmentFilesDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Essential", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setEssential(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ExtraHosts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setExtraHosts(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsExtraHostsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("FirelensConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setFirelensConfiguration(AwsEcsTaskDefinitionContainerDefinitionsFirelensConfigurationDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("HealthCheck", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setHealthCheck(AwsEcsTaskDefinitionContainerDefinitionsHealthCheckDetailsJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("Hostname", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Image", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Interactive", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setInteractive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Links", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setLinks(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("LinuxParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setLinuxParameters(AwsEcsTaskDefinitionContainerDefinitionsLinuxParametersDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("LogConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setLogConfiguration(AwsEcsTaskDefinitionContainerDefinitionsLogConfigurationDetailsJsonUnmarshaller.getInstance().unmarshall(
                                    context));
                }
                if (context.testExpression("Memory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setMemory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MemoryReservation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setMemoryReservation(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MountPoints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setMountPoints(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsMountPointsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PortMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setPortMappings(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsPortMappingsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Privileged", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setPrivileged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PseudoTerminal", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setPseudoTerminal(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReadonlyRootFilesystem", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setReadonlyRootFilesystem(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RepositoryCredentials", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setRepositoryCredentials(AwsEcsTaskDefinitionContainerDefinitionsRepositoryCredentialsDetailsJsonUnmarshaller.getInstance()
                                    .unmarshall(context));
                }
                if (context.testExpression("ResourceRequirements", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setResourceRequirements(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsResourceRequirementsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Secrets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setSecrets(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsSecretsDetails>(
                            AwsEcsTaskDefinitionContainerDefinitionsSecretsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("StartTimeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setStartTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("StopTimeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setStopTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("SystemControls", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setSystemControls(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsSystemControlsDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("Ulimits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setUlimits(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetails>(
                            AwsEcsTaskDefinitionContainerDefinitionsUlimitsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("User", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VolumesFrom", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails
                            .setVolumesFrom(new ListUnmarshaller<AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetails>(
                                    AwsEcsTaskDefinitionContainerDefinitionsVolumesFromDetailsJsonUnmarshaller.getInstance())

                            .unmarshall(context));
                }
                if (context.testExpression("WorkingDirectory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    awsEcsTaskDefinitionContainerDefinitionsDetails.setWorkingDirectory(context.getUnmarshaller(String.class).unmarshall(context));
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

        return awsEcsTaskDefinitionContainerDefinitionsDetails;
    }

    private static AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller instance;

    public static AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsEcsTaskDefinitionContainerDefinitionsDetailsJsonUnmarshaller();
        return instance;
    }
}
