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
package com.amazonaws.services.frauddetector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.frauddetector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDetectorVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDetectorVersionResultJsonUnmarshaller implements Unmarshaller<GetDetectorVersionResult, JsonUnmarshallerContext> {

    public GetDetectorVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDetectorVersionResult getDetectorVersionResult = new GetDetectorVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDetectorVersionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("detectorId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setDetectorId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("detectorVersionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setDetectorVersionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("externalModelEndpoints", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setExternalModelEndpoints(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("modelVersions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setModelVersions(new ListUnmarshaller<ModelVersion>(ModelVersionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("rules", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setRules(new ListUnmarshaller<Rule>(RuleJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setLastUpdatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setCreatedTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ruleExecutionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setRuleExecutionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDetectorVersionResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return getDetectorVersionResult;
    }

    private static GetDetectorVersionResultJsonUnmarshaller instance;

    public static GetDetectorVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDetectorVersionResultJsonUnmarshaller();
        return instance;
    }
}
