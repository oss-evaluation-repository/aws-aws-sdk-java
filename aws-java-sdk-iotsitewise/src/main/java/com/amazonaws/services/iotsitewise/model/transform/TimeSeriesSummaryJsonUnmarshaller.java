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
package com.amazonaws.services.iotsitewise.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotsitewise.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * TimeSeriesSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSeriesSummaryJsonUnmarshaller implements Unmarshaller<TimeSeriesSummary, JsonUnmarshallerContext> {

    public TimeSeriesSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        TimeSeriesSummary timeSeriesSummary = new TimeSeriesSummary();

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
                if (context.testExpression("assetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    timeSeriesSummary.setAssetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("propertyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    timeSeriesSummary.setPropertyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alias", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    timeSeriesSummary.setAlias(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeSeriesId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    timeSeriesSummary.setTimeSeriesId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    timeSeriesSummary.setDataType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataTypeSpec", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    timeSeriesSummary.setDataTypeSpec(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeSeriesCreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    timeSeriesSummary.setTimeSeriesCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("timeSeriesLastUpdateDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    timeSeriesSummary.setTimeSeriesLastUpdateDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("timeSeriesArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    timeSeriesSummary.setTimeSeriesArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return timeSeriesSummary;
    }

    private static TimeSeriesSummaryJsonUnmarshaller instance;

    public static TimeSeriesSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TimeSeriesSummaryJsonUnmarshaller();
        return instance;
    }
}
