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
package com.amazonaws.services.finspace.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.finspace.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * KxCluster JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxClusterJsonUnmarshaller implements Unmarshaller<KxCluster, JsonUnmarshallerContext> {

    public KxCluster unmarshall(JsonUnmarshallerContext context) throws Exception {
        KxCluster kxCluster = new KxCluster();

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
                if (context.testExpression("status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusReason", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setStatusReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setClusterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setClusterType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("clusterDescription", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setClusterDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("releaseLabel", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setReleaseLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("initializationScript", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setInitializationScript(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("executionRole", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setExecutionRole(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("azMode", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setAzMode(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("availabilityZoneId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setAvailabilityZoneId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastModifiedTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setLastModifiedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("createdTimestamp", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    kxCluster.setCreatedTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
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

        return kxCluster;
    }

    private static KxClusterJsonUnmarshaller instance;

    public static KxClusterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new KxClusterJsonUnmarshaller();
        return instance;
    }
}
