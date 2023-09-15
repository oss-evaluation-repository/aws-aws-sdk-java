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
 * HistogramConfiguration JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistogramConfigurationJsonUnmarshaller implements Unmarshaller<HistogramConfiguration, JsonUnmarshallerContext> {

    public HistogramConfiguration unmarshall(JsonUnmarshallerContext context) throws Exception {
        HistogramConfiguration histogramConfiguration = new HistogramConfiguration();

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
                    histogramConfiguration.setFieldWells(HistogramFieldWellsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("XAxisDisplayOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    histogramConfiguration.setXAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("XAxisLabelOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    histogramConfiguration.setXAxisLabelOptions(ChartAxisLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("YAxisDisplayOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    histogramConfiguration.setYAxisDisplayOptions(AxisDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("BinOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    histogramConfiguration.setBinOptions(HistogramBinOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataLabels", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    histogramConfiguration.setDataLabels(DataLabelOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Tooltip", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    histogramConfiguration.setTooltip(TooltipOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("VisualPalette", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    histogramConfiguration.setVisualPalette(VisualPaletteJsonUnmarshaller.getInstance().unmarshall(context));
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

        return histogramConfiguration;
    }

    private static HistogramConfigurationJsonUnmarshaller instance;

    public static HistogramConfigurationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new HistogramConfigurationJsonUnmarshaller();
        return instance;
    }
}
