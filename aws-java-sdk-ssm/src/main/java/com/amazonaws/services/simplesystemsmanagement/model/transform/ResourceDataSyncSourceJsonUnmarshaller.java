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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ResourceDataSyncSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDataSyncSourceJsonUnmarshaller implements Unmarshaller<ResourceDataSyncSource, JsonUnmarshallerContext> {

    public ResourceDataSyncSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        ResourceDataSyncSource resourceDataSyncSource = new ResourceDataSyncSource();

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
                if (context.testExpression("SourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDataSyncSource.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AwsOrganizationsSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDataSyncSource.setAwsOrganizationsSource(ResourceDataSyncAwsOrganizationsSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceRegions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDataSyncSource.setSourceRegions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("IncludeFutureRegions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDataSyncSource.setIncludeFutureRegions(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("EnableAllOpsDataSources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    resourceDataSyncSource.setEnableAllOpsDataSources(context.getUnmarshaller(Boolean.class).unmarshall(context));
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

        return resourceDataSyncSource;
    }

    private static ResourceDataSyncSourceJsonUnmarshaller instance;

    public static ResourceDataSyncSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ResourceDataSyncSourceJsonUnmarshaller();
        return instance;
    }
}
