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
package com.amazonaws.services.codegurusecurity.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codegurusecurity.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetScanResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetScanResultJsonUnmarshaller implements Unmarshaller<GetScanResult, JsonUnmarshallerContext> {

    public GetScanResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetScanResult getScanResult = new GetScanResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getScanResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("analysisType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getScanResult.setAnalysisType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getScanResult.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("numberOfRevisions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getScanResult.setNumberOfRevisions(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("runId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getScanResult.setRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getScanResult.setScanName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanNameArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getScanResult.setScanNameArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scanState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getScanResult.setScanState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getScanResult.setUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return getScanResult;
    }

    private static GetScanResultJsonUnmarshaller instance;

    public static GetScanResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetScanResultJsonUnmarshaller();
        return instance;
    }
}
