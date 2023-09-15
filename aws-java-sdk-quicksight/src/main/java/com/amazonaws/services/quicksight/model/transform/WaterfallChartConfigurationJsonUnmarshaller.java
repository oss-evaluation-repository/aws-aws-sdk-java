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
 * WaterfallChartConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WaterfallChartConfigurationJsonUnmarshaller implements Unmarshaller<WaterfallChartConfiguration, JsonUnmarshallerContext> {

    public WaterfallChartConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        WaterfallChartConfiguration waterfallChartConfiguration = new WaterfallChartConfiguration();

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
                    waterfallChartConfiguration.setFieldWells(WaterfallChartFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SortConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    waterfallChartConfiguration.setSortConfiguration(WaterfallChartSortConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WaterfallChartOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    waterfallChartConfiguration.setWaterfallChartOptions(WaterfallChartOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CategoryAxisLabelOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    waterfallChartConfiguration.setCategoryAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CategoryAxisDisplayOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    waterfallChartConfiguration.setCategoryAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrimaryYAxisLabelOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    waterfallChartConfiguration.setPrimaryYAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PrimaryYAxisDisplayOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    waterfallChartConfiguration.setPrimaryYAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Legend", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    waterfallChartConfiguration.setLegend(LegendOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataLabels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    waterfallChartConfiguration.setDataLabels(DataLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VisualPalette", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    waterfallChartConfiguration.setVisualPalette(VisualPaletteJsonUnmarshaller.getInstance().unmarshall(context));
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

        return waterfallChartConfiguration;
    }

    private static WaterfallChartConfigurationJsonUnmarshaller instance;

    public static WaterfallChartConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new WaterfallChartConfigurationJsonUnmarshaller();
        return instance;
    }
}
