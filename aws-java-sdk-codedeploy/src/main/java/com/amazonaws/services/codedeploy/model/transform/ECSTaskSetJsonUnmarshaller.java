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
package com.amazonaws.services.codedeploy.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ECSTaskSet JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ECSTaskSetJsonUnmarshaller implements Unmarshaller<ECSTaskSet, JsonUnmarshallerContext> {

    public ECSTaskSet unmarshall(JsonUnmarshallerContext context) throws Exception {
        ECSTaskSet eCSTaskSet = new ECSTaskSet();

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
                if (context.testExpression("identifer", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eCSTaskSet.setIdentifer(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("desiredCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eCSTaskSet.setDesiredCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("pendingCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eCSTaskSet.setPendingCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("runningCount", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eCSTaskSet.setRunningCount(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eCSTaskSet.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("trafficWeight", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eCSTaskSet.setTrafficWeight(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("targetGroup", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eCSTaskSet.setTargetGroup(TargetGroupInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskSetLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    eCSTaskSet.setTaskSetLabel(context.getUnmarshaller(String.class).unmarshall(context));
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

        return eCSTaskSet;
    }

    private static ECSTaskSetJsonUnmarshaller instance;

    public static ECSTaskSetJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ECSTaskSetJsonUnmarshaller();
        return instance;
    }
}
