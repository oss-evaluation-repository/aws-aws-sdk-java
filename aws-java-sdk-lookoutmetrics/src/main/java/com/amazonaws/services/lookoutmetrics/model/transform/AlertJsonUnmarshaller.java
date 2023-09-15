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
package com.amazonaws.services.lookoutmetrics.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lookoutmetrics.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Alert JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlertJsonUnmarshaller implements Unmarshaller<Alert, JsonUnmarshallerContext> {

    public Alert unmarshall(JsonUnmarshallerContext context) throws Exception {
        Alert alert = new Alert();

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
                if (context.testExpression("Action", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setAction(ActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("AlertDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setAlertDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlertArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setAlertArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AnomalyDetectorArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setAnomalyDetectorArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlertName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setAlertName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlertSensitivityThreshold", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setAlertSensitivityThreshold(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("AlertType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setAlertType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlertStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setAlertStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastModificationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setLastModificationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AlertFilters", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    alert.setAlertFilters(AlertFiltersJsonUnmarshaller.getInstance().unmarshall(context));
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

        return alert;
    }

    private static AlertJsonUnmarshaller instance;

    public static AlertJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AlertJsonUnmarshaller();
        return instance;
    }
}
