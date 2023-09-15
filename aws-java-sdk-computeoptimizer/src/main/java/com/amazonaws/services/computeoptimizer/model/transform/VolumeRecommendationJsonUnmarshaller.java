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
package com.amazonaws.services.computeoptimizer.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.computeoptimizer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * VolumeRecommendation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VolumeRecommendationJsonUnmarshaller implements Unmarshaller<VolumeRecommendation, JsonUnmarshallerContext> {

    public VolumeRecommendation unmarshall(JsonUnmarshallerContext context) throws Exception {
        VolumeRecommendation volumeRecommendation = new VolumeRecommendation();

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
                if (context.testExpression("volumeArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setVolumeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("accountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("currentConfiguration", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setCurrentConfiguration(VolumeConfigurationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("finding", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setFinding(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("utilizationMetrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setUtilizationMetrics(new ListUnmarshaller<EBSUtilizationMetric>(EBSUtilizationMetricJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lookBackPeriodInDays", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setLookBackPeriodInDays(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("volumeRecommendationOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setVolumeRecommendationOptions(new ListUnmarshaller<VolumeRecommendationOption>(
                            VolumeRecommendationOptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lastRefreshTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setLastRefreshTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("currentPerformanceRisk", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setCurrentPerformanceRisk(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    volumeRecommendation.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
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

        return volumeRecommendation;
    }

    private static VolumeRecommendationJsonUnmarshaller instance;

    public static VolumeRecommendationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VolumeRecommendationJsonUnmarshaller();
        return instance;
    }
}
