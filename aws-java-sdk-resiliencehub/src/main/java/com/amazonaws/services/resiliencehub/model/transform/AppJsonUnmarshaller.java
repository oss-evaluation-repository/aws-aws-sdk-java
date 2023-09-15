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
package com.amazonaws.services.resiliencehub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.resiliencehub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * App JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppJsonUnmarshaller implements Unmarshaller<App, JsonUnmarshallerContext> {

    public App unmarshall(JsonUnmarshallerContext context) throws Exception {
        App app = new App();

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
                if (context.testExpression("appArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setAppArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentSchedule", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setAssessmentSchedule(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("complianceStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setComplianceStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("creationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("driftStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setDriftStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("eventSubscriptions", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setEventSubscriptions(new ListUnmarshaller<EventSubscription>(EventSubscriptionJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("lastAppComplianceEvaluationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setLastAppComplianceEvaluationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastDriftEvaluationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setLastDriftEvaluationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastResiliencyScoreEvaluationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setLastResiliencyScoreEvaluationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("permissionModel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setPermissionModel(PermissionModelJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("policyArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setPolicyArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resiliencyScore", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setResiliencyScore(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    app.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return app;
    }

    private static AppJsonUnmarshaller instance;

    public static AppJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AppJsonUnmarshaller();
        return instance;
    }
}
