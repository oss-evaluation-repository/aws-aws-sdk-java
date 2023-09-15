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
package com.amazonaws.services.athena.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.athena.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * WorkGroupConfigurationUpdates JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkGroupConfigurationUpdatesJsonUnmarshaller implements Unmarshaller<WorkGroupConfigurationUpdates, JsonUnmarshallerContext> {

    public WorkGroupConfigurationUpdates unmarshall(JsonUnmarshallerContext context) throws Exception {
        WorkGroupConfigurationUpdates workGroupConfigurationUpdates = new WorkGroupConfigurationUpdates();

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
                if (context.testExpression("EnforceWorkGroupConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setEnforceWorkGroupConfiguration(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ResultConfigurationUpdates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setResultConfigurationUpdates(ResultConfigurationUpdatesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PublishCloudWatchMetricsEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setPublishCloudWatchMetricsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("BytesScannedCutoffPerQuery", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setBytesScannedCutoffPerQuery(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("RemoveBytesScannedCutoffPerQuery", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setRemoveBytesScannedCutoffPerQuery(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("RequesterPaysEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setRequesterPaysEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setEngineVersion(EngineVersionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RemoveCustomerContentEncryptionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setRemoveCustomerContentEncryptionConfiguration(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setAdditionalConfiguration(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setExecutionRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CustomerContentEncryptionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setCustomerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationJsonUnmarshaller
                            .getInstance().unmarshall(context));
                }
                if (context.testExpression("EnableMinimumEncryptionConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    workGroupConfigurationUpdates.setEnableMinimumEncryptionConfiguration(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return workGroupConfigurationUpdates;
    }

    private static WorkGroupConfigurationUpdatesJsonUnmarshaller instance;

    public static WorkGroupConfigurationUpdatesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WorkGroupConfigurationUpdatesJsonUnmarshaller();
        return instance;
    }
}
