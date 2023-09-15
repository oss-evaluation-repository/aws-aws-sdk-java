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
package com.amazonaws.services.imagebuilder.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.imagebuilder.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ImageScanFinding JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageScanFindingJsonUnmarshaller implements Unmarshaller<ImageScanFinding, JsonUnmarshallerContext> {

    public ImageScanFinding unmarshall(JsonUnmarshallerContext context) throws Exception {
        ImageScanFinding imageScanFinding = new ImageScanFinding();

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
                    imageScanFinding.setAwsAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imageBuildVersionArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setImageBuildVersionArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("imagePipelineArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setImagePipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("title", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setTitle(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("remediation", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setRemediation(RemediationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setSeverity(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("firstObservedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setFirstObservedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("inspectorScore", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setInspectorScore(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("inspectorScoreDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setInspectorScoreDetails(InspectorScoreDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("packageVulnerabilityDetails", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setPackageVulnerabilityDetails(PackageVulnerabilityDetailsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fixAvailable", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    imageScanFinding.setFixAvailable(context.getUnmarshaller(String.class).unmarshall(context));
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

        return imageScanFinding;
    }

    private static ImageScanFindingJsonUnmarshaller instance;

    public static ImageScanFindingJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ImageScanFindingJsonUnmarshaller();
        return instance;
    }
}
