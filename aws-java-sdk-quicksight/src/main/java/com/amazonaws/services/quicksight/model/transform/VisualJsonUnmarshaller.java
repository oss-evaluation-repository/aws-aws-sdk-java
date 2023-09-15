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
 * Visual JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VisualJsonUnmarshaller implements Unmarshaller<Visual, JsonUnmarshallerContext> {

    public Visual unmarshall(JsonUnmarshallerContext context) throws Exception {
        Visual visual = new Visual();

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
                if (context.testExpression("TableVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setTableVisual(TableVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PivotTableVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setPivotTableVisual(PivotTableVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BarChartVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setBarChartVisual(BarChartVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KPIVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setKPIVisual(KPIVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("PieChartVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setPieChartVisual(PieChartVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GaugeChartVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setGaugeChartVisual(GaugeChartVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LineChartVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setLineChartVisual(LineChartVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HeatMapVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setHeatMapVisual(HeatMapVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("TreeMapVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setTreeMapVisual(TreeMapVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GeospatialMapVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setGeospatialMapVisual(GeospatialMapVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FilledMapVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setFilledMapVisual(FilledMapVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("FunnelChartVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setFunnelChartVisual(FunnelChartVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ScatterPlotVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setScatterPlotVisual(ScatterPlotVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ComboChartVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setComboChartVisual(ComboChartVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BoxPlotVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setBoxPlotVisual(BoxPlotVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WaterfallVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setWaterfallVisual(WaterfallVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("HistogramVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setHistogramVisual(HistogramVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("WordCloudVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setWordCloudVisual(WordCloudVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InsightVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setInsightVisual(InsightVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SankeyDiagramVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setSankeyDiagramVisual(SankeyDiagramVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CustomContentVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setCustomContentVisual(CustomContentVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EmptyVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setEmptyVisual(EmptyVisualJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RadarChartVisual", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    visual.setRadarChartVisual(RadarChartVisualJsonUnmarshaller.getInstance().unmarshall(context));
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

        return visual;
    }

    private static VisualJsonUnmarshaller instance;

    public static VisualJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VisualJsonUnmarshaller();
        return instance;
    }
}
