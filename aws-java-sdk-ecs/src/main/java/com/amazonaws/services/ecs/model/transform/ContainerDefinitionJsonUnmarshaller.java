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
package com.amazonaws.services.ecs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ContainerDefinition JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerDefinitionJsonUnmarshaller implements Unmarshaller<ContainerDefinition, JsonUnmarshallerContext> {

    public ContainerDefinition unmarshall(JsonUnmarshallerContext context) throws Exception {
        ContainerDefinition containerDefinition = new ContainerDefinition();

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
                    containerDefinition.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("image", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setImage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("repositoryCredentials", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setRepositoryCredentials(RepositoryCredentialsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("cpu", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setCpu(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("memory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setMemory(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("memoryReservation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setMemoryReservation(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("links", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setLinks(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("portMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setPortMappings(new ListUnmarshaller<PortMapping>(PortMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("essential", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setEssential(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("entryPoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setEntryPoint(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("command", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setCommand(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setEnvironment(new ListUnmarshaller<KeyValuePair>(KeyValuePairJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("environmentFiles", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setEnvironmentFiles(new ListUnmarshaller<EnvironmentFile>(EnvironmentFileJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("mountPoints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setMountPoints(new ListUnmarshaller<MountPoint>(MountPointJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("volumesFrom", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setVolumesFrom(new ListUnmarshaller<VolumeFrom>(VolumeFromJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("linuxParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setLinuxParameters(LinuxParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("secrets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setSecrets(new ListUnmarshaller<Secret>(SecretJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dependsOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setDependsOn(new ListUnmarshaller<ContainerDependency>(ContainerDependencyJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("startTimeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setStartTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("stopTimeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setStopTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("hostname", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setHostname(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("user", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setUser(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("workingDirectory", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setWorkingDirectory(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("disableNetworking", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setDisableNetworking(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("privileged", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setPrivileged(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("readonlyRootFilesystem", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setReadonlyRootFilesystem(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("dnsServers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setDnsServers(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("dnsSearchDomains", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setDnsSearchDomains(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("extraHosts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setExtraHosts(new ListUnmarshaller<HostEntry>(HostEntryJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("dockerSecurityOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setDockerSecurityOptions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("interactive", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setInteractive(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("pseudoTerminal", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setPseudoTerminal(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("dockerLabels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setDockerLabels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("ulimits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setUlimits(new ListUnmarshaller<Ulimit>(UlimitJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("logConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setLogConfiguration(LogConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("healthCheck", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setHealthCheck(HealthCheckJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("systemControls", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setSystemControls(new ListUnmarshaller<SystemControl>(SystemControlJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("resourceRequirements", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setResourceRequirements(new ListUnmarshaller<ResourceRequirement>(ResourceRequirementJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("firelensConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setFirelensConfiguration(FirelensConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("credentialSpecs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    containerDefinition.setCredentialSpecs(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

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

        return containerDefinition;
    }

    private static ContainerDefinitionJsonUnmarshaller instance;

    public static ContainerDefinitionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ContainerDefinitionJsonUnmarshaller();
        return instance;
    }
}
