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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ProductionVariantSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionVariantSummaryJsonUnmarshaller implements Unmarshaller<ProductionVariantSummary, JsonUnmarshallerContext> {

    public ProductionVariantSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProductionVariantSummary productionVariantSummary = new ProductionVariantSummary();

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
                if (context.testExpression("VariantName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    productionVariantSummary.setVariantName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DeployedImages", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    productionVariantSummary.setDeployedImages(new ListUnmarshaller<DeployedImage>(DeployedImageJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CurrentWeight", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    productionVariantSummary.setCurrentWeight(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("DesiredWeight", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    productionVariantSummary.setDesiredWeight(context.getUnmarshaller(Float.class).unmarshall(context));
                }
                if (context.testExpression("CurrentInstanceCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    productionVariantSummary.setCurrentInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("DesiredInstanceCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    productionVariantSummary.setDesiredInstanceCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("VariantStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    productionVariantSummary.setVariantStatus(new ListUnmarshaller<ProductionVariantStatus>(ProductionVariantStatusJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("CurrentServerlessConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    productionVariantSummary.setCurrentServerlessConfig(ProductionVariantServerlessConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("DesiredServerlessConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    productionVariantSummary.setDesiredServerlessConfig(ProductionVariantServerlessConfigJsonUnmarshaller.getInstance().unmarshall(context));
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

        return productionVariantSummary;
    }

    private static ProductionVariantSummaryJsonUnmarshaller instance;

    public static ProductionVariantSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProductionVariantSummaryJsonUnmarshaller();
        return instance;
    }
}
