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
package com.amazonaws.services.mgn.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mgn.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * StopReplicationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopReplicationResultJsonUnmarshaller implements Unmarshaller<StopReplicationResult, JsonUnmarshallerContext> {

    public StopReplicationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        StopReplicationResult stopReplicationResult = new StopReplicationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return stopReplicationResult;
        }

        boolean knownMember;

        while (true) {
            if (token == null)
                break;

            knownMember = false;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("applicationID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setApplicationID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataReplicationInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setDataReplicationInfo(DataReplicationInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("fqdnForActionFramework", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setFqdnForActionFramework(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isArchived", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setIsArchived(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("launchedInstance", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setLaunchedInstance(LaunchedInstanceJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lifeCycle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setLifeCycle(LifeCycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("replicationType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setReplicationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setSourceProperties(SourcePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceServerID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setSourceServerID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("userProvidedID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setUserProvidedID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("vcenterClientID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    stopReplicationResult.setVcenterClientID(context.getUnmarshaller(String.class).unmarshall(context));
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

        return stopReplicationResult;
    }

    private static StopReplicationResultJsonUnmarshaller instance;

    public static StopReplicationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new StopReplicationResultJsonUnmarshaller();
        return instance;
    }
}
