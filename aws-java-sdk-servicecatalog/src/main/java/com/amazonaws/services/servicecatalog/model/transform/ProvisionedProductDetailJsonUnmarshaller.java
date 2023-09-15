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
 * ProvisionedProductDetail JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedProductDetailJsonUnmarshaller implements Unmarshaller<ProvisionedProductDetail, JsonUnmarshallerContext> {

    public ProvisionedProductDetail unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProvisionedProductDetail provisionedProductDetail = new ProvisionedProductDetail();

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
                if (context.testExpression("Name", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IdempotencyToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setIdempotencyToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastRecordId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setLastRecordId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastProvisioningRecordId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setLastProvisioningRecordId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulProvisioningRecordId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setLastSuccessfulProvisioningRecordId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifactId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setProvisioningArtifactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LaunchRoleArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductDetail.setLaunchRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
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

        return provisionedProductDetail;
    }

    private static ProvisionedProductDetailJsonUnmarshaller instance;

    public static ProvisionedProductDetailJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductDetailJsonUnmarshaller();
        return instance;
    }
}
