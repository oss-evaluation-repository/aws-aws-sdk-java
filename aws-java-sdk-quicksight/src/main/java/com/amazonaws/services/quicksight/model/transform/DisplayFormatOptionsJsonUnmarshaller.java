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
 * DisplayFormatOptions JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisplayFormatOptionsJsonUnmarshaller implements Unmarshaller<DisplayFormatOptions, JsonUnmarshallerContext> {

    public DisplayFormatOptions unmarshall(JsonUnmarshallerContext context) throws Exception {
        DisplayFormatOptions displayFormatOptions = new DisplayFormatOptions();

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
                if (context.testExpression("UseBlankCellFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setUseBlankCellFormat(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("BlankCellFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setBlankCellFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DateFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setDateFormat(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DecimalSeparator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setDecimalSeparator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("GroupingSeparator", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setGroupingSeparator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UseGrouping", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setUseGrouping(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("FractionDigits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setFractionDigits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Prefix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setPrefix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Suffix", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setSuffix(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UnitScaler", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setUnitScaler(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NegativeFormat", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setNegativeFormat(NegativeFormatJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CurrencySymbol", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    displayFormatOptions.setCurrencySymbol(context.getUnmarshaller(String.class).unmarshall(context));
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

        return displayFormatOptions;
    }

    private static DisplayFormatOptionsJsonUnmarshaller instance;

    public static DisplayFormatOptionsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DisplayFormatOptionsJsonUnmarshaller();
        return instance;
    }
}
