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
package com.amazonaws.services.personalize.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Recommender JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommenderJsonUnmarshaller implements Unmarshaller<Recommender, JsonUnmarshallerContext> {

    public Recommender unmarshall(JsonUnmarshallerContext context) throws Exception {
        Recommender recommender = new Recommender();

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
                if (context.testExpression("recommenderArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setRecommenderArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetGroupArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setDatasetGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recipeArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setRecipeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recommenderConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setRecommenderConfig(RecommenderConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("latestRecommenderUpdate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setLatestRecommenderUpdate(RecommenderUpdateSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("modelMetrics", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recommender.setModelMetrics(new MapUnmarshaller<String, Double>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(Double.class)).unmarshall(context));
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

        return recommender;
    }

    private static RecommenderJsonUnmarshaller instance;

    public static RecommenderJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecommenderJsonUnmarshaller();
        return instance;
    }
}
