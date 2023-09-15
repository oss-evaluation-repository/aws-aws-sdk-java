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
package com.amazonaws.services.kendra.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * JiraConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JiraConfigurationJsonUnmarshaller implements Unmarshaller<JiraConfiguration, JsonUnmarshallerContext> {

    public JiraConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        JiraConfiguration jiraConfiguration = new JiraConfiguration();

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
                if (context.testExpression("JiraAccountUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setJiraAccountUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UseChangeLog", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setUseChangeLog(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("Project", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setProject(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("IssueType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setIssueType(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setStatus(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("IssueSubEntityFilter", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setIssueSubEntityFilter(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AttachmentFieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setAttachmentFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(
                            DataSourceToIndexFieldMappingJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CommentFieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setCommentFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("IssueFieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setIssueFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ProjectFieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setProjectFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("WorkLogFieldMappings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setWorkLogFieldMappings(new ListUnmarshaller<DataSourceToIndexFieldMapping>(DataSourceToIndexFieldMappingJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("InclusionPatterns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setInclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ExclusionPatterns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setExclusionPatterns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("VpcConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    jiraConfiguration.setVpcConfiguration(DataSourceVpcConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return jiraConfiguration;
    }

    private static JiraConfigurationJsonUnmarshaller instance;

    public static JiraConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JiraConfigurationJsonUnmarshaller();
        return instance;
    }
}
