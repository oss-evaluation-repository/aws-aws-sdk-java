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
package com.amazonaws.services.kinesisanalyticsv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.kinesisanalyticsv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SqlApplicationConfigurationUpdate JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlApplicationConfigurationUpdateJsonUnmarshaller implements Unmarshaller<SqlApplicationConfigurationUpdate, JsonUnmarshallerContext> {

    public SqlApplicationConfigurationUpdate unmarshall(JsonUnmarshallerContext context) throws Exception {
        SqlApplicationConfigurationUpdate sqlApplicationConfigurationUpdate = new SqlApplicationConfigurationUpdate();

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
                if (context.testExpression("InputUpdates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sqlApplicationConfigurationUpdate.setInputUpdates(new ListUnmarshaller<InputUpdate>(InputUpdateJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("OutputUpdates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sqlApplicationConfigurationUpdate.setOutputUpdates(new ListUnmarshaller<OutputUpdate>(OutputUpdateJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("ReferenceDataSourceUpdates", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sqlApplicationConfigurationUpdate.setReferenceDataSourceUpdates(new ListUnmarshaller<ReferenceDataSourceUpdate>(
                            ReferenceDataSourceUpdateJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return sqlApplicationConfigurationUpdate;
    }

    private static SqlApplicationConfigurationUpdateJsonUnmarshaller instance;

    public static SqlApplicationConfigurationUpdateJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SqlApplicationConfigurationUpdateJsonUnmarshaller();
        return instance;
    }
}
