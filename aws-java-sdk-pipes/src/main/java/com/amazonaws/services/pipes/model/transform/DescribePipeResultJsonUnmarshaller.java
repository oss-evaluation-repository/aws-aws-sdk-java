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
package com.amazonaws.services.pipes.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribePipeResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePipeResultJsonUnmarshaller implements Unmarshaller<DescribePipeResult, JsonUnmarshallerContext> {

    public DescribePipeResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribePipeResult describePipeResult = new DescribePipeResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describePipeResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CurrentState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setCurrentState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DesiredState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setDesiredState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Enrichment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setEnrichment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EnrichmentParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setEnrichmentParameters(PipeEnrichmentParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setSource(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setSourceParameters(PipeSourceParametersJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("StateReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setStateReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult
                            .setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                                    .unmarshall(context));
                }
                if (context.testExpression("Target", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TargetParameters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    describePipeResult.setTargetParameters(PipeTargetParametersJsonUnmarshaller.getInstance().unmarshall(context));
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

        return describePipeResult;
    }

    private static DescribePipeResultJsonUnmarshaller instance;

    public static DescribePipeResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribePipeResultJsonUnmarshaller();
        return instance;
    }
}
