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
 * AutoBranchCreationConfig JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoBranchCreationConfigJsonUnmarshaller implements Unmarshaller<AutoBranchCreationConfig, JsonUnmarshallerContext> {

    public AutoBranchCreationConfig unmarshall(JsonUnmarshallerContext context) throws Exception {
        AutoBranchCreationConfig autoBranchCreationConfig = new AutoBranchCreationConfig();

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
                if (context.testExpression("stage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setStage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("framework", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setFramework(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableAutoBuild", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setEnableAutoBuild(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("environmentVariables", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setEnvironmentVariables(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("basicAuthCredentials", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setBasicAuthCredentials(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enableBasicAuth", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setEnableBasicAuth(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("enablePerformanceMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setEnablePerformanceMode(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("buildSpec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setBuildSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("enablePullRequestPreview", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setEnablePullRequestPreview(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("pullRequestEnvironmentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    autoBranchCreationConfig.setPullRequestEnvironmentName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return autoBranchCreationConfig;
    }

    private static AutoBranchCreationConfigJsonUnmarshaller instance;

    public static AutoBranchCreationConfigJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AutoBranchCreationConfigJsonUnmarshaller();
        return instance;
    }
}
