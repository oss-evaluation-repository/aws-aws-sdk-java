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
package com.amazonaws.services.comprehend.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EndpointProperties JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointPropertiesJsonUnmarshaller implements Unmarshaller<EndpointProperties, JsonUnmarshallerContext> {

    public EndpointProperties unmarshall(JsonUnmarshallerContext context) throws Exception {
        EndpointProperties endpointProperties = new EndpointProperties();

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
                if (context.testExpression("EndpointArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setEndpointArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Message", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DesiredModelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setDesiredModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DesiredInferenceUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setDesiredInferenceUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CurrentInferenceUnits", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setCurrentInferenceUnits(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("DataAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DesiredDataAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setDesiredDataAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FlywheelArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    endpointProperties.setFlywheelArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return endpointProperties;
    }

    private static EndpointPropertiesJsonUnmarshaller instance;

    public static EndpointPropertiesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EndpointPropertiesJsonUnmarshaller();
        return instance;
    }
}
