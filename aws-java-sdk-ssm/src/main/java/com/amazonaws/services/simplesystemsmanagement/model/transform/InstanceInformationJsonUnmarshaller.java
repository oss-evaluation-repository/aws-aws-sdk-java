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
package com.amazonaws.services.simplesystemsmanagement.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simplesystemsmanagement.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * InstanceInformation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceInformationJsonUnmarshaller implements Unmarshaller<InstanceInformation, JsonUnmarshallerContext> {

    public InstanceInformation unmarshall(JsonUnmarshallerContext context) throws Exception {
        InstanceInformation instanceInformation = new InstanceInformation();

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
                if (context.testExpression("InstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PingStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setPingStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastPingDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setLastPingDateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AgentVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setAgentVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IsLatestVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setIsLatestVersion(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("PlatformType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setPlatformType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setPlatformName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PlatformVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setPlatformVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ActivationId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setActivationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IamRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setIamRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegistrationDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setRegistrationDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setResourceType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("IPAddress", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setIPAddress(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComputerName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setComputerName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AssociationStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setAssociationStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastAssociationExecutionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setLastAssociationExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulAssociationExecutionDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setLastSuccessfulAssociationExecutionDate(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("AssociationOverview", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setAssociationOverview(InstanceAggregatedAssociationOverviewJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("SourceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setSourceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("SourceType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    instanceInformation.setSourceType(context.getUnmarshaller(String.class).unmarshall(context));
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

        return instanceInformation;
    }

    private static InstanceInformationJsonUnmarshaller instance;

    public static InstanceInformationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new InstanceInformationJsonUnmarshaller();
        return instance;
    }
}
