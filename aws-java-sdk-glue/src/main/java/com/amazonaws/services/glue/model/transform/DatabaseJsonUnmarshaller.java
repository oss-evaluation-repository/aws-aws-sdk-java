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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Database JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatabaseJsonUnmarshaller implements Unmarshaller<Database, JsonUnmarshallerContext> {

    public Database unmarshall(JsonUnmarshallerContext context) throws Exception {
        Database database = new Database();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    database.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    database.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LocationUri", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    database.setLocationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Parameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    database.setParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("CreateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    database.setCreateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreateTableDefaultPermissions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    database.setCreateTableDefaultPermissions(new ListUnmarshaller<PrincipalPermissions>(PrincipalPermissionsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("TargetDatabase", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    database.setTargetDatabase(DatabaseIdentifierJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CatalogId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    database.setCatalogId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FederatedDatabase", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    database.setFederatedDatabase(FederatedDatabaseJsonUnmarshaller.getInstance().unmarshall(context));
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

        return database;
    }

    private static DatabaseJsonUnmarshaller instance;

    public static DatabaseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatabaseJsonUnmarshaller();
        return instance;
    }
}
