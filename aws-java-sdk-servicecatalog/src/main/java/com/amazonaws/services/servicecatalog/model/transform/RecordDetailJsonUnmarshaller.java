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
package com.amazonaws.services.servicecatalog.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RecordDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordDetailJsonUnmarshaller implements Unmarshaller<RecordDetail, JsonUnmarshallerContext> {

    public RecordDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        RecordDetail recordDetail = new RecordDetail();

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
                if (context.testExpression("RecordId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setRecordId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedProductName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setProvisionedProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("UpdatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setUpdatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("ProvisionedProductType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setProvisionedProductType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecordType", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setRecordType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisionedProductId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setProvisionedProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifactId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setProvisioningArtifactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("PathId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setPathId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RecordErrors", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setRecordErrors(new ListUnmarshaller<RecordError>(RecordErrorJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("RecordTags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setRecordTags(new ListUnmarshaller<RecordTag>(RecordTagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("LaunchRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    recordDetail.setLaunchRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return recordDetail;
    }

    private static RecordDetailJsonUnmarshaller instance;

    public static RecordDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RecordDetailJsonUnmarshaller();
        return instance;
    }
}
