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
package com.amazonaws.services.drs.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.drs.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecoveryInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecoveryInstanceJsonUnmarshaller implements Unmarshaller<RecoveryInstance, JsonUnmarshallerContext> {

    public RecoveryInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecoveryInstance recoveryInstance = new RecoveryInstance();

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
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataReplicationInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setDataReplicationInfo(RecoveryInstanceDataReplicationInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ec2InstanceID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setEc2InstanceID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ec2InstanceState", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setEc2InstanceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("failback", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setFailback(RecoveryInstanceFailbackJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("isDrill", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setIsDrill(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("jobID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setJobID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("originAvailabilityZone", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setOriginAvailabilityZone(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("originEnvironment", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setOriginEnvironment(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pointInTimeSnapshotDateTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setPointInTimeSnapshotDateTime(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recoveryInstanceID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setRecoveryInstanceID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("recoveryInstanceProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setRecoveryInstanceProperties(RecoveryInstancePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceServerID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setSourceServerID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recoveryInstance.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return recoveryInstance;
    }

    private static RecoveryInstanceJsonUnmarshaller instance;

    public static RecoveryInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecoveryInstanceJsonUnmarshaller();
        return instance;
    }
}
