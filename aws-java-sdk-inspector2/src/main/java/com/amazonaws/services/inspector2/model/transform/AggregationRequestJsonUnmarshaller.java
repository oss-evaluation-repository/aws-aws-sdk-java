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
package com.amazonaws.services.inspector2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AggregationRequest JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregationRequestJsonUnmarshaller implements Unmarshaller<AggregationRequest, JsonUnmarshallerContext> {

    public AggregationRequest unmarshall(JsonUnmarshallerContext context) throws Exception {
        AggregationRequest aggregationRequest = new AggregationRequest();

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
                if (context.testExpression("accountAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setAccountAggregation(AccountAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("amiAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setAmiAggregation(AmiAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("awsEcrContainerAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setAwsEcrContainerAggregation(AwsEcrContainerAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2InstanceAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setEc2InstanceAggregation(Ec2InstanceAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("findingTypeAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setFindingTypeAggregation(FindingTypeAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("imageLayerAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setImageLayerAggregation(ImageLayerAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaFunctionAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setLambdaFunctionAggregation(LambdaFunctionAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lambdaLayerAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setLambdaLayerAggregation(LambdaLayerAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("packageAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setPackageAggregation(PackageAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("repositoryAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setRepositoryAggregation(RepositoryAggregationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("titleAggregation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    aggregationRequest.setTitleAggregation(TitleAggregationJsonUnmarshaller.getInstance().unmarshall(context));
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

        return aggregationRequest;
    }

    private static AggregationRequestJsonUnmarshaller instance;

    public static AggregationRequestJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AggregationRequestJsonUnmarshaller();
        return instance;
    }
}
