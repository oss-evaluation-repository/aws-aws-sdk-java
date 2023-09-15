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
package com.amazonaws.services.iot.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateSecurityProfileResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSecurityProfileResultJsonUnmarshaller implements Unmarshaller<UpdateSecurityProfileResult, JsonUnmarshallerContext> {

    public UpdateSecurityProfileResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateSecurityProfileResult updateSecurityProfileResult = new UpdateSecurityProfileResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateSecurityProfileResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("securityProfileName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setSecurityProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityProfileArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setSecurityProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("securityProfileDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setSecurityProfileDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("behaviors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setBehaviors(new ListUnmarshaller<Behavior>(BehaviorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("alertTargets", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setAlertTargets(new MapUnmarshaller<String, AlertTarget>(context.getUnmarshaller(String.class),
                            AlertTargetJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("additionalMetricsToRetain", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setAdditionalMetricsToRetain(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("additionalMetricsToRetainV2", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setAdditionalMetricsToRetainV2(new ListUnmarshaller<MetricToRetain>(MetricToRetainJsonUnmarshaller
                            .getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("creationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setCreationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    updateSecurityProfileResult.setLastModifiedDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return updateSecurityProfileResult;
    }

    private static UpdateSecurityProfileResultJsonUnmarshaller instance;

    public static UpdateSecurityProfileResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateSecurityProfileResultJsonUnmarshaller();
        return instance;
    }
}
