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
package com.amazonaws.services.robomaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateRobotApplicationVersionResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRobotApplicationVersionResultJsonUnmarshaller implements Unmarshaller<CreateRobotApplicationVersionResult, JsonUnmarshallerContext> {

    public CreateRobotApplicationVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateRobotApplicationVersionResult createRobotApplicationVersionResult = new CreateRobotApplicationVersionResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createRobotApplicationVersionResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createRobotApplicationVersionResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createRobotApplicationVersionResult.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createRobotApplicationVersionResult.setVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createRobotApplicationVersionResult.setSources(new ListUnmarshaller<Source>(SourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("robotSoftwareSuite", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createRobotApplicationVersionResult.setRobotSoftwareSuite(RobotSoftwareSuiteJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createRobotApplicationVersionResult.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("revisionId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createRobotApplicationVersionResult.setRevisionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("environment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    createRobotApplicationVersionResult.setEnvironment(EnvironmentJsonUnmarshaller.getInstance().unmarshall(context));
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

        return createRobotApplicationVersionResult;
    }

    private static CreateRobotApplicationVersionResultJsonUnmarshaller instance;

    public static CreateRobotApplicationVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateRobotApplicationVersionResultJsonUnmarshaller();
        return instance;
    }
}
