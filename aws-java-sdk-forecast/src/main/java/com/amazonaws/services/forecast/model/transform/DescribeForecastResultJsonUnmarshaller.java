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
package com.amazonaws.services.forecast.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.forecast.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeForecastResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeForecastResultJsonUnmarshaller implements Unmarshaller<DescribeForecastResult, JsonUnmarshallerContext> {

    public DescribeForecastResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeForecastResult describeForecastResult = new DescribeForecastResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeForecastResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ForecastArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setForecastArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ForecastName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setForecastName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ForecastTypes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setForecastTypes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("PredictorArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setPredictorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatasetGroupArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setDatasetGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EstimatedTimeRemainingInMinutes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setEstimatedTimeRemainingInMinutes(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("TimeSeriesSelector", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describeForecastResult.setTimeSeriesSelector(TimeSeriesSelectorJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describeForecastResult;
    }

    private static DescribeForecastResultJsonUnmarshaller instance;

    public static DescribeForecastResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeForecastResultJsonUnmarshaller();
        return instance;
    }
}
