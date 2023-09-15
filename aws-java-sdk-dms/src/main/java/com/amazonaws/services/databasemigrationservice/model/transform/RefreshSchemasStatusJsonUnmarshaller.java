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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RefreshSchemasStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshSchemasStatusJsonUnmarshaller implements Unmarshaller<RefreshSchemasStatus, JsonUnmarshallerContext> {

    public RefreshSchemasStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        RefreshSchemasStatus refreshSchemasStatus = new RefreshSchemasStatus();

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
                if (context.testExpression("EndpointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    refreshSchemasStatus.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ReplicationInstanceArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    refreshSchemasStatus.setReplicationInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    refreshSchemasStatus.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastRefreshDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    refreshSchemasStatus.setLastRefreshDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastFailureMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    refreshSchemasStatus.setLastFailureMessage(context.getUnmarshaller(String.class).unmarshall(context));
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

        return refreshSchemasStatus;
    }

    private static RefreshSchemasStatusJsonUnmarshaller instance;

    public static RefreshSchemasStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RefreshSchemasStatusJsonUnmarshaller();
        return instance;
    }
}
