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
package com.amazonaws.services.redshiftdataapi.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.redshiftdataapi.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StatementData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatementDataJsonUnmarshaller implements Unmarshaller<StatementData, JsonUnmarshallerContext> {

    public StatementData unmarshall(JsonUnmarshallerContext context) throws Exception {
        StatementData statementData = new StatementData();

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
                if (context.testExpression("CreatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsBatchStatement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setIsBatchStatement(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("QueryParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setQueryParameters(new ListUnmarshaller<SqlParameter>(SqlParameterJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("QueryString", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setQueryString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("QueryStrings", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setQueryStrings(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SecretArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setSecretArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatementName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setStatementName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    statementData.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return statementData;
    }

    private static StatementDataJsonUnmarshaller instance;

    public static StatementDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StatementDataJsonUnmarshaller();
        return instance;
    }
}
