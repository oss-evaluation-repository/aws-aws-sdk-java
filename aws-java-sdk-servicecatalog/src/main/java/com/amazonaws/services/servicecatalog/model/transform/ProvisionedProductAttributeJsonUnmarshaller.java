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
 * ProvisionedProductAttribute JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProvisionedProductAttributeJsonUnmarshaller implements Unmarshaller<ProvisionedProductAttribute, JsonUnmarshallerContext> {

    public ProvisionedProductAttribute unmarshall(JsonUnmarshallerContext context) throws Exception {
        ProvisionedProductAttribute provisionedProductAttribute = new ProvisionedProductAttribute();

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
                    provisionedProductAttribute.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Arn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Type", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Id", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StatusMessage", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedTime", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setCreatedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("IdempotencyToken", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setIdempotencyToken(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastRecordId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setLastRecordId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastProvisioningRecordId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setLastProvisioningRecordId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastSuccessfulProvisioningRecordId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setLastSuccessfulProvisioningRecordId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Tags", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("PhysicalId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setPhysicalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setProductId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProductName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setProductName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifactId", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setProvisioningArtifactId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProvisioningArtifactName", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setProvisioningArtifactName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserArn", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setUserArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("UserArnSession", targetDepth)) {
                    knownMember = true;
                    context.nextToken();
                    provisionedProductAttribute.setUserArnSession(context.getUnmarshaller(String.class).unmarshall(context));
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

        return provisionedProductAttribute;
    }

    private static ProvisionedProductAttributeJsonUnmarshaller instance;

    public static ProvisionedProductAttributeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ProvisionedProductAttributeJsonUnmarshaller();
        return instance;
    }
}
