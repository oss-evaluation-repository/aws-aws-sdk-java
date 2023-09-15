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
 * ComboChartConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ComboChartConfigurationJsonUnmarshaller implements Unmarshaller<ComboChartConfiguration, JsonUnmarshallerContext> {

    public ComboChartConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        ComboChartConfiguration comboChartConfiguration = new ComboChartConfiguration();

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
                if (context.testExpression("FieldWells", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setFieldWells(ComboChartFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SortConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setSortConfiguration(ComboChartSortConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BarsArrangement", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setBarsArrangement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CategoryAxis", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setCategoryAxis(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CategoryLabelOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setCategoryLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrimaryYAxisDisplayOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setPrimaryYAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrimaryYAxisLabelOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setPrimaryYAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SecondaryYAxisDisplayOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setSecondaryYAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SecondaryYAxisLabelOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setSecondaryYAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ColorLabelOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setColorLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Legend", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setLegend(LegendOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BarDataLabels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setBarDataLabels(DataLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LineDataLabels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setLineDataLabels(DataLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tooltip", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setTooltip(TooltipOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReferenceLines", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setReferenceLines(new ListUnmarshaller<ReferenceLine>(ReferenceLineJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("VisualPalette", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    comboChartConfiguration.setVisualPalette(VisualPaletteJsonUnmarshaller.getInstance().unmarshall(context));
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

        return comboChartConfiguration;
    }

    private static ComboChartConfigurationJsonUnmarshaller instance;

    public static ComboChartConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ComboChartConfigurationJsonUnmarshaller();
        return instance;
    }
}
