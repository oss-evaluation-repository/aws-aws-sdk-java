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
package com.amazonaws.services.guardduty.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDetectorResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDetectorResultJsonUnmarshaller implements Unmarshaller<GetDetectorResult, JsonUnmarshallerContext> {

    public GetDetectorResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDetectorResult getDetectorResult = new GetDetectorResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDetectorResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorResult.setCreatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("findingPublishingFrequency", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorResult.setFindingPublishingFrequency(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("serviceRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorResult.setServiceRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorResult.setUpdatedAt(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataSources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorResult.setDataSources(DataSourceConfigurationsResultJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("features", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorResult.setFeatures(new ListUnmarshaller<DetectorFeatureConfigurationResult>(DetectorFeatureConfigurationResultJsonUnmarshaller
                            .getInstance())

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

        return getDetectorResult;
    }

    private static GetDetectorResultJsonUnmarshaller instance;

    public static GetDetectorResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDetectorResultJsonUnmarshaller();
        return instance;
    }
}
