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
package com.amazonaws.services.finspacedata.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspacedata.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ChangesetSummary JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangesetSummaryJsonUnmarshaller implements Unmarshaller<ChangesetSummary, JsonUnmarshallerContext> {

    public ChangesetSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        ChangesetSummary changesetSummary = new ChangesetSummary();

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
                if (context.testExpression("changesetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setChangesetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("changesetArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setChangesetArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("datasetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setDatasetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("changeType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setChangeType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceParams", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setSourceParams(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("formatParams", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setFormatParams(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("createTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setCreateTime(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("errorInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setErrorInfo(ChangesetErrorInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activeUntilTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setActiveUntilTimestamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("activeFromTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setActiveFromTimestamp(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("updatesChangesetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setUpdatesChangesetId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("updatedByChangesetId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    changesetSummary.setUpdatedByChangesetId(context.getUnmarshaller(String.class).unmarshall(context));
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

        return changesetSummary;
    }

    private static ChangesetSummaryJsonUnmarshaller instance;

    public static ChangesetSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ChangesetSummaryJsonUnmarshaller();
        return instance;
    }
}
