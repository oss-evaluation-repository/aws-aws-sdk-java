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
 * GetUnfilteredTableMetadataResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUnfilteredTableMetadataResultJsonUnmarshaller implements Unmarshaller<GetUnfilteredTableMetadataResult, JsonUnmarshallerContext> {

    public GetUnfilteredTableMetadataResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetUnfilteredTableMetadataResult getUnfilteredTableMetadataResult = new GetUnfilteredTableMetadataResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getUnfilteredTableMetadataResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Table", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getUnfilteredTableMetadataResult.setTable(TableJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AuthorizedColumns", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getUnfilteredTableMetadataResult.setAuthorizedColumns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("IsRegisteredWithLakeFormation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getUnfilteredTableMetadataResult.setIsRegisteredWithLakeFormation(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("CellFilters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getUnfilteredTableMetadataResult.setCellFilters(new ListUnmarshaller<ColumnRowFilter>(ColumnRowFilterJsonUnmarshaller.getInstance())

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

        return getUnfilteredTableMetadataResult;
    }

    private static GetUnfilteredTableMetadataResultJsonUnmarshaller instance;

    public static GetUnfilteredTableMetadataResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetUnfilteredTableMetadataResultJsonUnmarshaller();
        return instance;
    }
}
