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
 * SourceServer JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SourceServerJsonUnmarshaller implements Unmarshaller<SourceServer, JsonUnmarshallerContext> {

    public SourceServer unmarshall(JsonUnmarshallerContext context) throws Exception {
        SourceServer sourceServer = new SourceServer();

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
                    sourceServer.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("dataReplicationInfo", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setDataReplicationInfo(DataReplicationInfoJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("lastLaunchResult", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setLastLaunchResult(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lifeCycle", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setLifeCycle(LifeCycleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("recoveryInstanceId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setRecoveryInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("replicationDirection", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setReplicationDirection(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("reversedDirectionSourceServerArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setReversedDirectionSourceServerArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceCloudProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setSourceCloudProperties(SourceCloudPropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceNetworkID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setSourceNetworkID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceProperties", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setSourceProperties(SourcePropertiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sourceServerID", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setSourceServerID(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stagingArea", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setStagingArea(StagingAreaJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    sourceServer.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
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

        return sourceServer;
    }

    private static SourceServerJsonUnmarshaller instance;

    public static SourceServerJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SourceServerJsonUnmarshaller();
        return instance;
    }
}
