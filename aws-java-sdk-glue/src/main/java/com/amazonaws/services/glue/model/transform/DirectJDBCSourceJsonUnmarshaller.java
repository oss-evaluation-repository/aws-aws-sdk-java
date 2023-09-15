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
 * DirectJDBCSource JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectJDBCSourceJsonUnmarshaller implements Unmarshaller<DirectJDBCSource, JsonUnmarshallerContext> {

    public DirectJDBCSource unmarshall(JsonUnmarshallerContext context) throws Exception {
        DirectJDBCSource directJDBCSource = new DirectJDBCSource();

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
                    directJDBCSource.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Database", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directJDBCSource.setDatabase(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Table", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directJDBCSource.setTable(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directJDBCSource.setConnectionName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ConnectionType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directJDBCSource.setConnectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RedshiftTmpDir", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    directJDBCSource.setRedshiftTmpDir(context.getUnmarshaller(String.class).unmarshall(context));
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

        return directJDBCSource;
    }

    private static DirectJDBCSourceJsonUnmarshaller instance;

    public static DirectJDBCSourceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectJDBCSourceJsonUnmarshaller();
        return instance;
    }
}
