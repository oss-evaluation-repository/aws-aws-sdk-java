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
package com.amazonaws.services.sagemakergeospatial.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemakergeospatial.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StartEarthObservationJobResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartEarthObservationJobResultJsonUnmarshaller implements Unmarshaller<StartEarthObservationJobResult, JsonUnmarshallerContext> {

    public StartEarthObservationJobResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StartEarthObservationJobResult startEarthObservationJobResult = new StartEarthObservationJobResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return startEarthObservationJobResult;
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
                    startEarthObservationJobResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startEarthObservationJobResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                }
                if (context.testExpression("DurationInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startEarthObservationJobResult.setDurationInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ExecutionRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startEarthObservationJobResult.setExecutionRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InputConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startEarthObservationJobResult.setInputConfig(InputConfigOutputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("JobConfig", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startEarthObservationJobResult.setJobConfig(JobConfigInputJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KmsKeyId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startEarthObservationJobResult.setKmsKeyId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startEarthObservationJobResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startEarthObservationJobResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    startEarthObservationJobResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
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

        return startEarthObservationJobResult;
    }

    private static StartEarthObservationJobResultJsonUnmarshaller instance;

    public static StartEarthObservationJobResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StartEarthObservationJobResultJsonUnmarshaller();
        return instance;
    }
}
