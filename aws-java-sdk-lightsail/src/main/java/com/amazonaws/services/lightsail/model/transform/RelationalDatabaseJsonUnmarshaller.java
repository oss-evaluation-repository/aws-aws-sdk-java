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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RelationalDatabase JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelationalDatabaseJsonUnmarshaller implements Unmarshaller<RelationalDatabase, JsonUnmarshallerContext> {

    public RelationalDatabase unmarshall(JsonUnmarshallerContext context) throws Exception {
        RelationalDatabase relationalDatabase = new RelationalDatabase();

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
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("supportCode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setSupportCode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("location", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setLocation(ResourceLocationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("relationalDatabaseBlueprintId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setRelationalDatabaseBlueprintId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("relationalDatabaseBundleId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setRelationalDatabaseBundleId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("masterDatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setMasterDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hardware", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setHardware(RelationalDatabaseHardwareJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("secondaryAvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setSecondaryAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("backupRetentionEnabled", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setBackupRetentionEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("pendingModifiedValues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setPendingModifiedValues(PendingModifiedRelationalDatabaseValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("engine", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setEngine(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("engineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setEngineVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestRestorableTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setLatestRestorableTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("masterUsername", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setMasterUsername(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("parameterApplyStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setParameterApplyStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("preferredBackupWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setPreferredBackupWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("preferredMaintenanceWindow", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setPreferredMaintenanceWindow(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("publiclyAccessible", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setPubliclyAccessible(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("masterEndpoint", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setMasterEndpoint(RelationalDatabaseEndpointJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pendingMaintenanceActions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setPendingMaintenanceActions(new ListUnmarshaller<PendingMaintenanceAction>(PendingMaintenanceActionJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("caCertificateIdentifier", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    relationalDatabase.setCaCertificateIdentifier(context.getUnmarshaller(String.class).unmarshall(context));
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

        return relationalDatabase;
    }

    private static RelationalDatabaseJsonUnmarshaller instance;

    public static RelationalDatabaseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RelationalDatabaseJsonUnmarshaller();
        return instance;
    }
}
