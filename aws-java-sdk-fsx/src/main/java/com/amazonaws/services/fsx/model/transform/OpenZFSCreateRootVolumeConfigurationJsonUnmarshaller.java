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
package com.amazonaws.services.fsx.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OpenZFSCreateRootVolumeConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenZFSCreateRootVolumeConfigurationJsonUnmarshaller implements Unmarshaller<OpenZFSCreateRootVolumeConfiguration, JsonUnmarshallerContext> {

    public OpenZFSCreateRootVolumeConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        OpenZFSCreateRootVolumeConfiguration openZFSCreateRootVolumeConfiguration = new OpenZFSCreateRootVolumeConfiguration();

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
                if (context.testExpression("RecordSizeKiB", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSCreateRootVolumeConfiguration.setRecordSizeKiB(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DataCompressionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSCreateRootVolumeConfiguration.setDataCompressionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NfsExports", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSCreateRootVolumeConfiguration.setNfsExports(new ListUnmarshaller<OpenZFSNfsExport>(OpenZFSNfsExportJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("UserAndGroupQuotas", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSCreateRootVolumeConfiguration.setUserAndGroupQuotas(new ListUnmarshaller<OpenZFSUserOrGroupQuota>(
                            OpenZFSUserOrGroupQuotaJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CopyTagsToSnapshots", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSCreateRootVolumeConfiguration.setCopyTagsToSnapshots(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ReadOnly", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    openZFSCreateRootVolumeConfiguration.setReadOnly(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return openZFSCreateRootVolumeConfiguration;
    }

    private static OpenZFSCreateRootVolumeConfigurationJsonUnmarshaller instance;

    public static OpenZFSCreateRootVolumeConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OpenZFSCreateRootVolumeConfigurationJsonUnmarshaller();
        return instance;
    }
}
