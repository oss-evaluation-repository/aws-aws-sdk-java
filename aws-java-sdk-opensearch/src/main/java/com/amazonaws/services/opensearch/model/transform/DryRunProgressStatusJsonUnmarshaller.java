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
package com.amazonaws.services.opensearch.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.opensearch.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DryRunProgressStatus JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DryRunProgressStatusJsonUnmarshaller implements Unmarshaller<DryRunProgressStatus, JsonUnmarshallerContext> {

    public DryRunProgressStatus unmarshall(JsonUnmarshallerContext context) throws Exception {
        DryRunProgressStatus dryRunProgressStatus = new DryRunProgressStatus();

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
                if (context.testExpression("DryRunId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dryRunProgressStatus.setDryRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DryRunStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dryRunProgressStatus.setDryRunStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dryRunProgressStatus.setCreationDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UpdateDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dryRunProgressStatus.setUpdateDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ValidationFailures", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    dryRunProgressStatus.setValidationFailures(new ListUnmarshaller<ValidationFailure>(ValidationFailureJsonUnmarshaller.getInstance())

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

        return dryRunProgressStatus;
    }

    private static DryRunProgressStatusJsonUnmarshaller instance;

    public static DryRunProgressStatusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DryRunProgressStatusJsonUnmarshaller();
        return instance;
    }
}
