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
package com.amazonaws.services.codebuild.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * BuildPhase JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildPhaseJsonUnmarshaller implements Unmarshaller<BuildPhase, JsonUnmarshallerContext> {

    public BuildPhase unmarshall(JsonUnmarshallerContext context) throws Exception {
        BuildPhase buildPhase = new BuildPhase();

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
                if (context.testExpression("phaseType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    buildPhase.setPhaseType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("phaseStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    buildPhase.setPhaseStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    buildPhase.setStartTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("endTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    buildPhase.setEndTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("durationInSeconds", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    buildPhase.setDurationInSeconds(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("contexts", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    buildPhase.setContexts(new ListUnmarshaller<PhaseContext>(PhaseContextJsonUnmarshaller.getInstance())

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

        return buildPhase;
    }

    private static BuildPhaseJsonUnmarshaller instance;

    public static BuildPhaseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BuildPhaseJsonUnmarshaller();
        return instance;
    }
}
