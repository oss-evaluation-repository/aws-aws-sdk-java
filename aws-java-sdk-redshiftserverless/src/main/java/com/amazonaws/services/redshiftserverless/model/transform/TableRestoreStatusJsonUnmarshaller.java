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
package com.amazonaws.services.redshiftserverless.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftserverless.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TableRestoreStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableRestoreStatusJsonUnmarshaller implements Unmarshaller<TableRestoreStatus, JsonUnmarshallerContext> {

    public TableRestoreStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        TableRestoreStatus tableRestoreStatus = new TableRestoreStatus();

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
                if (context.testExpression("message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("namespaceName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setNamespaceName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("newTableName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setNewTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("progressInMegaBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setProgressInMegaBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("requestTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setRequestTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("snapshotName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setSnapshotName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceDatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setSourceDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceSchemaName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setSourceSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceTableName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setSourceTableName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tableRestoreRequestId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setTableRestoreRequestId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetDatabaseName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setTargetDatabaseName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("targetSchemaName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setTargetSchemaName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("totalDataInMegaBytes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setTotalDataInMegaBytes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("workgroupName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    tableRestoreStatus.setWorkgroupName(context.getUnmarshaller(String.class).unmarshall(context));
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

        return tableRestoreStatus;
    }

    private static TableRestoreStatusJsonUnmarshaller instance;

    public static TableRestoreStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TableRestoreStatusJsonUnmarshaller();
        return instance;
    }
}
