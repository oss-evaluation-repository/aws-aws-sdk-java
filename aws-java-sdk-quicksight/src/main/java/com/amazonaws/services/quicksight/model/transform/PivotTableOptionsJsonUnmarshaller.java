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
package com.amazonaws.services.quicksight.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PivotTableOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableOptionsJsonUnmarshaller implements Unmarshaller<PivotTableOptions, JsonUnmarshallerContext> {

    public PivotTableOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        PivotTableOptions pivotTableOptions = new PivotTableOptions();

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
                if (context.testExpression("MetricPlacement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setMetricPlacement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SingleMetricVisibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setSingleMetricVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ColumnNamesVisibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setColumnNamesVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ToggleButtonsVisibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setToggleButtonsVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ColumnHeaderStyle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setColumnHeaderStyle(TableCellStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RowHeaderStyle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setRowHeaderStyle(TableCellStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CellStyle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setCellStyle(TableCellStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RowFieldNamesStyle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setRowFieldNamesStyle(TableCellStyleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RowAlternateColorOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setRowAlternateColorOptions(RowAlternateColorOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CollapsedRowDimensionsVisibility", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setCollapsedRowDimensionsVisibility(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RowsLayout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setRowsLayout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RowsLabelOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setRowsLabelOptions(PivotTableRowsLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DefaultCellWidth", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    pivotTableOptions.setDefaultCellWidth(context.getUnmarshaller(String.class).unmarshall(context));
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

        return pivotTableOptions;
    }

    private static PivotTableOptionsJsonUnmarshaller instance;

    public static PivotTableOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PivotTableOptionsJsonUnmarshaller();
        return instance;
    }
}
