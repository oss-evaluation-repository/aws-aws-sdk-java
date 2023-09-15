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
package com.amazonaws.services.lookoutequipment.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutequipment.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * SensorStatisticsSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SensorStatisticsSummaryJsonUnmarshaller implements Unmarshaller<SensorStatisticsSummary, JsonUnmarshallerContext> {

    public SensorStatisticsSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        SensorStatisticsSummary sensorStatisticsSummary = new SensorStatisticsSummary();

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
                if (context.testExpression("ComponentName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setComponentName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SensorName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setSensorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataExists", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setDataExists(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("MissingValues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setMissingValues(CountPercentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InvalidValues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setInvalidValues(CountPercentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("InvalidDateEntries", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setInvalidDateEntries(CountPercentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DuplicateTimestamps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setDuplicateTimestamps(CountPercentJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CategoricalValues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setCategoricalValues(CategoricalValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MultipleOperatingModes", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setMultipleOperatingModes(MultipleOperatingModesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LargeTimestampGaps", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setLargeTimestampGaps(LargeTimestampGapsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("MonotonicValues", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setMonotonicValues(MonotonicValuesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DataStartTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setDataStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DataEndTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sensorStatisticsSummary.setDataEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return sensorStatisticsSummary;
    }

    private static SensorStatisticsSummaryJsonUnmarshaller instance;

    public static SensorStatisticsSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SensorStatisticsSummaryJsonUnmarshaller();
        return instance;
    }
}
