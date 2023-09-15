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
 * FilterSliderControl JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterSliderControlJsonUnmarshaller implements Unmarshaller<FilterSliderControl, JsonUnmarshallerContext> {

    public FilterSliderControl unmarshall(JsonUnmarshallerContext context) throws Exception {
        FilterSliderControl filterSliderControl = new FilterSliderControl();

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
                if (context.testExpression("FilterControlId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filterSliderControl.setFilterControlId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filterSliderControl.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceFilterId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filterSliderControl.setSourceFilterId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DisplayOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filterSliderControl.setDisplayOptions(SliderControlDisplayOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filterSliderControl.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MaximumValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filterSliderControl.setMaximumValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("MinimumValue", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filterSliderControl.setMinimumValue(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("StepSize", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    filterSliderControl.setStepSize(context.getUnmarshaller(Double.class).unmarshall(context));
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

        return filterSliderControl;
    }

    private static FilterSliderControlJsonUnmarshaller instance;

    public static FilterSliderControlJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FilterSliderControlJsonUnmarshaller();
        return instance;
    }
}
