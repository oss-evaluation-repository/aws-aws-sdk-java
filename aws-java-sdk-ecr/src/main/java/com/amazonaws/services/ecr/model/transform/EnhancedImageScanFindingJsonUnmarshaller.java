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
package com.amazonaws.services.ecr.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.ecr.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EnhancedImageScanFinding JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnhancedImageScanFindingJsonUnmarshaller implements Unmarshaller<EnhancedImageScanFinding, JsonUnmarshallerContext> {

    public EnhancedImageScanFinding unmarshall(JsonUnmarshallerContext context) throws Exception {
        EnhancedImageScanFinding enhancedImageScanFinding = new EnhancedImageScanFinding();

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
                if (context.testExpression("awsAccountId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("findingArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setFindingArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("firstObservedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setFirstObservedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastObservedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setLastObservedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("packageVulnerabilityDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setPackageVulnerabilityDetails(PackageVulnerabilityDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("remediation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setRemediation(RemediationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setResources(new ListUnmarshaller<Resource>(ResourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("score", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setScore(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("scoreDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setScoreDetails(ScoreDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    enhancedImageScanFinding.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return enhancedImageScanFinding;
    }

    private static EnhancedImageScanFindingJsonUnmarshaller instance;

    public static EnhancedImageScanFindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EnhancedImageScanFindingJsonUnmarshaller();
        return instance;
    }
}
