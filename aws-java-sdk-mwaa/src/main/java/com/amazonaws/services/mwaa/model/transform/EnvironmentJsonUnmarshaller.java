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
package com.amazonaws.services.mwaa.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mwaa.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Environment JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnvironmentJsonUnmarshaller implements Unmarshaller<Environment, JsonUnmarshallerContext> {

    public Environment unmarshall(JsonUnmarshallerContext context) throws Exception {
        Environment environment = new Environment();

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
                if (context.testExpression("AirflowConfigurationOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setAirflowConfigurationOptions(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("AirflowVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setAirflowVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DagS3Path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setDagS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnvironmentClass", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setEnvironmentClass(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("KmsKey", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setKmsKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setLastUpdate(LastUpdateJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LoggingConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setLoggingConfiguration(LoggingConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MaxWorkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setMaxWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("MinWorkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setMinWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NetworkConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setNetworkConfiguration(NetworkConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PluginsS3ObjectVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setPluginsS3ObjectVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PluginsS3Path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setPluginsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequirementsS3ObjectVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setRequirementsS3ObjectVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RequirementsS3Path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setRequirementsS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Schedulers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setSchedulers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ServiceRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setServiceRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceBucketArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setSourceBucketArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartupScriptS3ObjectVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setStartupScriptS3ObjectVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartupScriptS3Path", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setStartupScriptS3Path(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("WebserverAccessMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setWebserverAccessMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WebserverUrl", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setWebserverUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("WeeklyMaintenanceWindowStart", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    environment.setWeeklyMaintenanceWindowStart(context.getUnmarshaller(String.class).unmarshall(context));
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

        return environment;
    }

    private static EnvironmentJsonUnmarshaller instance;

    public static EnvironmentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnvironmentJsonUnmarshaller();
        return instance;
    }
}
