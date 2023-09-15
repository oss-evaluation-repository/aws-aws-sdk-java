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
 * Recipe JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecipeJsonUnmarshaller implements Unmarshaller<Recipe, JsonUnmarshallerContext> {

    public Recipe unmarshall(JsonUnmarshallerContext context) throws Exception {
        Recipe recipe = new Recipe();

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
                    recipe.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recipeArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recipe.setRecipeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("algorithmArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recipe.setAlgorithmArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("featureTransformationArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recipe.setFeatureTransformationArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recipe.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recipe.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recipe.setCreationDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("recipeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recipe.setRecipeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recipe.setLastUpdatedDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return recipe;
    }

    private static RecipeJsonUnmarshaller instance;

    public static RecipeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecipeJsonUnmarshaller();
        return instance;
    }
}
