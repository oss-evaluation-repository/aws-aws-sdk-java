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
package com.amazonaws.services.servermigration.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servermigration.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AppSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppSummaryJsonUnmarshaller implements Unmarshaller<AppSummary, JsonUnmarshallerContext> {

    public AppSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AppSummary appSummary = new AppSummary();

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
                if (context.testExpression("appId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setAppId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("importedAppId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setImportedAppId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationConfigurationStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setReplicationConfigurationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setReplicationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setReplicationStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestReplicationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setLatestReplicationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("launchConfigurationStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setLaunchConfigurationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setLaunchStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchStatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setLaunchStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("launchDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setLaunchDetails(LaunchDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModified", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setLastModified(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("roleName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setRoleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalServerGroups", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setTotalServerGroups(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("totalServers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    appSummary.setTotalServers(context.getUnmarshaller(Integer.class).unmarshall(context));
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

        return appSummary;
    }

    private static AppSummaryJsonUnmarshaller instance;

    public static AppSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppSummaryJsonUnmarshaller();
        return instance;
    }
}
