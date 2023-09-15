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
package com.amazonaws.services.cloudwatchevidently.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.cloudwatchevidently.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Feature JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FeatureJsonUnmarshaller implements Unmarshaller<Feature, JsonUnmarshallerContext> {

    public Feature unmarshall(JsonUnmarshallerContext context) throws Exception {
        Feature feature = new Feature();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("defaultVariation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setDefaultVariation(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("entityOverrides", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setEntityOverrides(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("evaluationRules", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setEvaluationRules(new ListUnmarshaller<EvaluationRule>(EvaluationRuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("evaluationStrategy", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setEvaluationStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setLastUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("project", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setProject(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("valueType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setValueType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("variations", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    feature.setVariations(new ListUnmarshaller<Variation>(VariationJsonUnmarshaller.getInstance())

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

        return feature;
    }

    private static FeatureJsonUnmarshaller instance;

    public static FeatureJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new FeatureJsonUnmarshaller();
        return instance;
    }
}
