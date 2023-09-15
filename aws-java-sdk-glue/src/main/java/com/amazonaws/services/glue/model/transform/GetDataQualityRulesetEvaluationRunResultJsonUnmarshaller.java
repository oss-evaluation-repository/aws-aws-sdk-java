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
package com.amazonaws.services.glue.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GetDataQualityRulesetEvaluationRunResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDataQualityRulesetEvaluationRunResultJsonUnmarshaller implements
        Unmarshaller<GetDataQualityRulesetEvaluationRunResult, JsonUnmarshallerContext> {

    public GetDataQualityRulesetEvaluationRunResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetDataQualityRulesetEvaluationRunResult getDataQualityRulesetEvaluationRunResult = new GetDataQualityRulesetEvaluationRunResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getDataQualityRulesetEvaluationRunResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("RunId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setRunId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DataSource", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setDataSource(DataSourceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Role", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("NumberOfWorkers", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setNumberOfWorkers(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Timeout", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setTimeout(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AdditionalRunOptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setAdditionalRunOptions(DataQualityEvaluationRunAdditionalRunOptionsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ErrorString", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setErrorString(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setStartedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setLastModifiedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CompletedOn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setCompletedOn(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ExecutionTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setExecutionTime(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("RulesetNames", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setRulesetNames(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("ResultIds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setResultIds(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AdditionalDataSources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    getDataQualityRulesetEvaluationRunResult.setAdditionalDataSources(new MapUnmarshaller<String, DataSource>(context
                            .getUnmarshaller(String.class), DataSourceJsonUnmarshaller.getInstance()).unmarshall(context));
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

        return getDataQualityRulesetEvaluationRunResult;
    }

    private static GetDataQualityRulesetEvaluationRunResultJsonUnmarshaller instance;

    public static GetDataQualityRulesetEvaluationRunResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetDataQualityRulesetEvaluationRunResultJsonUnmarshaller();
        return instance;
    }
}
