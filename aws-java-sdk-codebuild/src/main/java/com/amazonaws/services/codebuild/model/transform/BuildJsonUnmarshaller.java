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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Build JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildJsonUnmarshaller implements Unmarshaller<Build, JsonUnmarshallerContext> {

    public Build unmarshall(JsonUnmarshallerContext context) throws Exception {
        Build build = new Build();

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
                if (context.testExpression("id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("buildNumber", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setBuildNumber(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("currentPhase", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setCurrentPhase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("buildStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setBuildStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setSourceVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resolvedSourceVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setResolvedSourceVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("projectName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("phases", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setPhases(new ListUnmarshaller<BuildPhase>(BuildPhaseJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("source", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setSource(ProjectSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("secondarySources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setSecondarySources(new ListUnmarshaller<ProjectSource>(ProjectSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("secondarySourceVersions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setSecondarySourceVersions(new ListUnmarshaller<ProjectSourceVersion>(ProjectSourceVersionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("artifacts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setArtifacts(BuildArtifactsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("secondaryArtifacts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setSecondaryArtifacts(new ListUnmarshaller<BuildArtifacts>(BuildArtifactsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("cache", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setCache(ProjectCacheJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setEnvironment(ProjectEnvironmentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("serviceRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("logs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setLogs(LogsLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timeoutInMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("queuedTimeoutInMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setQueuedTimeoutInMinutes(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("buildComplete", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setBuildComplete(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("initiator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setInitiator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vpcConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setVpcConfig(VpcConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("networkInterface", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setNetworkInterface(NetworkInterfaceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("encryptionKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setEncryptionKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("exportedEnvironmentVariables", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setExportedEnvironmentVariables(new ListUnmarshaller<ExportedEnvironmentVariable>(ExportedEnvironmentVariableJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("reportArns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setReportArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("fileSystemLocations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setFileSystemLocations(new ListUnmarshaller<ProjectFileSystemLocation>(ProjectFileSystemLocationJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("debugSession", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setDebugSession(DebugSessionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("buildBatchArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    build.setBuildBatchArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return build;
    }

    private static BuildJsonUnmarshaller instance;

    public static BuildJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuildJsonUnmarshaller();
        return instance;
    }
}
