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
package com.amazonaws.services.appflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ConnectorProfile JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectorProfileJsonUnmarshaller implements Unmarshaller<ConnectorProfile, JsonUnmarshallerContext> {

    public ConnectorProfile unmarshall(JsonUnmarshallerContext context) throws Exception {
        ConnectorProfile connectorProfile = new ConnectorProfile();

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
                if (context.testExpression("connectorProfileArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile.setConnectorProfileArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorProfileName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile.setConnectorProfileName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile.setConnectorType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile.setConnectorLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile.setConnectionMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("credentialsArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile.setCredentialsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectorProfileProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile.setConnectorProfileProperties(ConnectorProfilePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("privateConnectionProvisioningState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    connectorProfile
                            .setPrivateConnectionProvisioningState(PrivateConnectionProvisioningStateJsonUnmarshaller.getInstance().unmarshall(context));
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

        return connectorProfile;
    }

    private static ConnectorProfileJsonUnmarshaller instance;

    public static ConnectorProfileJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ConnectorProfileJsonUnmarshaller();
        return instance;
    }
}
