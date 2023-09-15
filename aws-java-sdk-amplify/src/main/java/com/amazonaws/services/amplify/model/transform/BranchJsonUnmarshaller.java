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
package com.amazonaws.services.amplify.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.amplify.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Branch JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BranchJsonUnmarshaller implements Unmarshaller<Branch, JsonUnmarshallerContext> {

    public Branch unmarshall(JsonUnmarshallerContext context) throws Exception {
        Branch branch = new Branch();

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
                if (context.testExpression("branchArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setBranchArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("branchName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setBranchName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("stage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setStage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("displayName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setDisplayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableNotification", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setEnableNotification(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("environmentVariables", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setEnvironmentVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("enableAutoBuild", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setEnableAutoBuild(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("customDomains", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setCustomDomains(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("framework", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setFramework(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("activeJobId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setActiveJobId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalNumberOfJobs", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setTotalNumberOfJobs(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableBasicAuth", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setEnableBasicAuth(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("enablePerformanceMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setEnablePerformanceMode(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("thumbnailUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setThumbnailUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("basicAuthCredentials", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setBasicAuthCredentials(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("buildSpec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setBuildSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ttl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setTtl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatedResources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setAssociatedResources(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("enablePullRequestPreview", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setEnablePullRequestPreview(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("pullRequestEnvironmentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setPullRequestEnvironmentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("destinationBranch", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setDestinationBranch(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceBranch", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setSourceBranch(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backendEnvironmentArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    branch.setBackendEnvironmentArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return branch;
    }

    private static BranchJsonUnmarshaller instance;

    public static BranchJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BranchJsonUnmarshaller();
        return instance;
    }
}
