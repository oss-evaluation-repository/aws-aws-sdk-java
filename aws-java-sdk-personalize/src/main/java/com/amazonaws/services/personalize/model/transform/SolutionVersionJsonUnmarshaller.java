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
 * SolutionVersion JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SolutionVersionJsonUnmarshaller implements Unmarshaller<SolutionVersion, JsonUnmarshallerContext> {

    public SolutionVersion unmarshall(JsonUnmarshallerContext context) throws Exception {
        SolutionVersion solutionVersion = new SolutionVersion();

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
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setSolutionVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setSolutionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("performHPO", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setPerformHPO(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("performAutoML", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setPerformAutoML(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("recipeArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setRecipeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setEventType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetGroupArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setDatasetGroupArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("solutionConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setSolutionConfig(SolutionConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("trainingHours", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setTrainingHours(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("trainingMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setTrainingMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tunedHPOParams", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setTunedHPOParams(TunedHPOParamsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failureReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    solutionVersion.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return solutionVersion;
    }

    private static SolutionVersionJsonUnmarshaller instance;

    public static SolutionVersionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SolutionVersionJsonUnmarshaller();
        return instance;
    }
}
