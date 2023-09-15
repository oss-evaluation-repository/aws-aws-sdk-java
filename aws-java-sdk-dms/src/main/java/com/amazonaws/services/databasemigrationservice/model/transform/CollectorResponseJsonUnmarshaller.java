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
package com.amazonaws.services.databasemigrationservice.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CollectorResponse JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CollectorResponseJsonUnmarshaller implements Unmarshaller<CollectorResponse, JsonUnmarshallerContext> {

    public CollectorResponse unmarshall(JsonUnmarshallerContext context) throws Exception {
        CollectorResponse collectorResponse = new CollectorResponse();

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
                if (context.testExpression("CollectorReferencedId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setCollectorReferencedId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CollectorName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setCollectorName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CollectorVersion", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setCollectorVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VersionStatus", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setVersionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Description", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("S3BucketName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setS3BucketName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceAccessRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setServiceAccessRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CollectorHealthCheck", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setCollectorHealthCheck(CollectorHealthCheckJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("LastDataReceived", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setLastDataReceived(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RegisteredDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setRegisteredDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setCreatedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ModifiedDate", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setModifiedDate(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InventoryData", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    collectorResponse.setInventoryData(InventoryDataJsonUnmarshaller.getInstance().unmarshall(context));
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

        return collectorResponse;
    }

    private static CollectorResponseJsonUnmarshaller instance;

    public static CollectorResponseJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CollectorResponseJsonUnmarshaller();
        return instance;
    }
}
