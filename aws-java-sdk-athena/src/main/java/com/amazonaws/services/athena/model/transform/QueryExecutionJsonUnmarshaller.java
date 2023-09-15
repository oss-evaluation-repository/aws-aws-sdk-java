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
 * QueryExecution JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryExecutionJsonUnmarshaller implements Unmarshaller<QueryExecution, JsonUnmarshallerContext> {

    public QueryExecution unmarshall(JsonUnmarshallerContext context) throws Exception {
        QueryExecution queryExecution = new QueryExecution();

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
                if (context.testExpression("QueryExecutionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setQueryExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Query", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setQuery(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatementType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setStatementType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ResultConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setResultConfiguration(ResultConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ResultReuseConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setResultReuseConfiguration(ResultReuseConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("QueryExecutionContext", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setQueryExecutionContext(QueryExecutionContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setStatus(QueryExecutionStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Statistics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setStatistics(QueryExecutionStatisticsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WorkGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setWorkGroup(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EngineVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setEngineVersion(EngineVersionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ExecutionParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setExecutionParameters(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("SubstatementType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    queryExecution.setSubstatementType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return queryExecution;
    }

    private static QueryExecutionJsonUnmarshaller instance;

    public static QueryExecutionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new QueryExecutionJsonUnmarshaller();
        return instance;
    }
}
